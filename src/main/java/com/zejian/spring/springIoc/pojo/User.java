package com.zejian.spring.springIoc.pojo;

/**
 * Created by zejian on 2017/1/18.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class User {

    private String name;
    private int age;

    public User(String name , int age){
        this.name=name;
        this.age=age;
    }

    public User(int age,String name){
        this.name=name;
        this.age=age;
    }
}
