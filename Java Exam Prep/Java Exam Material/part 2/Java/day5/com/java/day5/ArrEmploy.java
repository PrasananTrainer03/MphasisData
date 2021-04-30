package com.java.day5;
import java.util.List;
import java.util.ArrayList;

public class ArrEmploy {
    public static void main(String[] args) {
        List empList = new ArrayList();
        empList.add(new Employ(1, "Lenin",88243));
        empList.add(new Employ(2, "Sundaram",91344));
        empList.add(new Employ(3, "Jahnavi",90333));
        empList.add(new Employ(4, "Kavitha",88333));
        empList.add(1);
        empList.add(12.5);
        empList.add("Xyz");

        for(Object ob : empList) {
            Employ employ = (Employ)ob;
            System.out.println(employ);
        }
    }
}