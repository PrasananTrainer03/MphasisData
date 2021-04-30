package com.zorin.day1;

class Data {
	public void sayHello() {
		System.out.println("Welcome to Java");
	}
	void timing() {
		System.out.println("From 11 to 12");
	}
	private void exam() {
		System.out.println("Exam on Next Sataurday...");
	}
}
public class Demo {
	public static void main(String[] args) {
		Data obj = new Data();
		obj.sayHello();
		obj.timing();
	}
}
