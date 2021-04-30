package com.java.day3;

public class Demo {
    public static void main(String[] args) {
        Employ e1 = new Employ(1, "Debi", 88234);
        Employ e2 = new Employ(3, "Manasa", 88234);
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }
}