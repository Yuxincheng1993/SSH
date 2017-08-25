package com.company.service.iservice;

import java.util.List;

/*
 * T:  Orders  Item   Product  Detail Login
 * K: findById(Integer k)   K指代表的主键数据类型
 */
public interface IBaseService<T,K> {
	String save(T t);
	String update(T t);
	String delete(T t);
	List<T>  findAll();
	T findById(K k);
}
