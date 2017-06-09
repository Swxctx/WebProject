package com.sw.service.impl;

import org.springframework.stereotype.Service;

import com.sw.container.SwServiceProvider;
import com.sw.mapper.UserMapper;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017��5��15��
 *@Explain:Service��ӿ�ʵ����
 */
@Service
public class UserServiceImpl implements UserService{
	//��¼���
	@Override
	public String findLoginCheck(String username) throws Exception {
		UserMapper userMapper=(UserMapper) SwServiceProvider.getService("userMapper");
		String pass = userMapper.findPassByName(username);
		return pass;
	}
	
}
