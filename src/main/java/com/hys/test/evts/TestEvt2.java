package com.hys.test.evts;

import com.hys.test.tmp.SpringEvt;

public class TestEvt2 extends SpringEvt {
	private static final long serialVersionUID = 1L;
	private String content;

	public TestEvt2(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

}
