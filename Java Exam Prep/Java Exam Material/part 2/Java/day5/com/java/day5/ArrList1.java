package com.java.day5;
import java.util.List;
import java.util.ArrayList;

public class ArrList1 {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Jency");
        names.add("Maaz");
        names.add("Kavitha");
        names.add("Kumar");

        for(Object ob : names) {
            String s = (String)ob;
            System.out.println(s);
        }
    }
}