package com.sw.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@Author swxctx
 *@time 2017年5月11日
 *@Explain:服务类，用用户加载applicationContext.xml文件
 */
public class ServiceProvideCord {
	
	protected static ApplicationContext applicationContext;
	
	public static void load(String fileName){
		applicationContext = new ClassPathXmlApplicationContext(fileName);
	}
}
