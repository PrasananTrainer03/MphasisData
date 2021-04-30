package com.java.day3;
import java.util.Objects;

public class Student {
    private int sno;
    private String firstName;
    private String lastName;
    private double cgp;

    @Override 
    public boolean equals(Object ob) {
        Student s = (Student)ob;
        if (Objects.equals(this.sno, s.sno) && Objects.equals(this.firstName, s.firstName) &&
            Objects.equals(this.lastName, s.lastName) && Objects.equals(this.cgp, s.cgp) ) {
            return true;
        } else {
            return false;
        }
    }
    public Student() {}

    public Student(int argSno, String argFirstName,
                    String argLastName, double argCgp) {
        this.sno = argSno;
        this.firstName = argFirstName;
        this.lastName = argLastName;
        this.cgp = argCgp;
    }

    public String toString() {
        return String.format("%s %s %s %s",sno, firstName, lastName, cgp);
    }
}