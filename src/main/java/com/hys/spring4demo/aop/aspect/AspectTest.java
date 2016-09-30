package com.hys.spring4demo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.hys.spring4demo.TestLog;

@Component
@Aspect
public class AspectTest {

    @Around("execution( void showPeople*())")
    public Object executionTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopLog("executionTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }
    
    @Around("within(com.hys.spring4demo..*)")
    public Object withinTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopLog("withinTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }

    
    @Around("@within(com.hys.spring4demo.aop.annotation.MyComponent)")
    public Object withinTest2(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopLog("withinTest2:"+pjp.getSignature());
    	return pjp.proceed();
    }
    
    
    @Around("this(com.hys.spring4demo.service.PeopleService)")
    public Object thisTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopLog("thisTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }
    
    @Around("target(com.hys.spring4demo.service.PeopleService)")
    public Object targetTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopLog("targetTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }
    @Around("@annotation(com.hys.spring4demo.aop.annotation.TestAnnotation)")
    public Object annotationTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopLog("annotationTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }

}
