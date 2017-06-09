package com.sw.domain;
/*
 *@Author swxctx
 *@time 2017年4月27日
 *@Explain:用户表po对象
 *id：编号
 *username：用户名
 *password：密码
 */
public class User {
	private int id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
