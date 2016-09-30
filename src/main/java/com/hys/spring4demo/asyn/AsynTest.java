package com.hys.spring4demo.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hys.spring4demo.TestLog;

@Component
public class AsynTest {
	@Async
	public void asynMethod1() {
		TestLog.printAsynLog("asynMethod1");
	}
}
