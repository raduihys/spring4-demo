package com.hys.spring4demo.init;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.hys.spring4demo.beans.BeanTest1;

@Component
public class TestFactoryBean implements FactoryBean<BeanTest1>{

	@Override
	public BeanTest1 getObject() throws Exception {
		return new BeanTest1();
	}

	@Override
	public Class<?> getObjectType() {
		return BeanTest1.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
