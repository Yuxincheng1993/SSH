package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.idao.IProductDao;
import com.company.dao.pojo.Product;
import com.company.service.iservice.IProductService;

@Service("productService")
public class ServiceProductImpl implements IProductService {

	@Autowired
	@Qualifier("productDao")
	private IProductDao productDao;

	@Transactional
	@Override
	public String save(Product t) {
		String msg = "error";
		try {
				productDao.save(t);
				msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String update(Product t) {
		String msg = "error";
		try {
				productDao.update(t);
				msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional
	@Override
	public String delete(Product t) {
		String msg = "error";
		try {
				productDao.delete(t);
				msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Product> findAll() {
		List<Product> productList = null;
		try {
			productList = productDao.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Transactional(readOnly=true)
	@Override
	public Product findById(Integer k) {
		Product product = null;
		try {
			product = productDao.findById(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	@Transactional(readOnly=true)
	@Override
	public List<Product> findByName(String pname) {
		List<Product> productList = null;
		try {
			productList = productDao.findByName(pname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Transactional(readOnly=true,
			propagation=Propagation.REQUIRED,
			isolation=Isolation.READ_COMMITTED)
	@Override
	public List<Product> findByPage(int page, int size) {
		List<Product> productList = null;
		try {
			productList = productDao.findByPage(page, size);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

}
