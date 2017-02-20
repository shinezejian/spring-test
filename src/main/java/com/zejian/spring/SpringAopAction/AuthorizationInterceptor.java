package com.zejian.spring.SpringAopAction;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
/**
 * Created by wuzejian on 2017/2/20.
 * 用户权限验证
 */
@Aspect
public class AuthorizationInterceptor {

    //无需包含LoginController和RegisterController
	@Pointcut("execution(com.zejian.spring.controller *(..)) && " +
			"!within(com.zejian.spring.controller.LoginController) && " +
			"!within(com.zejian.spring.controller.RegisterController)")
	void authMethods() {
	}

	@Around("authMethods()")
	public Object auth(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		String clazzName = thisJoinPoint.getTarget().getClass().getName();
		String methodName = thisJoinPoint.getSignature().getName();

		//取得用户名
        HttpServletRequest request = (HttpServletRequest) thisJoinPoint.getArgs()[2];
        String username = (String) request.getSession().getAttribute("USERNAME_KEY");

        if (null != username && !username.equals("")) {
            //合法用户
            return thisJoinPoint.proceed();
        } else {
            //非法用户处理.....
            String ip = request.getRemoteAddr();
            //进行其他处理
            return "";
        }
	}
}
