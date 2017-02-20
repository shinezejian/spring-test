package com.zejian.spring.springAop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by zejian on 2017/1/10.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 * 前置通知,在方法(切点方法)之前执行
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

    /**
     * @param method 被增强的方法,即切点方法
     * @param objects 切点方法的参数
     * @param o 被代理对象,即目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强...");
        System.out.println("method:"+method.getName());
        System.out.println("o:"+o.getClass().getName());
        System.out.println("objects:"+((objects!=null&&objects.length>0) ? objects[0] : null) );
    }
}
