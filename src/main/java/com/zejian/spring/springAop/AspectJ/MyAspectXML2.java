package com.zejian.spring.springAop.AspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.omg.CORBA.Object;
import org.springframework.core.Ordered;

/**
 * Created by zejian on 2017/1/11.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class MyAspectXML2 implements Ordered {


    public void before(){
        System.out.println("MyAspectXML2--->前置通知");
    }

//    public void afterReturn(Object returnVal){
//        System.out.println("后置通知-->返回值:"+returnVal);
//    }

    public void afterReturn(){
        System.out.println("MyAspectXML2---->后置通知");
    }
//    public void afterReturing(Object returnVal){
//        System.out.println("MyAspectXML2--->后置通知...返回值:"+returnVal);
//    }


    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("MyAspectXML2--->加强前");
        Object object= (Object) joinPoint.proceed();
        System.out.println("MyAspectXML2--->加强后");
        return object;
    }

    public void afterThrowing(Throwable throwable){
        String s=null;
//        s.toString();
        System.out.println("MyAspectXML2---->异常通知:"+ throwable.getMessage());
    }

    public void after(){
        System.out.println("MyAspectXML2--->最终通知..来了");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
