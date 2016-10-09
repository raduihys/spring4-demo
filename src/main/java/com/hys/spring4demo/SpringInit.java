package com.hys.spring4demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hys.spring4demo.asyn.AsynTest;
import com.hys.spring4demo.component.springevt.SpringEvtDispatcher;
import com.hys.spring4demo.evts.TestEvt1;
import com.hys.spring4demo.evts.TestEvt2;

public class SpringInit {
	public static void main(String[] args) throws Exception {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CoreConfig.class)) {
			SpringEvtDispatcher.publishEvt(new TestEvt1("testEvt1-content"));
			SpringEvtDispatcher.publishEvt(new TestEvt2("testEvt2-content"));
			ctx.getBean(AsynTest.class).asynMethod1();
			TestLog.printRootLog("main函数结束");
			
			
		}
	}
}
