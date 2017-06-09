package com.sw.container;

import org.apache.commons.lang.StringUtils;

/*
 *@Author swxctx
 *@time 2017��5��15��
 *@Explain:Service�������
 */
@SuppressWarnings("static-access")
public class SwServiceProvider {
	private static ServiceProvideCord serviceProvideCord;
	
	//��̬����
	static{
		serviceProvideCord = new ServiceProvideCord();
		serviceProvideCord.load(new String[]{"classpath:/spring/applicationContext-service.xml",
				"classpath:/spring/applicationContext-dao.xml",
				"classpath:/spring/applicationContext-transaction.xml"});
	}
	
	public  static Object getService(String serviceName){
		//��������Ϊ��
		if(StringUtils.isBlank(serviceName)){
			throw new RuntimeException("��ǰ�������Ʋ�����...");
		}
		Object object = null;
		if(serviceProvideCord.applicationContext.containsBean(serviceName)){
			//��ȡbean
			object = serviceProvideCord.applicationContext.getBean(serviceName);
		}
		if(object==null){
			throw new RuntimeException("��������Ϊ��"+serviceName+"���µķ���ڵ㲻����...");
		}
		return object;
	}
}
