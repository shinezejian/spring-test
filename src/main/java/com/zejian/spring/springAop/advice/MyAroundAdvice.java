package com.zejian.spring.springAop.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by zejian on 2017/1/10.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 * 环绕通知
 */
public class MyAroundAdvice implements MethodInterceptor {

    /**
     * @param methodInvocation 提供调用目标对象的方法的接口类
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前增强...");
        //执行目标方法,此步骤可以决定目标对象的方法是否执行
        Object result = methodInvocation.proceed();// 执行目标对象的方法
        System.out.println("环绕后增强...");
        return result;
    }
}
