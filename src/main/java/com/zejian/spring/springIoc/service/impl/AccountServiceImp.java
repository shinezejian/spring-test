package com.zejian.spring.springIoc.service.impl;

import com.zejian.spring.springIoc.dao.AccountDao;
import com.zejian.spring.springIoc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zejian on 2017/1/15.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class AccountServiceImp implements AccountService{
    /**
     * 标注在成员变量
     */
    @Autowired(required = false)
    private AccountDao accountDao;

    /**
     * 标注在构造函数上
     */
    @Autowired
    public AccountServiceImp(AccountDao accountDao){
        this.accountDao=accountDao;
    }

    /**
     * 标注在set方法上
     * @param accountDao
     */
    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void doSomething() {
        System.out.println("AccountServiceImpl#doSomething......");
    }
}
