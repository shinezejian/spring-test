package com.zejian.spring.oopTest;

/**
 * Created by zejian on 2017/2/9.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class B extends C implements ExInterface{

    public void execute(){
//        AuthCheck.authCheck();//权限验证
//        Report.recordLog();//记录日志上报
        System.out.println("执行A的execute方法...");
        //其他业务需求...
    }

}
