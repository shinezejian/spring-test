package com.zejian.spring.springAop.AspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zejian on 2017/1/10.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 *
 *  @Before 前置通知，相当于BeforeAdvice
 * 就在方法之前执行.没有办法阻止目标方法执行的.
   @AfterReturning 后置通知，相当于AfterReturningAdvice
  * 后置通知,获得方法返回值.
   @Around 环绕通知，相当于MethodInterceptor
  * 在可以方法之前和之后来执行的,而且可以阻止目标方法的执行.
   @AfterThrowing抛出通知，相当于ThrowAdvice
 *
 */
@Aspect
public class MyAspect {

    /**
     * 前置通知
     */
    @Before("execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..)) && args(id,name)")
    public void before(int id,String name){
        System.out.println("前置通知....userId:"+id+" name="+name);
    }

    /**
     * 后置通知
     * returnVal,切点方法执行后的返回值
     */
    @AfterReturning(value="execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..))",returning = "returnVal")
    public void AfterReturning(Object returnVal){
        System.out.println("后置通知...."+returnVal);
    }


    /**
     * 环绕通知
     * @param joinPoint 可用于执行切点的类
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前....");
        Object obj= (Object) joinPoint.proceed();
        System.out.println("环绕通知后....");
        return obj;
    }

    /**
     * 抛出通知
     * @param e
     */
    @AfterThrowing(value="execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..))",throwing = "e")
    public void afterThrowable(Throwable e){
        System.out.println("出现异常:msg="+e.getMessage());
    }

    /**
     * 无论什么情况下都会执行的方法
     */
    @After(value="execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..))")
    public void after(){
        System.out.println("最终通知....");
    }



    /**
     * 使用Pointcut定义切点
     */
    @Pointcut("execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..))")
    private void myPointcut(){}



    @Pointcut("bean(*Service)")
    private void myPointcut1(){}

    //匹配了任意实现了UserDao接口的代理对象的方法进行过滤
    @Pointcut("this(com.zejian.spring.springAop.dao.UserDao)")
    private void myPointcut2(){}

    //匹配了任意实现了UserDao接口的目标对象的方法进行过滤
    @Pointcut("target(com.zejian.spring.springAop.dao.UserDao))")
    private void myPointcut3(){}

    @Pointcut("target(com.zejian.spring.springAop.dao.UserDao)!within(com.zejian.dao..*)")
    private void myPointcut6(){}

    @Pointcut("target(com.zejian.spring.springAop.dao.UserDao)&&execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..))")
    private void myPointcut7(){}

//    //匹配使用了MarkerAnnotation注解的类
//    @Pointcut("@within(com.zejian.spring.annotation.MarkerAnnotation)")
//    private void myPointcut4(){}

    /**
     * 应用切入点函数
     */

    @After(value="myPointcut()")
    public void afterDemo(){
        System.out.println("最终通知....");
    }
}
