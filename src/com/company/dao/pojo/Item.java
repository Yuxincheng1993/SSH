package com.company.dao.pojo;

import java.io.Serializable;
/**
 * 
 * @author Administrator
 * Item表代表订单详情t_item，是Product和Orders多对多关系的产物
 */
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	private int itemid;
	private int oid;//外键关联Oders的oid
	private int pid;//外键关联Product的pid
	private int pnum;//该订单购买的某商品数量

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int oid, int pid, int pnum) {
		super();
		this.oid = oid;
		this.pid = pid;
		this.pnum = pnum;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", oid=" + oid + ", pid=" + pid + ", pnum=" + pnum + "]";
	}

}
