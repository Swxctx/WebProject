package com.sw.service.impl;

import com.sw.container.ServiceProvider;
import com.sw.mapper.UserMapper;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017��5��11��
 *@Explain:Service��ӿ�ʵ����
 */
public class UserServiceImpl implements UserService{

	@Override
	public String findLoginCheck(String username) throws Exception {
		UserMapper userMapper=(UserMapper) ServiceProvider.getService("userMapper");
		String pass = userMapper.findPassByName(username);
		return pass;
	}
	
}
