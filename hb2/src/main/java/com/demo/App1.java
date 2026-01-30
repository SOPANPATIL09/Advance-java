package com.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.model.Employee;

import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App1 {
	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure();
	 	
	     SessionFactory sf=con.buildSessionFactory();
	     
	    Session session =sf.openSession();
	     Transaction tx=session.beginTransaction();
	      
	      
	  //session.update(e);
	  tx.commit();
	  session.close();
	}
		
	        
	                
}   
	               
	            	
	            	
	            
   
	



