package com.java.day3;

public class TestEmp {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setEmpno(1);
        e1.setName("Mohit");
        e1.setBasic(88255);
        System.out.println("Employ No " +e1.getEmpno());
        System.out.println("Employ Name " +e1.getName());
        System.out.println("Employ Salary " +e1.getBasic());
    }
}