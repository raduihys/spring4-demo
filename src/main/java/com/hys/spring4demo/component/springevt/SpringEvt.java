package com.hys.spring4demo.component.springevt;

import org.springframework.context.ApplicationEvent;

/**
 * @author huangyongsheng
 *
 */
public abstract class SpringEvt  extends ApplicationEvent{
	private static final long serialVersionUID = 1L;
	public SpringEvt() {
		super("");
	}

	
}
