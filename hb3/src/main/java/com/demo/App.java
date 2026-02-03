package com.demo;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Gifts;
import com.model.Laptop;
import com.model.Student;

public class App 
{
    public static void main( String[] args ) {
    
    	Configuration con=new Configuration().configure();
    	SessionFactory sf=con.buildSessionFactory();
    	Session session =sf.openSession();
    	Transaction tx=session.beginTransaction();
    
    	
    	Student s=session.get(Student.class, 2);
    	System.out.println(s);
    	List<Gifts> list = s.getGifts();
    	for(Gifts g:list) {
    		System.out.println(g);
    	}
    	
    
    	
    	
    	//session.save();
	 	tx.commit();
	 	session.close();
    }
     
    
    
}
  