package com.sw.service;
/*
 *@Author swxctx
 *@time 2017��5��11��
 *@Explain:Service��ӿ�
 */
public interface UserService {
	public final static String SERVICE_NAME="UserServiceImpl";
	
	/*�û���¼��֤*/
	public String findLoginCheck(String username)throws Exception;
}
