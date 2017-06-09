package com.sw.test;


import org.junit.Test;

import com.sw.container.ServiceProvider;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017ƒÍ5‘¬11»’
 *@Explain:Service≤„≤‚ ‘
 */
public class UserServiceTest {

	@Test
	public void test() throws Exception {
		UserService userService=(UserService) ServiceProvider.getService(UserService.SERVICE_NAME);
		String pass=userService.findLoginCheck("bs");
		System.out.println(pass);
	}

}
