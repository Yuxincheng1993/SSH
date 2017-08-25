package com.company.dao.pojo;

import java.io.Serializable;

/**
 * 
 * @author Administrator
 * Login��Ӧt_login����װ��¼��Ϣ
 */
public class Login implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;//�û���
	private String password;//����

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
