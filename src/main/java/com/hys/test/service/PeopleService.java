package com.hys.test.service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.hys.test.aop.annotation.MyComponent;
import com.hys.test.aop.annotation.TestAnnotation;

@MyComponent
public class PeopleService {
	@Resource
	private People people;
	
	public void setPeople(People people) {
		this.people = people;
	}

	@TestAnnotation
	public void showPeople() {
		System.out.println(people.getName()+"->");
	}
}
