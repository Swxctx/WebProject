package com.sw.service;


/*
 *@Author swxctx
 *@time 2017��5��10��
 *@Explain:Service��ӿ�
 */
public interface UserService {
	public final static String SERVICE_NAME = "UserServiceImpl";
	
	//��¼��ѯ
	public String findUserByUsername(String username);
}
