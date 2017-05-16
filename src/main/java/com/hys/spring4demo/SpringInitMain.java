package com.hys.spring4demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hys.spring4demo.asyn.AsynTest;

public class SpringInitMain {
	public static void main(String[] args) throws Exception {
		TestLog.setAsynLogOn();
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CoreConfig.class)) {
			ctx.getBean(AsynTest.class).synMethod1();
		}
	}
}
