package com.sw.test;

import org.junit.Test;

import com.sw.container.SwServiceProvider;
import com.sw.service.UserService;

/*
 *@Author swxctx
 *@time 2017ƒÍ5‘¬18»’
 *@Explain:Service≤‚ ‘
 */
public class ServiceTest {

	@Test
	public void testFindUserByUsername() {
		UserService userService=(UserService)SwServiceProvider.getService(UserService.SERVICE_NAME);
		String pass=userService.findUserByUsername("bs");
		System.out.println(pass);
	}

}
