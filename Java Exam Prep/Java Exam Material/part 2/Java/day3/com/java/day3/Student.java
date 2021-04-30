package com.java.day3;

public class Student {
    int sno;
    String firstName;
    String lastName;
    double cgp;

    public String toString() {
        return "Student No  " +sno+ " FirstName " +firstName + " LastName " +lastName+ 
             " Cgp " +cgp;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sno=1;
        s1.firstName="Debi";
        s1.lastName="Prasad";
        s1.cgp=8.8;
        System.out.println(s1);
    }
}