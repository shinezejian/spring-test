package com.zejian.spring.springIoc.service;

import com.zejian.spring.springIoc.conf.BeanConfiguration;
import com.zejian.spring.springIoc.dao.AccountDao;
import com.zejian.spring.springIoc.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zejian on 2017/1/15.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 */
public class AccountServiceTestIoc {

    @Test
    public void testByXml() throws Exception {
        //加载配置文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/spring-ioc.xml");
//        FileSystemXmlApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:spring/spring-ioc.xml");
//        FileSystemXmlApplicationContext applicationContext=
//                new FileSystemXmlApplicationContext("/src/main/resources/spring/spring-ioc.xml");
//        AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
        //多次获取并不会创建多个accountService对象,因为spring默认创建是单实例的作用域
        AccountService accountService= (AccountService) applicationContext.getBean("accountService");
        accountService.doSomething();
        AccountService accountService1= (AccountService) applicationContext.getBean("accountService");
        accountService1.doSomething();

    }




    @Test
    public void testByConfigurationAnnotation() throws Exception {

        AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //名称必须BeanConfiguration中工程方法名称一致
        AccountService accountService= (AccountService) config.getBean("accountService");
        accountService.doSomething();

    }


    @Test
    public void test1()  {
      ApplicationContext applicationContext=new
              ClassPathXmlApplicationContext("spring/spring-ioc.xml");
        Account account1= (Account) applicationContext.getBean("account");
        Account account2= (Account) applicationContext.getBean("account");
        System.out.println("account1:"+account1.toString());
        System.out.println("account2:"+account2.toString());

    }

    @Test
    public void test2()  {
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("spring/spring-ioc.xml");
        AccountDao accountDao1 = (AccountDao) applicationContext.getBean("accountDao");
        AccountDao accountDao2 = (AccountDao) applicationContext.getBean("accountDao");
        System.out.println("accountDao1地址:"+accountDao1.toString());
        System.out.println("accountDao2地址:"+accountDao2.toString());
    }



    @Test
    public void test3()  {
        ApplicationContext applicationContext=new
                ClassPathXmlApplicationContext("spring/spring-ioc2.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");
        userService.done();
    }
}