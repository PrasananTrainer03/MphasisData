package com.java.day2;

public class Factors {
    public void show(int n) {
        for(int i=1;i<=n;i++) {
            if (n%i==0) {
                System.out.println("Factor  " +i);
            }
        }
    }
    public static void main(String[] args) {
        int n=30;
        Factors obj = new Factors();
        obj.show(n);
    }
}