package com.sw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sw.container.SwServiceProvider;
import com.sw.service.UserService;
import com.sw.view.form.UserForm;

/*
 *@Author swxctx
 *@time 2017��5��16��
 *@Explain:��ɵ�¼��ع���
 */
@Controller
public class LoginController{
	//vo����
	//UserForm userForm = new UserForm();
	
	//service
	UserService userService = (UserService) SwServiceProvider.getService(UserService.SERVICE_NAME);
	
	//��¼��֤
	@RequestMapping("/logincheck")
	public ModelAndView loginCheck(UserForm userForm)throws Exception{
		String pass = userService.findLoginCheck(userForm.getUsername());
		ModelAndView modelAndView = new ModelAndView();
		//�ж�
		if(pass.equals(userForm.getPassword())){
			modelAndView.setViewName("login/success");
		}else{
			modelAndView.setViewName("login/err");
		}
		return modelAndView;
	}
}
