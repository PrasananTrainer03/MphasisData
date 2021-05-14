package org.hib.rest.mphasis;

public class Dummy {

	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.setEmpno(8822);
		employ.setName("Raj");
		employ.setGender("Male");
		employ.setDept("Java");
		employ.setDesig("SE");
		employ.setBasic(65522);
		System.out.println(new EmployDao().addEmploy(employ));
	}
}
