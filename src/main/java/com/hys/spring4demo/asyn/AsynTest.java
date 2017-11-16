package com.hys.spring4demo.asyn;

import com.hys.spring4demo.TestLog;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Async
public class AsynTest {
    
	public void synMethod1() throws InterruptedException {
		TestLog.printAsynLog("synMethod1-1");
		asynMethod1();//注意内部调用并不是异步的
		TestLog.printAsynLog("synMethod1-2");
	}
	public String asynMethod1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		TestLog.printAsynLog("asynMethod1");
		return "vvvvv";
	}
}
