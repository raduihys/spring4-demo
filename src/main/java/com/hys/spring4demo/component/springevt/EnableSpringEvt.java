
package com.hys.spring4demo.component.springevt;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
/**
 * 启用evt功能 
 * @author huangyongsheng
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SpringEvtDispatcher.class)
@EnableAsync
public @interface EnableSpringEvt {
	
}
