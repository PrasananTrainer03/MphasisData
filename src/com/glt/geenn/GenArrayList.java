package com.glt.geenn;

import java.util.ArrayList;
import java.util.List;

public class GenArrayList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Sai Kiran");
		names.add("Mani");
		names.add("Manoj");
		names.add("Apparao");
		names.add("Ravali");
		
		for (String s : names) {
			System.out.println(s);
		}
	}
}
