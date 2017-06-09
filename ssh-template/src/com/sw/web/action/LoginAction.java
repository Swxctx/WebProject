package com.sw.web.action;

import com.opensymphony.xwork2.ModelDriven;
import com.sw.container.SwServiceProvider;
import com.sw.service.UserService;
import com.sw.web.form.UserForm;

/*
 *@Author swxctx
 *@time 2017年4月27日
 *@Explain:登录Action
 */
public class LoginAction extends BaseAction implements ModelDriven<UserForm>{

	private static final long serialVersionUID = 1L;
	/*创建vo对象*/
	UserForm userForm = new UserForm();
	
	/*加载applicationContext.xml*/
	private UserService userService = (UserService)SwServiceProvider.getService(UserService.SERVICE_NAME);
	

	@Override
	public UserForm getModel() {
		// TODO Auto-generated method stub
		return userForm;
	}
	
	/*处理*/
	@Override
	public String execute() throws Exception {
		/*调用service层LoginCheck函数校验*/
		String pass= userService.findUserByUsername(userForm.getUsername());
		
		if(userForm.getPassword().equals(pass)){
			return "success";
		}else{
			return "error";
		}
	}
}
