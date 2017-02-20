package com.zejian.spring.springIoc.dao.impl;

import com.zejian.spring.springIoc.dao.AccountDao;

/**
 * Created by zejian on 2017/1/15.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class AccountDaoImpl implements AccountDao{

    @Override
    public void addAccount() {
        System.out.println("addAccount....");
    }
}
