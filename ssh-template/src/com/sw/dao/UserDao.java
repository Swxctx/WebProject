package com.sw.dao;

import com.sw.domain.User;

/*
 *@Author swxctx
 *@time 2017年5月10日
 *@Explain:Dao层接口
 */
public interface UserDao {
	public final static String SERVICE_NAME = "UserDaoImpl";
	
	//登录
	public User findUserByUsername(String username);
	
}
