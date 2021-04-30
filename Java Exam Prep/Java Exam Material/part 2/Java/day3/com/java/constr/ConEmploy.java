package com.java.constr;

public class ConEmploy {
    public static void main(String[] args) {
        Employ obj1 = new Employ();
        System.out.println(obj1);
        Employ obj2 = new Employ(67, "Neha", 88235);
        System.out.println(obj2);
    }
}