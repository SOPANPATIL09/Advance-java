package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App 
{
    public static void main( String[] args ) {
    
    	Configuration con=new Configuration().configure();
    	SessionFactory sf=con.buildSessionFactory();
    	Session session =sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	Student s1=new Student();
    	
    	s1.setName("ajay tula");
    	s1.setCity("katarni ");
    	s1.setPercentage(1.2);
    
    
    	
    	session.save(s1);
    	
	 	tx.commit();
	 	session.close();
    }
     
    
    
}
