package com.sw.service;
/*
 *@Author swxctx
 *@time 2017年5月11日
 *@Explain:Service层接口
 */
public interface UserService {
	public final static String SERVICE_NAME="UserServiceImpl";
	
	/*用户登录验证*/
	public String findLoginCheck(String username)throws Exception;
}
