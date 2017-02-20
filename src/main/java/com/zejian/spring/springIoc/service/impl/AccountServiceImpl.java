package com.zejian.spring.springIoc.service.impl;

import com.zejian.spring.springIoc.dao.AccountDao;
import com.zejian.spring.springIoc.service.AccountService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by zejian on 2017/1/15.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
@Service
public class AccountServiceImpl implements AccountService , ApplicationContextAware {
    private ApplicationContext applicationContext;
    /**
     * 需要注入的对象
     */
    @Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void doSomething() {
        System.out.println("AccountServiceImpl#doSomething......");
        System.out.println("getAccountDao....."+ getAccountDao().toString());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    private AccountDao getAccountDao(){
        return applicationContext.getBean(AccountDao.class);
    }
}
