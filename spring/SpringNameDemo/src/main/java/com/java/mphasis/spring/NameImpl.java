package com.java.mphasis.spring;

public class NameImpl implements Name {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return firstName + " " +lastName;
	}
	
	
}
