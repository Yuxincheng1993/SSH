package com.company.dao.pojo.report;

import com.company.dao.pojo.Item;
import com.company.dao.pojo.Login;
import com.company.dao.pojo.Orders;
import com.company.dao.pojo.Product;

public class OrderReport{
	private Login login;
	private Orders order;
	private Product product;
	private Item item;
	public OrderReport() {
		// TODO Auto-generated constructor stub
	}
	public OrderReport(Login login, Orders order, Product product, Item item) {
		super();
		this.login = login;
		this.order = order;
		this.product = product;
		this.item = item;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "OrderReport [login=" + login + ", order=" + order + ", product=" + product + ", item=" + item + "]";
	}
	
	
}