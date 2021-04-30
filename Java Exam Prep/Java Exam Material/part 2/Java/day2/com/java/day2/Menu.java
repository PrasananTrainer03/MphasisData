package com.java.day2;
import java.util.Scanner;
public class Menu {

    public void showMenu() {
        System.out.println("O P T I O N S");
        System.out.println("-------------");
        System.out.println("1. Sunday");
        System.out.println("2. Monday");
        System.out.println("3. Tuesday");
        System.out.println("4. Wednesday");
        System.out.println("5. Thursday");
        System.out.println("6. Friday");
        System.out.println("7. Saturday");
        System.out.println("8. Exit");
    }
    public static void main(String args[]) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            new Menu().showMenu();
            System.out.println("Enter Your Choice  ");
            choice = sc.nextInt();
//            choice = Integer.parseInt(args[0]);
            switch(choice) {
             case 1 : 
                System.out.println("Sunday...");
                break;
            case 2 :
                System.out.println("Monday...");
                break;
            case 3 : 
                System.out.println("Tuesday...");
                break;
            case 4 : 
                System.out.println("Wednesday...");
                break;
            case 5 :
                System.out.println("Thursday...");
                break;
            case 6 : 
                System.out.println("Friday...");
                break;
            case 7 : 
                System.out.println("Saturday...");
                break;
            case 8 : 
                break;
            default : 
                System.out.println("Invalid Choice");
                break; 
                    
            }
        } while(choice != 8);
    }
}