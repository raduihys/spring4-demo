package com.hys.spring4demo.mybatis;

import org.springframework.context.annotation.Configuration;

import com.bt.qq.common.mybatis.EnableMybatis;

@Configuration
@EnableMybatis(dbs="test", scanMapperPackage = "com.hys.spring4demo")
public class MyBatisConfig {
	
}
