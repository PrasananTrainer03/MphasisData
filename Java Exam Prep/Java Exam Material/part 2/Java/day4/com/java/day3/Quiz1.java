package com.java.day3;

public class Quiz1 {
    static int score;
    
    public void incr() {
        score++;
    }

    public void show() {
        System.out.println(score);
    }

    public static void main(String[] args) {
        Quiz1 obj1 = new Quiz1();
        Quiz1 obj2 = new Quiz1();
        Quiz1 obj3 = new Quiz1();
        obj1.incr();
        obj2.incr();
        obj3.incr();
        obj1.show();
    }
}