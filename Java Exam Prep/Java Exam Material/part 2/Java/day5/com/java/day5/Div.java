package com.java.day5;

public class Div {
    public static void main(String[] args) {
        int a,b,c;
        try {
          a=Integer.parseInt(args[0]);
          b=Integer.parseInt(args[1]);
          c=a/b;
          System.out.println("Div Value  " +c);
        } catch (NumberFormatException e) {
            System.out.println("String cannot be converted as Integer...");
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero impossible...");
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Arguments are not passed...");
        } 
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Program from Batch 3...");
        }
    }
}