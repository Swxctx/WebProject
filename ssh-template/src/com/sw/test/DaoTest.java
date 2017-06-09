package com.sw.test;


import org.junit.Test;

import com.sw.container.SwServiceProvider;
import com.sw.dao.UserDao;
import com.sw.domain.User;

/*
 *@Author swxctx
 *@time 2017ƒÍ5‘¬18»’
 *@Explain:hibernate(dao)≤‚ ‘
 */
public class DaoTest {
	

	@Test
	public void testFindUserByName() {
		UserDao userDao= (UserDao) SwServiceProvider.getService(UserDao.SERVICE_NAME);
		User user=(User) userDao.findUserByUsername("bs");
		if(user!=null){
			String string=user.getPassword();
			System.out.println(string);
		}else{
			System.out.println("");
		}
	}

}
