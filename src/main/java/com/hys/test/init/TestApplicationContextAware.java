package com.hys.test.init;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.hys.test.TestLog;

@Component
public class TestApplicationContextAware implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		TestLog.printInitLog("spring初始化流程测试: TestApplicationContextAware.setApplicationContext");
	}


}