package com.java.day3;

public class BoxTest {

    public void show(Object ob) {
       // System.out.println(ob.getClass().getName());
        System.out.println(ob.getClass().getSimpleName());
        String type = ob.getClass().getSimpleName();
        if (type.equals("Integer")) {
            System.out.println("Integer Casting...");
            int x = (Integer)ob;
        }
        if (type.equals("Double")) {
            System.out.println("Double Casting...");
            double x = (Double)ob;
        }
        if (type.equals("String")) {
            System.out.println("String Casting...");
            String x = (String)ob;
        }
    }
    public static void main(String[] args) {
        int x=12;
        double y=12.5;
        String name="hexaware";
        BoxTest obj = new BoxTest();
        obj.show(x);
        obj.show(y);
        obj.show(name);
    }
}