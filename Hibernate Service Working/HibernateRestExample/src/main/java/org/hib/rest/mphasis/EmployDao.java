package org.hib.rest.mphasis;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployDao {

	public Employ[] showEmploy() {
	
		SessionFactory sf=SessionHelper.getFactory();
		Session s=sf.openSession();
		TypedQuery  q=s.createQuery("from Employ");
		List<Employ> list=q.getResultList();
		return list.toArray(new Employ[list.size()]);
	}
	
	public String addEmploy(Employ employ) {
		SessionFactory sf = SessionHelper.getFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(employ);
		t.commit();
		return "record inserted...";
	}
	
	public Employ search(int empno) {
		SessionFactory sf=SessionHelper.getFactory();
		Session s=sf.openSession();
		TypedQuery q=s.createQuery("from Employ where empno=" +empno);
		List<Employ> list = q.getResultList();
		if (list.size()==1) {
			return list.get(0);
		} else {
			return null;
		}
	}
}
