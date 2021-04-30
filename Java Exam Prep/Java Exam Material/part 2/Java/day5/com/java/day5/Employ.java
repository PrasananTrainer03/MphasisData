package com.java.day5;

public class Employ {

    private int empno;
    private String name;
    private double basic;

    public Employ() {} 

    public Employ(int argEmpno, String argName, double argBasic) {
        this.empno=argEmpno;
        this.name=argName;
        this.basic=argBasic;
    }

    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int argEmpno) {
        this.empno=argEmpno;
    }

    public String getName() {
        return name;
    }

    public void setName(String argName) {
        this.name = argName;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double argBasic) {
        this.basic = argBasic;
    }

    @Override
    public String toString() {
        return String.format("%5s %20s %25s",empno, name, basic);
    }
}