package com.java.day2;

public class Array1 {
    public void show() {
        int[] a = new int[]{12,5,77,32,88};
        // for(int i=0;i<a.length;i++) {
        //     System.out.println(a[i]);
        // }
        for(int i : a) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Array1 obj = new Array1();
        obj.show();
    }
}