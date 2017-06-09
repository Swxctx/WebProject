package com.sw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sw.container.SwServiceProvider;
import com.sw.service.UserService;
import com.sw.view.form.UserForm;

/*
 *@Author swxctx
 *@time 2017年5月16日
 *@Explain:完成登录相关工作
 */
@Controller
public class LoginController{
	//vo对象
	//UserForm userForm = new UserForm();
	
	//service
	UserService userService = (UserService) SwServiceProvider.getService(UserService.SERVICE_NAME);
	
	//登录验证
	@RequestMapping("/logincheck")
	public ModelAndView loginCheck(UserForm userForm)throws Exception{
		String pass = userService.findLoginCheck(userForm.getUsername());
		ModelAndView modelAndView = new ModelAndView();
		//判断
		if(pass.equals(userForm.getPassword())){
			modelAndView.setViewName("login/success");
		}else{
			modelAndView.setViewName("login/err");
		}
		return modelAndView;
	}
}
