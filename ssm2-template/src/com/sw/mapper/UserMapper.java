package com.sw.mapper;

/*
 *@Author swxctx
 *@time 2017��5��11��
 *@Explain:Mapper�ӿ�
 */
public interface UserMapper {
	
	/*�û���¼�������û��������û����룬����Ƿ�ƥ����е�¼*/
	public String findPassByName(String username)throws Exception;
	
}
