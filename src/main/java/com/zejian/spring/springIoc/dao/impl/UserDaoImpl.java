package com.zejian.spring.springIoc.dao.impl;


import com.zejian.spring.springIoc.dao.UserDao;

/**
 * Created by zejian on 2017/1/18.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class UserDaoImpl implements UserDao{
    //.......
    @Override
    public void done(){
        System.out.println("UserDaoImpl.invoke......");
    }
}
