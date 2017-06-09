package com.sw.test;

import org.junit.Test;
import com.sw.container.SwServiceProvider;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017ƒÍ5‘¬15»’
 *@Explain:Service≤„≤‚ ‘
 */
public class UserServiceTest {
	
	@Test
	public void testLogin() throws Exception {
		UserService userService = (UserService) SwServiceProvider.getService("UserServiceImpl");
		String pass=userService.findLoginCheck("bs");
		System.out.println(pass);
	}

}
