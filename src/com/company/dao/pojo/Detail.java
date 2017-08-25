package com.company.dao.pojo;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 * Detail对应t_detail表
 */
public class Detail implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String realname;//真实姓名
	private double balance;//余额
	public Detail() {
		// TODO Auto-generated constructor stub
	}
	public Detail(String realname, double balance) {
		super();
		this.realname = realname;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Detail [id=" + id + ", realname=" + realname + ", balance=" + balance + "]";
	}
	
}
