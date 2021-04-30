package com.java.day5;
import java.util.List;
import java.util.ArrayList;

public class GenStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "Kumar", "Sundaram", 8.3));
        studentList.add(new Student(2, "Kavitha", "M", 9.1));
        studentList.add(new Student(3, "Mansi", "Nema", 7.9));
        studentList.add(new Student(4, "Jency", "Priya", 8.3));
        studentList.add(new Student(5, "Jashwanth", "Durgam", 9.3));
        for(Student s : studentList) {
            System.out.println(s);
        }
    }
}