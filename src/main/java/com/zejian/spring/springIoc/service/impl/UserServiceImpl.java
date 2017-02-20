package com.zejian.spring.springIoc.service.impl;

import com.zejian.spring.springIoc.dao.UserDao;
import com.zejian.spring.springIoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by zejian on 2017/1/18.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class UserServiceImpl implements UserService {
    //标注成员变量
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Value("${jdbc.url}")
    private String url;

    @Value("#{configProperties['jdbc.username']}")
    private String userName;
//    //标注构造方法
//    @Autowired
//    public UserServiceImpl(UserDao userDao){
//        this.userDao=userDao;
//    }
//    //标注set方法
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void done(){
        System.out.println("url:"+url);
        System.out.println("username:"+userName);
        userDao.done();
    }
}
