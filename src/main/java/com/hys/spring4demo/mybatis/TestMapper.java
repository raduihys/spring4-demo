package com.hys.spring4demo.mybatis;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.bt.qq.common.mybatis.Mapper;

@Mapper(db="test")
public interface TestMapper {

	@Delete("DELETE FROM mybatis_test1")
	boolean deleteAll();
	@Insert("INSERT INTO mybatis_test1(id,intCol1,strCol1) VALUES(${id},${intCol1},#{strCol1})")
	void insert(@Param("id")int id,@Param("intCol1") int intCol1,@Param("strCol1") String strCol1);
	
}
