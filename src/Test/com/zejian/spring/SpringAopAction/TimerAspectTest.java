package com.zejian.spring.SpringAopAction;

import com.zejian.spring.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by wuzejian on 2017/2/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-aspectj-action.xml")
public class TimerAspectTest {
    @Autowired
    UserController userController;
    @Test
    public void testLogTimer() throws Exception {
        userController.listUser();
    }
}