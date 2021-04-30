package com.java.day3;

public class LeaveMain {
    public static void main(String[] args) {
        LeaveStatus ls = LeaveStatus.PENDING;
        LeaveType lt = LeaveType.SSL;
        Leave l1 = new Leave(1, ls, lt, "Higher Studies");
        System.out.println(l1);
        /* used to convert enum into string */
        System.out.println(ls.getClass().getSimpleName());
        String s1 = String.valueOf(ls);
        System.out.println(s1.getClass().getSimpleName());
        String str="Approved";
        LeaveStatus nls = null;
        if (str.equals("Pending")) {
            nls = LeaveStatus.PENDING;
        }
        if (str.equals("Approved")) {
            nls = LeaveStatus.APPROVED;
        }
        System.out.println(nls);
    }
}