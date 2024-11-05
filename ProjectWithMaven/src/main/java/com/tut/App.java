package com.tut;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	 
         System.out.println("project started");    
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory factory = cfg.buildSessionFactory();
         System.out.println(factory);
         //creating student
         Student st = new Student();
         st.setId(223);
         st.setName("bunu");
         st.setCity("bnj");
         
         //creating address object
         Address ad = new Address();
         ad.setStreet("street1");
         ad.setCity("bnj");
         ad.setOpen(true);
         ad.setX(12.21);
         ad.setAddedDate(new Date());
         FileInputStream fis = new FileInputStream("src/main/java/pic.png");
         byte[] data = new byte[fis.available()];
         fis.read();
         ad.setImage(data);
         
         Session session = factory.openSession();
         
         Transaction tx = session.beginTransaction();
         
         session.save(st);
         session.save(ad);
         tx.commit();
         
         session.close();
    }
}
