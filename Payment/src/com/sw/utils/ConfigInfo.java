package com.sw.utils;

import java.util.Properties;
/** 
 * @author Swxctx
 * @version ����ʱ�䣺2016��11��15�� ����8:40:34 
 * @FileName:ConfigInfo.java
 * @Explain:��ȡ�����ļ�
 */
public class ConfigInfo {
	private static Properties cache = new Properties();
	static{
		try {
			cache.load(ConfigInfo.class.getClassLoader().getResourceAsStream("merchantInfo.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��ȡָ��key��ֵ
	 * @param key
	 * @return
	 */
	public static String getValue(String key){
		return cache.getProperty(key);
	}
}
