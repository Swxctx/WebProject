package com.sw.web.action;

import com.opensymphony.xwork2.ModelDriven;
import com.sw.container.SwServiceProvider;
import com.sw.service.UserService;
import com.sw.web.form.UserForm;

/*
 *@Author swxctx
 *@time 2017��4��27��
 *@Explain:��¼Action
 */
public class LoginAction extends BaseAction implements ModelDriven<UserForm>{

	private static final long serialVersionUID = 1L;
	/*����vo����*/
	UserForm userForm = new UserForm();
	
	/*����applicationContext.xml*/
	private UserService userService = (UserService)SwServiceProvider.getService(UserService.SERVICE_NAME);
	

	@Override
	public UserForm getModel() {
		// TODO Auto-generated method stub
		return userForm;
	}
	
	/*����*/
	@Override
	public String execute() throws Exception {
		/*����service��LoginCheck����У��*/
		String pass= userService.findUserByUsername(userForm.getUsername());
		
		if(userForm.getPassword().equals(pass)){
			return "success";
		}else{
			return "error";
		}
	}
}
