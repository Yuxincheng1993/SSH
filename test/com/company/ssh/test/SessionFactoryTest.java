package com.company.ssh.test;


import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SessionFactoryTest {
	private ApplicationContext ctx;
	@Before
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void testSessionFactory(){
//		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//		System.out.println(dataSource);
		SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
}
