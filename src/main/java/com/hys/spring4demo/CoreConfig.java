package com.hys.spring4demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hys.spring4demo.component.springevt.EnableSpringEvt;

@ComponentScan("com.hys.spring4demo")
@EnableSpringEvt
@Configuration
public class CoreConfig {

}
