package com.sw.service.impl;

import org.springframework.stereotype.Service;

import com.sw.container.SwServiceProvider;
import com.sw.mapper.UserMapper;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017年5月15日
 *@Explain:Service层接口实现类
 */
@Service
public class UserServiceImpl implements UserService{
	//登录检查
	@Override
	public String findLoginCheck(String username) throws Exception {
		UserMapper userMapper=(UserMapper) SwServiceProvider.getService("userMapper");
		String pass = userMapper.findPassByName(username);
		return pass;
	}
	
}
