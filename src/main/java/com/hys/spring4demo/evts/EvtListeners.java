package com.hys.spring4demo.evts;

import java.util.concurrent.TimeUnit;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hys.spring4demo.TestLog;
import com.hys.spring4demo.component.springevt.SpringEvt;

@Component
public class EvtListeners {
	
	@EventListener
	@Async
	void evt1Listen(TestEvt1 event) throws InterruptedException {
		Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		TestLog.printEvtLog("evt1Listen,content:" + event.getContent());
	}
	
	@EventListener
	@Async
	void evtAllListen(SpringEvt evt) throws InterruptedException {
		TestLog.printEvtLog("evtAllListen,evt:"+evt);
	}
	
}
