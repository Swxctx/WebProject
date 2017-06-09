package com.sw.mapper;

/*
 *@Author swxctx
 *@time 2017年5月11日
 *@Explain:Mapper接口
 */
public interface UserMapper {
	
	/*用户登录：根据用户名查找用户密码，检查是否匹配进行登录*/
	public String findPassByName(String username)throws Exception;
	
}
