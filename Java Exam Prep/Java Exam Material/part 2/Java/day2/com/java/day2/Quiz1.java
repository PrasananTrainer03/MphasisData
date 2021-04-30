package com.java.day2;

public class Quiz1 {
    int x;
    public static void main(String[] args) {
        Quiz1 obj1 = new Quiz1();
        obj1.x=12;
        Quiz1 obj2 = obj1;
        obj2.x=13;
        System.out.println(obj1.x);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}