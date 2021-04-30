package com.java.day3;

class Demo {
    static {
        System.out.println("Hi");
    }
}
public class StConEx {
    static {
        System.out.println("Static Constructor...");
    }
    StConEx() {
        System.out.println("General Constructor...");
    }

    public static void main(String[] args) {
        StConEx obj = new StConEx();
    }
}