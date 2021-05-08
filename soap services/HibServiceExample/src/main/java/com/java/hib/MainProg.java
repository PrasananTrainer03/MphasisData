package com.java.hib;

public class MainProg {

	public static void main(String[] args) {
		Employ[] result = new EmployDao().showEmploy();
		for(Employ e : result) {
			System.out.println(e.getEmpno());
		}
	}
}
