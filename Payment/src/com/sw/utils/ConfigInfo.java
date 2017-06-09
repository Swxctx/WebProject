package com.sw.utils;

import java.util.Properties;
/** 
 * @author Swxctx
 * @version 创建时间：2016年11月15日 下午8:40:34 
 * @FileName:ConfigInfo.java
 * @Explain:读取配置文件
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
	 * 获取指定key的值
	 * @param key
	 * @return
	 */
	public static String getValue(String key){
		return cache.getProperty(key);
	}
}
