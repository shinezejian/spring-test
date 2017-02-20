package com.zejian.spring.SpringAopAction;

import java.util.Date;

import com.zejian.spring.pojo.MonitorTime;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by wuzejian on 2017/2/20.
 * 性能监测日志
 * 这里只是简单模拟，可以根据业务需求自行定义
 */
@Aspect
public class TimerAspect {

	/**
	 * 定义切点函数，过滤监控api方法
	 */
	@Pointcut("execution(* com.zejian.spring.controller.*Controller.*(..))")
	void timer() {
	}

	@Around("timer()")
	public Object logTimer(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		System.out.println("性能监测.....");
		MonitorTime monitorTime=new MonitorTime();

		//获取目标类名称
		String clazzName = thisJoinPoint.getTarget().getClass().getName();
		//获取目标类方法名称
		String methodName = thisJoinPoint.getSignature().getName();

		monitorTime.setClassName(clazzName);//记录类名称
		monitorTime.setMethodName(methodName);//记录对应方法名称
		monitorTime.setLogTime(new Date());//记录时间

		// 计时并调用目标函数
		long start = System.currentTimeMillis();
		Object result = thisJoinPoint.proceed();
		long time = System.currentTimeMillis() - start;

		//设置消耗时间
		monitorTime.setComsumeTime(time);

		System.out.println("monitorTime="+monitorTime.toString());

		//把monitorTime记录的信息上传给监控系统
		//MonitoruUtils.report(monitorTime)

		return result;
	}
}
