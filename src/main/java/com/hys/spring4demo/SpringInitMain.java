package com.hys.spring4demo;

import com.hys.spring4demo.asyn.AsynTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringInitMain {
	public static void main(String[] args) throws Exception {
		TestLog.setAsynLogOn();
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CoreConfig.class)) {
		    System.out.println("==================");
			System.out.println(ctx.getBean(AsynTest.class).asynMethod1());
			System.out.println("after Invoce asynMethod1");
			
			System.out.println(ctx.getBean(AsynTest.class).asynMethod2().get());
			System.out.println("after Invoce asynMethod2");
		}
	}
}
