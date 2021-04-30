package com.java.day2;

public class ArrayStr {
    public void show() {
        String[] names = new String[] {
            "Debi",
            "Maaz",
            "Manasa",
            "Divya",
            "Jensy"
        };
        // for(int i=0;i<names.length;i++) {
        //     System.out.println(names[i]);
        // }
        for(String s : names) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        ArrayStr obj = new ArrayStr();
        obj.show();
    }
}