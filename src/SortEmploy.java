import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
	//	Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		//employs.add("Abc");
		employs.add(new Employ(1, "Mani", 88823));
		employs.add(new Employ(3,"Ravali",87113));
		employs.add(new Employ(4,"Apparao",73533));
		employs.add(new Employ(5, "Sai Kiran", 88112));
		employs.add(new Employ(6, "Manoj", 88311));
		
		for (Object ob : employs) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
