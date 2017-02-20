package com.zejian.spring.springAop.dao.daoimp;

import com.zejian.spring.springAop.dao.ProductDao;

/**
 * Created by zejian on 2017/1/11.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class ProductDaoImpl implements ProductDao {
    @Override
    public void add() {
      //  try {
//            int i=4/0;
//        }catch (Exception e){
//
//        }

        System.out.println("添加产品");
    }

    @Override
    public Integer delete() {
        System.out.println("删除产品");
        return 1;
    }
}
