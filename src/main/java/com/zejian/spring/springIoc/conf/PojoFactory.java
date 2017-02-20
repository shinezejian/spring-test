package com.zejian.spring.springIoc.conf;

import com.zejian.spring.springIoc.pojo.Account;

/**
 * Created by zejian on 2017/1/16.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class PojoFactory {

    /**
     * 静态工厂创建
     * @return
     */
    public static Account createAccount(){
        Account account=new Account();
        account.setName("Jack");
        account.setPwd("1234");
        return account;
    }

    /**
     * 通过工厂实例创建
     * @return
     */
    public  Account createAccount2(){
        Account account=new Account();
        account.setName("Jack");
        account.setPwd("1234");
        return account;
    }
}
