package com.hys.spring4demo.mybatis;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MybatisTestService {
	@Resource
	private TestMapper testMapper;

	@Transactional(rollbackFor=Exception.class)
	public void sqlTest() {
		testMapper.deleteAll();
		testMapper.insert(1,11,"str11");

	}
}
