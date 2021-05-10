package g1.EmployServiceExample;

import java.sql.Connection;
import java.sql.SQLException;

public class Dummy {

	public static void main(String[] args) throws SQLException {
//		Connection con = ConnectionHelper.getConnection();
//		System.out.println("Connected...");
//		EmployDAO dao = new EmployDAO();
//		Employ[] result = dao.showEmploy();
//		for (Employ employ : result) {
//			System.out.println(employ);
//		}
//		System.out.println(new CustomerDAO().authenticate("Rahul", "Rahul@123"));
		Employ employ = new Employ();
		employ.setEmpno(56);
		employ.setName("Raj");
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(88233);
		System.out.println(new EmployDAO().addEmploy(employ));
	}
}
