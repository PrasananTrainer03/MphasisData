package com.glt.geenn;

import java.util.ArrayList;
import java.util.List;

public class GenIntDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(24));
		numbers.add(14);
		numbers.add(88);
		numbers.add(new Integer(33));
		int sum=0;
		for (Integer i : numbers) {
			sum+=i;
		}
		System.out.println("Sum is  " +sum);
	}
}
