package com.zejian.spring.springAop.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zejian on 2017/1/11.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-aspectj-xml.xml")
public class ProductDaoAspectJXML {

    @Autowired
    ProductDao productDao;

    @Test
    public void aspectJTest(){
        try {
            productDao.add();
        }catch (Exception e){

        }

        productDao.delete();
    }

}
