package com.hexaware.util;
import com.hexaware.factory.EmployFactory;
import com.hexaware.model.Employ;
import java.util.Scanner;

public class CliMain {
    public static void main(String[] args) {
        // Employ[] employList = EmployFactory.showEmploy();
        // for(Employ e : employList) {
        //     System.out.println(e);
        // }
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Employ No   ");
        // int empno = sc.nextInt();
        // Employ result = EmployFactory.show(empno);
        // if (result != null) {
        //     System.out.println(result);
        // } else {
        //     System.out.println("Not Found...");
        // }
        // int basic;
        // String name,dept,desig;
        // System.out.println("Enter Name  ");
        // name = sc.next();
        // System.out.println("Enter Department  ");
        // dept = sc.next();
        // System.out.println("Enter Designation  ");
        // desig = sc.next();
        // System.out.println("Enter Basic  ");
        // basic = sc.nextInt();
        // System.out.println(EmployFactory.insertEmploy(name, dept, desig, basic));
        int empno;
        System.out.println("Enter Employ No  ");
        empno = sc.nextInt();
        System.out.println(EmployFactory.deleteEmploy(empno));
        Runtime.getRuntime().halt(0);
    }
}