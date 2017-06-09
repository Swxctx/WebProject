package com.sw.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sw.mapper.UserMapper;

/*
 *@Author swxctx
 *@time 2017年5月11日
 *@Explain:Spring与Mybatis整合测试
 */
public class UserDaoTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		//spring
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		String pass=userMapper.findPassByName("bs");
		System.out.println(pass);
	}

}
