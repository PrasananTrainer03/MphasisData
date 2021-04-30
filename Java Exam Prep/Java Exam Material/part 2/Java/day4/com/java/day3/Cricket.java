package com.java.day3;
public class Cricket {
    static int score;
    public void incr(int x) {
        score +=x;
    }
    public static void main(String[] args) {
        Cricket fb = new Cricket();
        Cricket sb = new Cricket();
        Cricket ext = new Cricket();

        fb.incr(53);
        sb.incr(11);
        ext.incr(19);

        System.out.println("Total Score  " +Cricket.score);
    }
}