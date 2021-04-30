package com.java.day3;

public class BoxEmploy {
    public void show(Object ob) {
        // int x = (Integer)ob;
        Employ employ = (Employ)ob;
        System.out.println(employ);
    }
    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.empno=1;
        employ.name="Maaz";
        employ.basic=88234;

        BoxEmploy obj = new BoxEmploy();
        obj.show(employ);
    }
}