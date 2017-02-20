package com.zejian.spring.springAop.dao;

/**
 * Created by zejian on 2017/2/19.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public interface UserDao {

    int addUser(int userId,String name);

    void updateUser();

    void deleteUser();

    void findUser();
}
