package com.zejian.spring.pojo;

import java.util.Date;

/**
 * Created by wuzejian on 2017/2/20.
 * 封装异常信息的类
 */
public class ExceptionInfo {

    private String className;
    private String methodName;
    private Date logTime;//异常记录时间
    private String message;//异常信息
    //.....其他属性

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
