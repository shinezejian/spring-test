package com.zejian.spring.pojo;

import java.util.Date;

/**
 * Created by wuzejian on 2017/2/20.
 * 性能监控信息类，简单模拟
 */
public class MonitorTime {

    private String className;
    private String methodName;
    private Date logTime;
    private long comsumeTime;
    //......其他属性

    //省略set 和 get

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

    public long getComsumeTime() {
        return comsumeTime;
    }

    public void setComsumeTime(long comsumeTime) {
        this.comsumeTime = comsumeTime;
    }

    @Override
    public String toString() {
        return "MonitorTime{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", logTime=" + logTime +
                ", comsumeTime=" + comsumeTime +
                '}';
    }
}
