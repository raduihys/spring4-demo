package com.hys.spring4demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class PropertiesConfig {
	@Value("${cc2dUploadDirFormat}")
	private String cc2dUploadDirFormat;
	@Value("${cc2dUploadDirUrlFormat}")
	private String cc2dUploadDirUrlFormat;
	
	public String getCc2dUploadDirFormat() {
		return cc2dUploadDirFormat;
	}
	
	public String getCc2dUploadDirUrlFormat() {
		return cc2dUploadDirUrlFormat;
	}
	
	
}
