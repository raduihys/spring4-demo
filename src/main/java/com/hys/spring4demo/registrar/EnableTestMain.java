
package com.hys.spring4demo.registrar;

import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class EnableTestMain {
	@Resource(name="xvtest")
	private Properties properties;
	public void t1() {
		System.out.println(properties);

	}


}
