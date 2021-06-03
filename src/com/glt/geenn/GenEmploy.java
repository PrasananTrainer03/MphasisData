package com.glt.geenn;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Sai Kiran", 88322));
		employList.add(new Employ(3, "Ravali", 88233));
		employList.add(new Employ(4, "Manoj", 88231));
		employList.add(new Employ(5, "Mani", 88663));
		
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
