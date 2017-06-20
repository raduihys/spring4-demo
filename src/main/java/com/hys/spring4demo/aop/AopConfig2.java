package com.hys.spring4demo.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.hys.spring4demo.TestLog;


@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Aspect
public class AopConfig2 {

    @Bean
    public Advisor myAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("@annotation(com.hys.spring4demo.aop.annotation.TestAnnotation)");
		return new DefaultPointcutAdvisor(pointcut,new  MethodInterceptor() {
	    	@Override
	    	public Object invoke(MethodInvocation invocation) throws Throwable {
	    		TestLog.printAopLog(String.format("method=%s\n",invocation.getMethod().getName()));
	    		return invocation.proceed();
	    	}
	    	
	    });
    }
    

}
