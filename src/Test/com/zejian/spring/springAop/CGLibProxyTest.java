package com.zejian.spring.springAop;

import com.zejian.spring.springAop.dao.daoimp.AdminDaoImp;
import com.zejian.spring.springAop.proxy.CGLibProxy;
import org.junit.Test;

/**
 * Created by zejian on 2017/1/9.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class CGLibProxyTest {

    @Test
    public void testCreateProxy() throws Exception {
        AdminDaoImp adminDaoImp=new AdminDaoImp();

        CGLibProxy cgLibProxy=new CGLibProxy(adminDaoImp);

        AdminDaoImp proxy=cgLibProxy.createProxy();

        proxy.addAdmin();
    }
}