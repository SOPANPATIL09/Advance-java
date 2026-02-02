package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Laptop;
import com.model.Student;

public class App 
{
    public static void main( String[] args ) {
    
    	Configuration con=new Configuration().configure();
    	SessionFactory sf=con.buildSessionFactory();
    	Session session =sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	
    	Student s=session.get(Student.class, 3);
          System.out.println(s);
          System.out.println(s.getLaptop());
        
	 	tx.commit();
	 	session.close();
    }
     
    
    
}
