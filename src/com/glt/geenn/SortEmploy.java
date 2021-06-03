package com.glt.geenn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Mani", 88823));
		employList.add(new Employ(3,"Ravali",87113));
		employList.add(new Employ(4,"Apparao",73533));
		employList.add(new Employ(5, "Sai Kiran", 88112));
		employList.add(new Employ(6, "Manoj", 88311));
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
