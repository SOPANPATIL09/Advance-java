package com.demo;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Departments;
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
         int count=0;
    	Departments d=session.get(Departments.class, 3);
        System.out.println(d);
        
         List<Student> list = d.getStudent();
            for(Student s:list) {
            	count+=s.getGifts().size();
            }  
            
            System.out.println(count);
            
      
      
    	   
	 	tx.commit();
	 	session.close();
    	  
    }
     
    
    
}
  