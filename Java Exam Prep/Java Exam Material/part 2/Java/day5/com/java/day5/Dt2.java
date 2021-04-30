package com.java.day5;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Dt2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String dt;
        System.out.println("Enter Date (yyyy-MM-dd)   ");
        dt = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = sdf.parse(dt);
        System.out.println(dob);
    }
}