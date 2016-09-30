package com.hys.spring4demo.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hys.spring4demo.service.PeopleService;

@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@ComponentScan("com.hys.spring4demo")
@ContextHierarchy({@ContextConfiguration(classes = UserServiceTest.class)})
public class UserServiceTest {
    @Resource
    UserService userService;
    @Autowired
	private PeopleService peopleService;


    @Test
    public void testBeans() {
    	System.out.println(userService+"->"+peopleService);
    }
}
