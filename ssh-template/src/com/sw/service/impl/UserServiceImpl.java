package com.sw.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.sw.container.SwServiceProvider;
import com.sw.dao.UserDao;
import com.sw.domain.User;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017年5月10日
 *@Explain:Service层实现
 */

//指定事务提交级别
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService{

	//验证
	@Override
	public String findUserByUsername(String username) {
		UserDao userDao= (UserDao) SwServiceProvider.getService("UserDaoImpl");
		User user = userDao.findUserByUsername(username);
		String pass;
		if(user!=null){
			pass = user.getPassword();
		}else{
			pass = "";
		}
		return pass;
	}

}
