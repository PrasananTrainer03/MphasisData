package com.java.day3;

public class Emp {
    
    int empno;
    String name;
    double basic;

    @Override
    public String toString() {
        return "Employ No " +empno+ " Name " +name+ " Basic " +basic;
    }

    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.empno=1;
        e1.name="Manasa";
        e1.basic=88245;

        Emp e2 = new Emp();
        e2.empno=3;
        e2.name="Divya";
        e2.basic=88245;

        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }
}