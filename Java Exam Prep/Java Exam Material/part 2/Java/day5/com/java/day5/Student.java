package com.java.day5;

public class Student {
    private int sno;
    private String firstName;
    private String lastName;
    private double cgp;

    public Student() {}

    public Student(int argSno, String argFirstName, String argLastName, double argCgp) {
        this.sno=argSno;
        this.firstName = argFirstName;
        this.lastName = argLastName;
        this.cgp = argCgp;
    }

    public String toString() {
        return String.format("%s  %s  %s   %s", sno, firstName, lastName, cgp);
    }
}