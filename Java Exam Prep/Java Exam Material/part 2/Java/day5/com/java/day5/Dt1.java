package com.java.day5;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Dt1 {
    public static void main(String[] args) {
        Date obj = new Date();
        System.out.println(obj);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(obj));
    }
}