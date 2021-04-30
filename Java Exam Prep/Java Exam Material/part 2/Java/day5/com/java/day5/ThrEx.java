package com.java.day5;

public class ThrEx {
    public void show(int x) {
        if (x < 0) {
            throw new ArithmeticException("Negative Nos Not Allowed...");
        } else if (x == 0) {
            throw new NumberFormatException("Zero is Invalid Value...");
        } else {
            System.out.println("X value is  " +x);
        }
    }
    public static void main(String[] args) {
        ThrEx obj = new ThrEx();
        try {
            obj.show(-5);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}