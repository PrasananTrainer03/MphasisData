import java.util.ArrayList;
import java.util.List;

public class Lamb5 {
    public static void main(String[] args) {
        List<Employ> list=new ArrayList<Employ>();
		
		list.add(new Employ(1,"Prasanna",58344)); 
		list.add(new Employ(3,"Darshan",53222));
		list.add(new Employ(4,"Vidya",62133)); 
		list.add(new Employ(5,"Chaithra",62334));

      //  list.forEach((emp) -> System.out.println(emp));
        list.forEach(System.out::println);
        // String[] names = new String[]{"Krishna","Mohit","Maaz","Neelima","Mansi"};
        // names.forEach(System.out::println);

        // names.forEach( (x) -> System.out.println(x));
    }
}