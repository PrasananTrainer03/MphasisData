package com.hexaware.model;

public class Employ {

    private int empno;
    private String name;
    private String dept;
    private String desig;
    private int basic;

    public Employ() {}

    public Employ(int argEmpno, String argName, String argDept, String argDesig,
                        int argBasic) {
        this.empno = argEmpno;
        this.name = argName;
        this.dept = argDept;
        this.desig = argDesig;
        this.basic = argBasic;
    }

    @Override 
    public String toString() {
        return String.format("%s   %s  %s    %s   %s", empno, name, dept, desig, basic);
    }
}