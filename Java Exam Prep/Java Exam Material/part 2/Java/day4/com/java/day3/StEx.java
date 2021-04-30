package com.java.day3;

public class StEx {
    
    static int score;
    static {
        score = 20;
    }
    public void show() {
        System.out.println("From Show Method...");
    }

    public static void display() {
        System.out.println("From Display Method...");
    }

    public static void main(String[] args) {
        StEx.display();
        StEx obj = new StEx();
        obj.show();
        System.out.println(score);
    }
}