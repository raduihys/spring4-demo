package com.hys.test.init;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.hys.test.TestLog;

@Component
public class TestBeanInitProccess implements InitializingBean,BeanNameAware,BeanClassLoaderAware,BeanFactoryAware{

	public TestBeanInitProccess() {
		TestLog.printInitLog("单个bean初始化流程：实例化");
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		TestLog.printInitLog("单个bean初始化流程：BeanFactoryAware");
		
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		TestLog.printInitLog("单个bean初始化流程：BeanClassLoaderAware");
	}

	@Override
	public void setBeanName(String name) {
		TestLog.printInitLog("单个bean初始化流程：BeanNameAware");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		TestLog.printInitLog("单个bean初始化流程：InitializingBean");
	}
	
	@PostConstruct
	public void init() {
		TestLog.printInitLog("单个bean初始化流程：@PostConstruct");
	}

	
	
}
