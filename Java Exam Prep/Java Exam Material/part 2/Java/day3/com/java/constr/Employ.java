package com.java.constr;

public class Employ {
    int empno;
    String name;
    double basic;

    Employ() {
        empno = 1;
        name = "Raj";
        basic = 88234;
    }

    Employ(int argEmpno, String argName, double argBasic) {
        this.empno = argEmpno;
        this.name = argName;
        this.basic = argBasic;
    }

    @Override
    public String toString() {
        return "Empno " +empno+ " Name " +name+ " Basic " +basic;
    }
    
}