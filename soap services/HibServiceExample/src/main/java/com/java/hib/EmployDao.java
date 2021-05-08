package com.java.hib;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployDao {

	public Employ[] showEmploy() {
		SessionFactory sf = SessionFactoryHelper.getFactory();
		Session s = sf.openSession();
		TypedQuery query=s.createQuery("from Employ");  
		List<Employ> list=query.getResultList(); 
		return list.toArray(new Employ[list.size()]);
	}
}
