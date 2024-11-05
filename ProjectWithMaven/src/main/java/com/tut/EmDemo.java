package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    //@Embeddable
	public static void main(String[] args) {
		 System.out.println("project started");    
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
         System.out.println(factory);
         //creating student
         Student st = new Student();
         st.setId(223);
         st.setName("jinu");
         st.setCity("bnj");
         
         Certificate c = new Certificate();
         c.setCourse("android");
         c.setDuratin("3 months");
         st.setCrt(c);
         
         Session session = factory.openSession();
         
         Transaction tx = session.beginTransaction();
         
         session.save(st);
         tx.commit();
         
         session.close();
          
         
	}

}
