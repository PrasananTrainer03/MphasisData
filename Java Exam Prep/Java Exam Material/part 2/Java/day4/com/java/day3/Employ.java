package com.java.day3;
import java.util.Objects;

public class Employ {
    private int empno;
    private String name;
    private double basic;

    @Override 
    public int hashCode() {
        return Objects.hash(empno, name, basic);
    }
    @Override
    public boolean equals(Object ob) {
        Employ e = (Employ)ob;
        if (e.basic == basic) {
            return true;
        } else {
            return false;
        }
    }

    public Employ() {

    }
    public Employ(int argEmpno, String argName, double argBasic) {
        this.empno = argEmpno;
        this.name = argName;
        this.basic = argBasic;
    }

    @Override
    public String toString() {
        return String.format("%s  %s %s",empno, name, basic);
    }
}