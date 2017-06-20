package com.hys.spring4demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hys.spring4demo.service.PeopleService;

public class SpringInitMain {
	public static void main(String[] args) throws Exception {
		TestLog.setAopLogOn();
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CoreConfig.class)) {
			ctx.getBean(PeopleService.class).showPeople();
		}
	}
}
