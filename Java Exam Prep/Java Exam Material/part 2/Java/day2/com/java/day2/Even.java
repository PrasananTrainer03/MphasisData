package com.java.day2;

public class Even {
    public void show(int n) {
        int i=0;
        while(i < n) {
            i=i+2;
            System.out.println("Even  " +i);
        }
    }
    public static void main(String[] args) {
        int n = 20;
        Even obj = new Even();
        obj.show(n);
    }
}