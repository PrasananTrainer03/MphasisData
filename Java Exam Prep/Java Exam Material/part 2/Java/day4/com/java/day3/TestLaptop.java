package com.java.day3;

public class TestLaptop {
    public static void main(String[] args) {
        Laptop obj = new Laptop(45,33,"Lenovo");
        System.out.println(obj.getHeight());
        System.out.println(obj.getWidth());
        System.out.println(obj.getCompany());
        obj.height=45;
    }
}