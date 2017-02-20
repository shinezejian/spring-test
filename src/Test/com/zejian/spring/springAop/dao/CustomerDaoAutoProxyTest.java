package com.zejian.spring.springAop.dao;

import com.zejian.spring.springAop.dao.daoimp.OrderDaoImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zejian on 2017/1/10.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 *   Autowired 单独出现时,默认按类名注入
 *
 *   Autowired
 *   Qualifier("customerDaoProxy") :按Qualifier标明的名称注入
 *
 *   Spring中的通知:(增强代码)
   前置通知 org.springframework.aop.MethodBeforeAdvice
 *   在目标方法执行前实施增强
   后置通知 org.springframework.aop.AfterReturningAdvice
 *   在目标方法执行后实施增强
   环绕通知 org.aopalliance.intercept.MethodInterceptor
 *   在目标方法执行前后实施增强
   异常抛出通知 org.springframework.aop.ThrowsAdvice
 *   在方法抛出异常后实施增强
   引介通知 org.springframework.aop.IntroductionInterceptor(少用)
 *    在目标类中添加一些新的方法和属性

 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/spring-auto-advicor.xml")
public class CustomerDaoAutoProxyTest {

    @Autowired
    // @Qualifier("customerDao")// 注入是真实的对象,必须注入代理对象.
    private CustomerDao customerDao;

    @Autowired
    OrderDaoImp orderDao;

    /**
     * 前置通知
     * @throws Exception
     */
    @Test
    public void testMethodBeforeAdvice() throws Exception {
        orderDao.addOrder();
        orderDao.deleteOrder();
    }
}