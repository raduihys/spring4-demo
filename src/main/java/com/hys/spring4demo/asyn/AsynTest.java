package com.hys.spring4demo.asyn;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hys.spring4demo.TestLog;

@Component
public class AsynTest {
	@Async
	public void synMethod1() throws InterruptedException {
		TestLog.printAsynLog("synMethod1-1");
		asynMethod1();//注意内部调用并不是异步的
		TestLog.printAsynLog("synMethod1-2");
	}
	@Async
	public void asynMethod1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		TestLog.printAsynLog("asynMethod1");
	}
}
