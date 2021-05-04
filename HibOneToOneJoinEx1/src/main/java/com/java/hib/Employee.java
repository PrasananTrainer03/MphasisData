package com.java.hib;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="mphasisEmp")  
public class Employee {
	private int employeeId;    
	private String name;
	private String email;
	private Address address;
	
	 @Id  
	 @GeneratedValue(strategy=GenerationType.AUTO)  
	 @PrimaryKeyJoinColumn  
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
