package com.java.day5;
import java.util.List;
import java.util.ArrayList;

public class GenEmploy {
    public static void main(String[] args) {
        List<Employ> empList = new ArrayList<Employ>();
        empList.add(new Employ(1, "Lenin",88243));
        empList.add(new Employ(2, "Sundaram",91344));
        empList.add(new Employ(3, "Jahnavi",90333));
        empList.add(new Employ(4, "Kavitha",88333));
        // empList.add(12);
        for(Employ employ : empList) {
            System.out.println(employ);
        }
    }
}