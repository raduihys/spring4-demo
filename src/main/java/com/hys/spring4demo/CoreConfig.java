package com.hys.spring4demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hys.spring4demo.component.springevt.EnableSpringEvt;
import com.hys.spring4demo.importselector.EnableImportSelectorTest;
import com.hys.spring4demo.registrar.EnableTest;

@ComponentScan("com.hys.spring4demo")
@EnableSpringEvt
@Configuration
@EnableTest
@EnableImportSelectorTest
public class CoreConfig {

}
