package com.sw.service.impl;

import com.sw.container.ServiceProvider;
import com.sw.mapper.UserMapper;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017年5月11日
 *@Explain:Service层接口实现类
 */
public class UserServiceImpl implements UserService{

	@Override
	public String findLoginCheck(String username) throws Exception {
		UserMapper userMapper=(UserMapper) ServiceProvider.getService("userMapper");
		String pass = userMapper.findPassByName(username);
		return pass;
	}
	
}
