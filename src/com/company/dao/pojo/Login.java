package com.company.dao.pojo;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 * Login对应t_login表：封装登录信息
 */
public class Login implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;//用户名
	private String password;//密码

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

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

	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}
