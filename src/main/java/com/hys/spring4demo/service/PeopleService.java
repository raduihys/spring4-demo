package com.hys.spring4demo.service;

import javax.annotation.Resource;

import com.hys.spring4demo.TestLog;
import com.hys.spring4demo.aop.annotation.MyComponent;
import com.hys.spring4demo.aop.annotation.TestAnnotation;

@MyComponent
public class PeopleService {
	@Resource
	private People people;
	
	public void setPeople(People people) {
		this.people = people;
	}

	@TestAnnotation
	public void showPeople() {
		TestLog.printRootLog(people.getName()+"->");
	}
}
