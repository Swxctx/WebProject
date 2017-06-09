package com.sw.container;

import org.apache.commons.lang.StringUtils;

/*
 *@Author swxctx
 *@time 2017年5月11日
 *@Explain:服务类
 */
@SuppressWarnings("static-access")
public class ServiceProvider {
	private static ServiceProvideCord serviceProvideCord;
	
	//静态加载
	static{
		serviceProvideCord = new ServiceProvideCord();
		serviceProvideCord.load("classpath:applicationContext.xml");
	}
	
	public  static Object getService(String serviceName){
		//服务名称为空
		if(StringUtils.isBlank(serviceName)){
			throw new RuntimeException("当前服务名称不存在");
		}
		Object object = null;
		if(serviceProvideCord.applicationContext.containsBean(serviceName)){
			//获取到
			object = serviceProvideCord.applicationContext.getBean(serviceName);
		}
		if(object==null){
			throw new RuntimeException("当前服务名称【"+serviceName+"】下的服务节点不存在");
		}
		return object;
	}
}
