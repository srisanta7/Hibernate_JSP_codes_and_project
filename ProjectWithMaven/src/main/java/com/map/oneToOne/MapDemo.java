package com.map.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
     public static void main(String args[]) {
    	 Configuration cfg = new Configuration();
    	 cfg.configure("hibernate.cfg.xml");
    	 SessionFactory factory = cfg.buildSessionFactory();
    	 
    	 //creating question
    	 Question q1 = new Question();
    	 q1.setQuestion_Id(111);
    	 q1.setQuestion("what is java?");
    	 Answer a1 = new Answer();
    	 a1.setAnswerId(1234);
    	 a1.setAnswer("java is a programing language");
    	 q1.setAnswer(a1);
    	 a1.setQuestion(q1);
    	 
    	 Session s = factory.openSession();
    	 Transaction tx = s.beginTransaction();
    	 tx.commit();
    	 s.save(q1);
    	 s.save(a1);
    	 factory.close();
    	 
    	 
     }
}
