package com.company.dao.idao;

import java.util.List;

import com.company.dao.pojo.Product;

public interface IProductDao extends IBaseDao<Product, Integer> {
	// 接口独有功能 根据商品名称进行模糊查询
	List<Product> findByName(String pname) throws Exception;
	List<Product> findByPage(int page, int size) throws Exception;
}
