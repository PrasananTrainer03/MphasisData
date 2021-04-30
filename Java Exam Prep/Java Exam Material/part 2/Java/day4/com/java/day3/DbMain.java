package com.java.day3;

public class DbMain {
    public static void main(String[] args) {
       int opt = 2;
       DbOperations db = null;
       if (opt == 2) {
           db = DbOperations.CREATE;
       }
       System.out.println(db);
    }
}