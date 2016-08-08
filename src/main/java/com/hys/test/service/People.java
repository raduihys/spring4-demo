package com.hys.test.service;

import org.springframework.stereotype.Component;

@Component
public class People {
	String name="name=默认值";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
