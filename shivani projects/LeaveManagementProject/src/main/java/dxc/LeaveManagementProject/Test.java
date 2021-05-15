package dxc.LeaveManagementProject;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
//		Connection con = ConnectionHelper.getConnection();
//		System.out.println("Connected...");
//		
//		EmployeeDAO dao = new EmployeeDAO();
//		Employee[] res = dao.showEmploy();
//		for (Employee employee : res) {
//			System.out.println(employee.getEmpId());
//		}
//		System.out.println();
//		
//		Employee e = dao.searchEmploy(1000);
//		System.out.println(e.getEmpDptName());
		LeaveDAO dao=new LeaveDAO();
		try {
			LeaveDetails[] list = dao.showLeaves();
			for (LeaveDetails l : list) {
				System.out.println(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int leaveId=2;
		try {
			LeaveDetails result = new LeaveDAO().searchLeave(leaveId);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
