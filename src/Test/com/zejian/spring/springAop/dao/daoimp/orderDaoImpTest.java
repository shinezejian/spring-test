package com.zejian.spring.springAop.dao.daoimp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zejian on 2017/1/10.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-advicor.xml")
public class orderDaoImpTest {
    @Autowired
    @Qualifier("orderDaoImpProxy")
    OrderDaoImp orderDao;

    @Test
    public void testAdvisorAround(){
        orderDao.addOrder();
        orderDao.deleteOrder();
    }
}