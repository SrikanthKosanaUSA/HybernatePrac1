package com.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		Employee E1 = new Employee();
		E1.setEid(1);
		E1.setName("Raju");
		E1.setPhone("123456");
		
		
		session.persist(E1);
		
		t.commit();
		session.close();
		
		
		//session.save(E1);
		
	}

}
