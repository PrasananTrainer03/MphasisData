package com.java.day3;

public class EmployHash {
    public static void main(String[] args) {
        Employ e1 = new Employ(1, "Debi", 88233);
        Employ e2 = new Employ(3, "MahaLaxmi",82344);
        Employ e3 = new Employ(1, "Debi", 88233);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
    }
}