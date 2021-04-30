package com.java.day2;

public class Odd {
    public void show(int n) {
        for(int i=1;i<=n;i+=2) {
            System.out.println("Odd  " +i);
        }
    }
    public static void main(String[] args) {
        int n=20;
        Odd obj = new Odd();
        obj.show(n);
    }
}