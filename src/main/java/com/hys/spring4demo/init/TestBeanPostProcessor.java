package com.hys.spring4demo.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.hys.spring4demo.TestLog;

@Component
public class TestBeanPostProcessor implements BeanPostProcessor{
	

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof TestBeanInitProccess){
			TestLog.printInitLog("单个bean初始化流程： TestBeanPostProcessor.before:"+beanName);
		}
//		InitTestUtil.print("spring初始化流程测试: TestBeanPostProcessor.before:"+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof TestBeanInitProccess){
			TestLog.printInitLog("单个bean初始化流程： TestBeanPostProcessor.before:"+beanName);
		}
//		InitTestUtil.print("spring初始化流程测试: TestBeanPostProcessor.before:"+beanName);
		return bean;
	}


}