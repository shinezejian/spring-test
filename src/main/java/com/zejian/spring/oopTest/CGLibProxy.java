package com.zejian.spring.oopTest;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zejian on 2017/1/9.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 * CGLIB 动态代理
 */
public class CGLibProxy implements MethodInterceptor {

    /**
     * 被代理的目标类
     */
    private A target;

    public CGLibProxy(A target) {
        super();
        this.target = target;
    }

    /**
     * 创建代理类
     * @return
     */
    public A createProxy(){
        // 使用CGLIB生成代理:
        // 1.声明增强类实例,用于生产代理类
        Enhancer enhancer = new Enhancer();
        // 2.设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
        enhancer.setSuperclass(target.getClass());
        // 3.//设置回调函数，即一个方法拦截
        enhancer.setCallback(this);
        // 4.创建代理:
        return (A) enhancer.create();
    }

    /**
     * 回调函数
     * @param proxy 代理对象
     * @param method 委托类方法
     * @param args 方法参数
     * @param methodProxy 每个被代理的方法都对应一个MethodProxy对象，
     *                    methodProxy.invokeSuper方法最终调用委托类(目标类)的addAdmin方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        //过滤不需要该业务的方法
        if("execute".equals(method.getName())) {
            //调用前验证权限(动态添加其他要执行业务)
            AuthCheck.authCheck();

            //调用目标对象的方法(执行A对象即被代理对象的execute方法)
            Object result = methodProxy.invokeSuper(proxy, args);

            //记录日志数据(动态添加其他要执行业务)
            Report.recordLog();

            return result;
        }else if("delete".equals(method.getName())){
            //.....
            return methodProxy.invokeSuper(proxy, args);
        }
        //如果不需要增强直接执行原方法
        return methodProxy.invokeSuper(proxy, args);

    }
}
