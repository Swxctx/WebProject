package com.sw.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sw.mapper.UserMapper;

/*
 *@Author swxctx
 *@time 2017��5��11��
 *@Explain:Spring��Mybatis���ϲ���
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
