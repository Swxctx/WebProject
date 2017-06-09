package com.sw.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.sw.container.SwServiceProvider;
import com.sw.dao.UserDao;
import com.sw.domain.User;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017��5��10��
 *@Explain:Service��ʵ��
 */

//ָ�������ύ����
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService{

	//��֤
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
