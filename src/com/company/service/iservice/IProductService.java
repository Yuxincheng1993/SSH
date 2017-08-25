package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Product;

public interface IProductService extends IBaseService<Product, Integer> {

	List<Product> findByName(String pname);//接口独有功能  根据商品名称进行模糊查询
	List<Product> findByPage(int page,int size);//接口独有功能  分页查询
	
}
