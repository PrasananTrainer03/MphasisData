package com.java.hib;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ShowData {

	public static void main(String[] args) {
		 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
		      
		    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		    Session session=factory.openSession();  
		    TypedQuery query=session.createQuery("from Employee");  
		    List<Employee> list=query.getResultList(); 
		      
		    for(Employee e : list) {
		    	System.out.println("Employee Id  " +e.getEmployeeId());
		    	System.out.println("Name  " +e.getName());
		    	System.out.println("Email  " +e.getEmail());
		    	Address address = e.getAddress();
		    	System.out.println("Street " +address.getAddressLine1());
		    	System.out.println("City  " +address.getCity());
		    	System.out.println("State  " +address.getState());
		    	System.out.println("Country  " +address.getCountry());
		    	System.out.println("ZipCode  " +address.getPincode());
		    }
		    session.close();  

	}
}
