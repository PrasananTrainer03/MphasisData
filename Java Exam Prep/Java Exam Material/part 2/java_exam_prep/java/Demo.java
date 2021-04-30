package com.zorin.day4;

public class Quiz1 {

	public static void main(String[] args) {
		String s1="Hitesh",s2="Prudhvi",s3="Hitesh";
		String s4 = new String("Hitesh");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
	}
}
