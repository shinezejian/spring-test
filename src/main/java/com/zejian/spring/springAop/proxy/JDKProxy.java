package com.zejian.spring.springAop.proxy;

import com.zejian.spring.springAop.dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zejian on 2017/1/9.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 * JDK 动态代理
 */
public class JDKProxy implements InvocationHandler {

    /**
     * 要被代理的目标对象
     */
    private UserDao target;

    public JDKProxy(UserDao target){
        this.target=target;
    }

    /**
     * 创建代理类
     * @return
     */
    public UserDao createProxy(){
        return (UserDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }



    /**
     * 调用被代理类(目标对象)的任意方法都会触发invoke方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if("addUser".equals(method.getName())){
            // 记录日志:
            System.out.println("日志记录======");

            //调用目标对象的方法
            Object result = method.invoke(target, args);
            return result;
        }
        return method.invoke(target, args);
    }
}
