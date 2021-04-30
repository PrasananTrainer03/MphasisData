package com.java.day3;

public class StrIncr {
    public String incr(String str) {
        String sub = str.substring(1);
        int x = Integer.parseInt(sub);
        x++;
        System.out.println(x);
        String res="";
        if (x >= 1 && x <= 9) {
            res = "C00"+x;
        }
        if (x >= 10 && x <= 99) {
            res = "C0"+x;
        }
        if (x >= 100 && x <= 999) {
            res = "C"+x;
        }
        return res;
    }
    public static void main(String[] args) {
        String str="C077";
        StrIncr obj = new StrIncr();
        System.out.println(obj.incr(str));
    }
}