package com.zejian.spring.springAop;

import com.zejian.spring.springAop.dao.UserDao;
import com.zejian.spring.springAop.dao.daoimp.UserDaoImp;
import com.zejian.spring.springAop.proxy.JDKProxy;
import org.junit.Test;

/**
 * Created by zejian on 2017/1/9.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class JDKProxyTest {

    @Test
    public void testCreateProxy() throws Exception {
        UserDao userDao=new UserDaoImp();

        JDKProxy jdkProxy=new JDKProxy(userDao);

        UserDao proxy = jdkProxy.createProxy();

//        proxy.addUser(9999);
    }
}