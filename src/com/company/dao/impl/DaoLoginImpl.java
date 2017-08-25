package com.company.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.ILoginDao;
import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;
@Repository("loginDao")
public class DaoLoginImpl implements ILoginDao {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void registry(Login login, Detail detail) throws Exception {
		Session session = sessionFactory.getCurrentSession();//当使用getCurrentSession的时候，系统自动在事务提交时关闭session
		session.save(login);
		session.save(detail);
	}

	@Override
	public Login login(Login login) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Login result = (Login) session.createQuery("from Login where username=:username and password=:password")
				.setParameter("username", login.getUsername()).setParameter("password", login.getPassword())
				.uniqueResult();
		return result;
	}

	// version2.0时再开发，version1.0为可裁剪模块

	@Override
	public void save(Login t) throws Exception {

	}

	@Override
	public void update(Login t) throws Exception {

	}

	@Override
	public void delete(Login t) throws Exception {

	}

	@Override
	public List<Login> findAll() throws Exception {
		return null;
	}

	@Override
	public Login findById(Integer k) throws Exception {
		return null;
	}
}
