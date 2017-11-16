package com.hys.spring4demo.asyn;

import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@Component
public class AsyncConfigurerSupportTest extends AsyncConfigurerSupport{
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
}

