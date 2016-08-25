package com.hys.test.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hys.test.TestLog;

@Component
public class AsynTest {
	@Async("myExecutor")
	public void asynMethod1() {
		TestLog.printAsynLog("asynMethod1");
	}
}
