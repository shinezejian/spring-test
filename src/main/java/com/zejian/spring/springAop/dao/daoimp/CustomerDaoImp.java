package com.zejian.spring.springAop.dao.daoimp;

import com.zejian.spring.springAop.dao.CustomerDao;

/**
 * Created by zejian on 2017/1/10.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class CustomerDaoImp implements CustomerDao {
    @Override
    public void add() {
        System.out.println("add customer ...");
    }

    @Override
    public void update() {
        System.out.println("update customer ...");
    }

    @Override
    public void delete() {
        System.out.println("delete customer ...");
    }

    @Override
    public void find() {
        System.out.println("find customer ...");
    }
}
