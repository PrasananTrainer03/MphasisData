package com.java.day1;

class Data {
    public void sayHello() {
        System.out.println("welcome to java...");
    }
    void company() {
        System.out.println("Hexaware...");
    }
    private void exam() {
        System.out.println("Exam on Thursday...");
    }
}
public class Demo {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.sayHello();
        obj.company();
     //   obj.exam();
    }
}