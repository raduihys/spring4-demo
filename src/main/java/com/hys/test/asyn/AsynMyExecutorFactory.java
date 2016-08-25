package com.hys.test.asyn;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsynMyExecutorFactory {
	@Bean(name="myExecutor")
	public Executor create() {
		return Executors.newCachedThreadPool();
	}
}
