package com.java.day3;

public class Overload1 {

    public void show(int x) {
        System.out.println("Show w.r.t. Integer " +x);
    }
    public void show(String x) {
        System.out.println("Show w.r.t. String " +x);
    }
    public void show(boolean x) {
        System.out.println("Show w.r.t. Boolean  " +x);
    }
    public static void main(String[] args) {
        Overload1 obj = new Overload1();
        obj.show(12);
        obj.show("Hexaware");
        obj.show(true);
    }
}