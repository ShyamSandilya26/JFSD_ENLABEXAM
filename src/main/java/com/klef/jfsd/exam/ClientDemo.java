package com.klef.jfsd.exam;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("department.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Query q=s.createQuery("update Department set departmentname=:d,set location:n where departmentid=:i");
		
		q.setParameter("d", "Shyam");
		q.setParameter("n", "Hyd");
		q.executeUpdate();
		
		System.out.println("Update");

	}

}
