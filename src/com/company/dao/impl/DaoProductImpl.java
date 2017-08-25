package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.IProductDao;
import com.company.dao.pojo.Product;

@Repository("productDao")
public class DaoProductImpl implements IProductDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void save(Product t) throws Exception {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void update(Product t) throws Exception {
		sessionFactory.getCurrentSession().update(t);
	}

	@Override
	public void delete(Product t) throws Exception {
		sessionFactory.getCurrentSession().delete(t);
	}

	@Override
	public List<Product> findAll() throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	@Override
	public Product findById(Integer k) throws Exception {
		return (Product) sessionFactory.getCurrentSession().createQuery("from Product p where p.pid=:pid")
				.setParameter("pid", k).uniqueResult();
	}

	@Override
	public List<Product> findByName(String pname) throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from Product p where p.pname like :pname")
				.setParameter("pname", "%" + pname + "%").list();
	}

	@Override
	public List<Product> findByPage(int page, int size) throws Exception {
		return sessionFactory.getCurrentSession().createQuery("from Product").setFirstResult((page - 1) * size)
				.setMaxResults(size).list();
	}

}
