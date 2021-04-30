package com.java.day3;

public class DemoStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Debi", "Prasad", 8.4);
        Student s2 = new Student(3, "Mohit", "Charan", 8.4);
        Student s3 = new Student(1, "Debi", "Prasad", 8.4);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        // System.out.println(s1);
        // System.out.println(s2);
    }
}