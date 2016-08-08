package com.hys.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hys.test.evts.TestEvt1;
import com.hys.test.tmp.SpringEvtDispatcher;

public class SpringInit {
	public static void main(String[] args) throws Exception {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CoreConfig.class)) {
			SpringEvtDispatcher.publishEvt(new TestEvt1("evt_content1"));
			TestLog.println("main函数结束");
		}
	}
}
