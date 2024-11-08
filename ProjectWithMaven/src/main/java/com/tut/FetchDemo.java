package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		//get,load
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//get student 
		Student st = (Student)session.get(Student.class,223);
		System.out.println(st);
		
		//load Address
		Address ad = new Address();
		ad = session.load(Address.class, 1);
		System.out.println(ad.getStreet()+"\n"+ad.getCity()+"\n"+ad.getAddedDate());
		
		
		
		session.close();
		factory.close();
		
	}

}
