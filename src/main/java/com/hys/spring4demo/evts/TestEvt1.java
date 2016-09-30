package com.hys.spring4demo.evts;

import com.hys.spring4demo.component.springevt.SpringEvt;

public class TestEvt1 extends SpringEvt {
	private static final long serialVersionUID = 1L;
	private String content;

	public TestEvt1(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
