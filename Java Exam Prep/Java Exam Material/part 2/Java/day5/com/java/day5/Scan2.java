package com.java.day5;
import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 Nos   ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum is " +c);
    }
}