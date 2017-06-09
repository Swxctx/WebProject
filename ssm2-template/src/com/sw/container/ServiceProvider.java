package com.sw.container;

import org.apache.commons.lang.StringUtils;

/*
 *@Author swxctx
 *@time 2017��5��11��
 *@Explain:������
 */
@SuppressWarnings("static-access")
public class ServiceProvider {
	private static ServiceProvideCord serviceProvideCord;
	
	//��̬����
	static{
		serviceProvideCord = new ServiceProvideCord();
		serviceProvideCord.load("classpath:applicationContext.xml");
	}
	
	public  static Object getService(String serviceName){
		//��������Ϊ��
		if(StringUtils.isBlank(serviceName)){
			throw new RuntimeException("��ǰ�������Ʋ�����");
		}
		Object object = null;
		if(serviceProvideCord.applicationContext.containsBean(serviceName)){
			//��ȡ��
			object = serviceProvideCord.applicationContext.getBean(serviceName);
		}
		if(object==null){
			throw new RuntimeException("��ǰ�������ơ�"+serviceName+"���µķ���ڵ㲻����");
		}
		return object;
	}
}
