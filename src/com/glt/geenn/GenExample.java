package com.glt.geenn;

class Demo<T> {
	public  void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value " +a+ " B value  " +b);
	}
}
public class GenExample {

	public static void main(String[] args) {
		int a=5,b=7;
		Demo obj = new Demo();
		obj.swap(a, b);
		String s1="Manoj", s2="Apparao";
		obj.swap(s1, s2);
		double b1=12.5,b2=6.2;
		obj.swap(b1, b2);
	}
}
