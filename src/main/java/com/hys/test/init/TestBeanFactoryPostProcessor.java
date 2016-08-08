package com.hys.test.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import com.hys.test.TestLog;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		TestLog.printInitLog("spring初始化流程测试: TestBeanFactoryPostProcessor.postProcessBeanFactory");

	}


}