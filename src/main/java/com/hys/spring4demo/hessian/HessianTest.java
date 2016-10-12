package com.hys.spring4demo.hessian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HessianTest {
	@Autowired
	private IHessianTestService hessianTestService;
	public String testHessianTestHello() {
		return hessianTestService.helloMe("hys");
	}
}
