package com.zejian.spring.controller;

import com.zejian.spring.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzejian on 2017/2/20.
 * 简单模拟访问api
 */
public class UserController {

    /**
     * 获取用户列表
     * @return
     */
    public List<User> listUser(){
        System.out.println("listUser....");
        return new ArrayList<User>();
    }

}
