package com.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
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
	    
		   List<Employee> list=session.createCriteria(Employee.class)
	       .add(Restrictions.eq("salary",  session.createCriteria(Employee.class)
		   .add(Restrictions.lt("salary",  session.createCriteria(Employee.class)
		  .add(Restrictions.lt("salary",session.createCriteria(Employee.class)
		    .setProjection(Projections.max("salary"))
		    .uniqueResult()
		      ))
		     .setProjection(Projections.max("salary"))
		     .uniqueResult()
		      ))
		     .setProjection(Projections.max("salary"))
		     .uniqueResult()
		      ))
	         .list();
		   for(Employee e:list)
			   System.out.println(e);
  // session.save();
	  tx.commit(); 
	  session.close();
	}

	        
	                
}   
	               
	            	
	            	
	            
   
	



