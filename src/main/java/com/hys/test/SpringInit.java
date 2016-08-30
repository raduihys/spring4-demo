package com.hys.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hys.test.asyn.AsynTest;
import com.hys.test.component.springevt.SpringEvtDispatcher;
import com.hys.test.evts.TestEvt1;
import com.hys.test.evts.TestEvt2;

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
