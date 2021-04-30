package com.java.day3;

public class Employ {

    int empno;
    String name;
    double basic;

    @Override
    public String toString() {
        return "Employ No " +empno+ " Name " +name+ " Basic " +basic;
    }

    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.empno=1;
        employ.name="Prasad";
        employ.basic=88776;

        System.out.println(employ);
        // System.out.println(employ.empno);
        // System.out.println(employ.name);
        // System.out.println(employ.basic);
    }
}