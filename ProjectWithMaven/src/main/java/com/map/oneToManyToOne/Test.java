package com.map.oneToManyToOne;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory factory = cfg.buildSessionFactory();
	    
	    Question q1 = new Question();
	    q1.setQuestionId(121);
	    q1.setQuestion("what is java");
	    
	    Answer a1 = new Answer();
	    Answer a2 = new Answer();
	    
	    a1.setAnswerId(111);
	    a1.setAnswer("java is a programming language");
	    a1.setQuestion(q1);
	    
	    a2.setAnswerId(112);
	    a2.setAnswer("java is use to develop enterprice applications");
	    a2.setQuestion(q1);
	    
	    ArrayList<Answer> ans = new ArrayList<Answer>();
	    q1.setAnswers(ans);
	    
	    Session s = factory.openSession();
	    Transaction t = s.beginTransaction();
	    
	    t.commit();
	    
	    s.save(q1);
	    s.save(a1);
	    s.save(a2);
	    
	    s.close();

	}

}
