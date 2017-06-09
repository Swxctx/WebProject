package com.sw.service;


/*
 *@Author swxctx
 *@time 2017年5月10日
 *@Explain:Service层接口
 */
public interface UserService {
	public final static String SERVICE_NAME = "UserServiceImpl";
	
	//登录查询
	public String findUserByUsername(String username);
}
