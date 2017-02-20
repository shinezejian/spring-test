package com.zejian.spring.springIoc.conf;

import com.zejian.spring.springIoc.dao.AccountDao;
import com.zejian.spring.springIoc.dao.impl.AccountDaoImpl;
import com.zejian.spring.springIoc.service.AccountService;
import com.zejian.spring.springIoc.service.impl.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zejian on 2017/1/15.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public AccountDao accountDao(){
        return new AccountDaoImpl();
    }

    @Bean
    public AccountService accountService(){
        AccountServiceImpl bean=new AccountServiceImpl();
        //注入dao
        bean.setAccountDao(accountDao());
        return bean;
    }

}
