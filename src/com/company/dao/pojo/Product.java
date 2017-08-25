package com.company.dao.pojo;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 */
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private String pname;
	private String ean;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, String ean, double price) {
		super();
		this.pname = pname;
		this.ean = ean;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ean=" + ean + ", price=" + price + "]";
	}

}
