package com.hys.spring4demo.asyn;

import com.hys.spring4demo.TestLog;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Component
@Async
public class AsynTest {
    
	public Future<String> asynMethod2() throws InterruptedException {
	    TimeUnit.SECONDS.sleep(1);
		TestLog.printAsynLog("asynMethod2-1");
		asynMethod1();//注意内部调用并不是异步的
		TestLog.printAsynLog("asynMethod2-2");
		return new AsyncResult<String>("返回值同步返回才有效");
	}
	public String asynMethod1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		TestLog.printAsynLog("asynMethod1");
		return "返回值不是同步返回无效";
	}
}
