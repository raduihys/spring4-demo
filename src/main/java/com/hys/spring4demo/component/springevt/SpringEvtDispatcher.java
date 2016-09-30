package com.hys.spring4demo.component.springevt;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author huangyongsheng
 *
 */
@Component
public class SpringEvtDispatcher  implements ApplicationContextAware{
	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringEvtDispatcher.applicationContext=applicationContext;
	}
	
	public static void publishEvt(SpringEvt event) {
		applicationContext.publishEvent(event);
	}

	
}
