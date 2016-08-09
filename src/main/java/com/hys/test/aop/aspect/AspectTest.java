package com.hys.test.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.hys.test.TestLog;

@Component
@Aspect
public class AspectTest {

    @Around("execution( void showPeople*())")
    public Object executionTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopTest("executionTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }
    
    @Around("within(com.hys.test..*)")
    public Object withinTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopTest("withinTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }

    
    @Around("@within(com.hys.test.aop.annotation.MyComponent)")
    public Object withinTest2(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopTest("withinTest2:"+pjp.getSignature());
    	return pjp.proceed();
    }
    
    
    @Around("this(com.hys.test.service.PeopleService)")
    public Object thisTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopTest("thisTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }
    
    @Around("target(com.hys.test.service.PeopleService)")
    public Object targetTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopTest("targetTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }
    @Around("@annotation(com.hys.test.aop.annotation.TestAnnotation)")
    public Object annotationTest1(ProceedingJoinPoint pjp) throws Throwable {
    	TestLog.printAopTest("annotationTest1:"+pjp.getSignature());
    	return pjp.proceed();
    }

}
