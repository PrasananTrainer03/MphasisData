package com.java.constr;

public class ConDemo {
    int a,b;

    ConDemo() {
        a=5;
        b=7;
    }

    ConDemo(int a, int b) {
        this.a=a;
        this.b=b;
    }
    @Override
    public String toString() {
        return "A value  " +a+ " B value " +b;
    }
    public static void main(String[] args) {
        ConDemo obj1 = new ConDemo();
        System.out.println(obj1);
        ConDemo obj2 = new ConDemo(12,7);
        System.out.println(obj2);
    }
}