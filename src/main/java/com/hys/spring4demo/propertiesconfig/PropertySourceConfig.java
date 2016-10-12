package com.hys.spring4demo.propertiesconfig;

import static com.hys.spring4demo.ConfigConst.PROPERTY_SOURCE_TEST_FILE_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value=PROPERTY_SOURCE_TEST_FILE_NAME)
public class PropertySourceConfig {

	@Autowired
	private Environment env;

	public String getP1Name() {
		return env.getProperty("p1Name");
	}

}
