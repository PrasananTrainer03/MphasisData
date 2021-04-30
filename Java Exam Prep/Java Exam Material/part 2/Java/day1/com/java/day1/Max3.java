package com.java.day1;

public class Max3 {
    public void check(int a, int b, int c) {
        int m = a;
        if (m < b) {
            m = b;
        }
        if (m < c) {
            m = c;
        }
        System.out.println("Maximum Value is  " +m);
    }
    public static void main(String[] args) {
        int a, b, c;
        a=12;
        b=15;
        c=8;
        Max3 obj = new Max3();
        obj.check(a, b, c);
    }
}