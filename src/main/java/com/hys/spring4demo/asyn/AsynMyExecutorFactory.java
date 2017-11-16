package com.hys.spring4demo.asyn;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AsynMyExecutorFactory {
    //定义@Asyn("executoryBeanName")的Executor
//	@Bean(name="myExecutor")
//	public Executor create() {
//		return new ThreadPoolExecutor(5, 50,10, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
//	}
}
