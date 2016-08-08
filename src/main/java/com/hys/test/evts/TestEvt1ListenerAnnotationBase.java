package com.hys.test.evts;

import java.util.concurrent.TimeUnit;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hys.test.TestLog;

@Component
public class TestEvt1ListenerAnnotationBase {
	
	@EventListener
	@Async
	void testEvt1Handle(TestEvt1 event) throws InterruptedException {
		Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		TestLog.printEvtLog("TestEvt1ListenerAnnotationBase,content:" + event.getContent());
	}
	
}
