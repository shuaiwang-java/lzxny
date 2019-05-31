package com.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.apache.taglibs.standard.lang.jstl.test.PageContextImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.UserMapper;
/**
 * 测试dao层的功能
 * @author ws
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)  //指定是Spring test单元
@ContextConfiguration(locations={"classpath:applicationContext.xml"})   //指定配置文件,加载ioc容器
public class MapperTest {
	
	@Autowired
	UserMapper userMapper; 
	
	
	@Autowired
	SqlSession sqlSession;  //这个sqlSession可以进行批量操作   方式：sqlSession.getMapper(dept.class);这样获取的对象就可以批量操作，如果不是就不属于批量操作
	
	@Test
	public void testCRUD() {
		//普通插入
//		empMapper.insertSelective(new Emp(null, "测试李", "男", "12@123.com", 1, new Dept(null, "测试部门")));
			
		
		
		
	}
}
