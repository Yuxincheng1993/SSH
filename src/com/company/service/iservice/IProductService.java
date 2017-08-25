package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Product;

public interface IProductService extends IBaseService<Product, Integer> {

	List<Product> findByName(String pname);//�ӿڶ��й���  ������Ʒ���ƽ���ģ����ѯ
	List<Product> findByPage(int page,int size);//�ӿڶ��й���  ��ҳ��ѯ
	
}
