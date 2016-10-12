package com.hys.spring4demo.hessian;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class HessianTestConfig {
	public static final String HESSIAN_TEST_SERVICE_BEAN = "hessianTestService";
	@Bean(name=HESSIAN_TEST_SERVICE_BEAN)
	public HessianProxyFactoryBean getHessianTestService() {
		HessianProxyFactoryBean hessianTestServiceFactory=new HessianProxyFactoryBean();
		hessianTestServiceFactory.setServiceUrl("http://www.tmp.com/hessianTestService");
		hessianTestServiceFactory.setServiceInterface(IHessianTestService.class);
		return hessianTestServiceFactory;
	}
}
