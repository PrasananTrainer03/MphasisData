package com.java.day3;

public class BoxDemo {
    public static void main(String[] args) {
        int x=12;
        double y=12.5;
        String name="Hexaware";

        /* Boxing */ 
        Object ob1=x;
        Object ob2=y;
        Object ob3=name;

        /* Unboxing */ 
        int x1 = (Integer)ob1;
        double y1 = (Double)ob2;
        String s1 = (String)ob3; 

        x1++;
        y1++;

        System.out.println("X1 value  " +x1);
        System.out.println("Y1 value  " +y1);
        System.out.println("S1 Value  " +s1);
    }
}