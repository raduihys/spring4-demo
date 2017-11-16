package com.hys.spring4demo.asyn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@Configuration
public class AsynMyExecutorFactory {
    //定义@Asyn("executoryBeanName")的Executor
//	@Bean(name="myExecutor")
//	public Executor create() {
//		return new ThreadPoolExecutor(5, 50,10, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
//	}

    @Bean //定义默认的Asyn执行的线程池
    AsyncConfigurer getAsyncConfigurerBean() {
        return new AsyncConfigurerSupport(){
            @Override //定义默认的executors
            public Executor getAsyncExecutor() {
                ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();  
                threadPool.setCorePoolSize(5);  
                threadPool.setMaxPoolSize(50);  
                threadPool.setWaitForTasksToCompleteOnShutdown(true);//关闭线程池时是否等待任务完成  
                threadPool.setAwaitTerminationSeconds((int)TimeUnit.MINUTES.toSeconds(1)); //关闭线程池时是否等待任务完成的时间
                threadPool.setThreadNamePrefix("spring-async-");
                threadPool.initialize();
                return threadPool;  
            }
        };
    }


}
