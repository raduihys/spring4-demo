package com.hys.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hys.test.tmp.EnableSpringEvt;

@ComponentScan("com.hys.test")
@EnableSpringEvt
@Configuration
public class CoreConfig {

}
