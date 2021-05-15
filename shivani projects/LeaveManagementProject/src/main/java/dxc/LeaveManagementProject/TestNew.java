package dxc.LeaveManagementProject;

import java.sql.SQLException;

public class TestNew {
	public static void main(String[] args) {
//		try {
//			LeaveDetails[] history=new LeaveDAO().leaveHistory(2000);
//			for (LeaveDetails l : history) {
//				System.out.println(l);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			LeaveDetails[] pending = new LeaveDAO().pendingLeaves(1000);
//			for (LeaveDetails l : pending) {
//				System.out.println(l);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			String result = new LeaveDAO().approveDeny(2, 1000, "YES", "Go A head...");
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
