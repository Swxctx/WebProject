package com.sw.dao;

import com.sw.domain.User;

/*
 *@Author swxctx
 *@time 2017��5��10��
 *@Explain:Dao��ӿ�
 */
public interface UserDao {
	public final static String SERVICE_NAME = "UserDaoImpl";
	
	//��¼
	public User findUserByUsername(String username);
	
}
