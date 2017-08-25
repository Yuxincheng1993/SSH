package com.company.dao.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Administrator
 * Orders���Ӧt_order��
 */
public class Orders implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int oid;
	private String orderNum;//�������
	private String orderTime;//�������ɵ�ʱ��
	private int userid;//�������User��Ϣ--Login��id

	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(String orderNum, int userid) {
		super();
		this.orderNum = orderNum;
		//����������ʱ����ϵͳ�Զ�����
		String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		this.orderTime = now;
		this.userid = userid;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", orderNum=" + orderNum + ", orderTime=" + orderTime + ", userid=" + userid
				+ "]";
	}

}
