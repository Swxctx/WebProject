package com.sw.view.form;
/*
 *@Author swxctx
 *@time 2017年5月11日
 *@Explain:持久层bean-对应于数据库表（user）--即表单提交的数据
 */
public class UserForm {
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
