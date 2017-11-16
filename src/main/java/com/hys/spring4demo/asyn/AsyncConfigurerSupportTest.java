package com.hys.spring4demo.asyn;

import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class AsyncConfigurerSupportTest extends AsyncConfigurerSupport{
    @Override //定义默认的executors
    public Executor getAsyncExecutor() {
        return new ThreadPoolExecutor(5, 50,10, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
    }
}

