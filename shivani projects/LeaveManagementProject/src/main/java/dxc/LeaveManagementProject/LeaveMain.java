package dxc.LeaveManagementProject;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LeaveMain {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		LeaveDetails leave = new LeaveDetails();
		System.out.println("Enter StartDate (yyyy-MM-dd)  ");
		String sd = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		leave.setLeaveStartDate(sdf.parse(sd));
		System.out.println("Enter Leave End Date (yyyy-MM-dd)  ");
		String ed = sc.nextLine();
		leave.setLeaveEndDate(sdf.parse(ed));
		System.out.println("Enter LeaveReason   ");
		leave.setLeaveReason(sc.nextLine());
		System.out.println("Enter Leave Type");
		String ltype = sc.nextLine();
		if(ltype.equals("EL")) {
			leave.setLeaveType(LeaveType.EL);
		}
		if (ltype=="PL") {
			leave.setLeaveType(LeaveType.PL);
		}
		System.out.println(leave.getLeaveType());
		leave.setLeaveStatus(LeaveStatus.PENDING);
		System.out.println("Enter Employee Code   ");
		leave.setEmpId(Integer.parseInt(sc.nextLine()));
		LeaveDAO dao = new LeaveDAO();
		try {
			System.out.println(dao.applyLeave(leave));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
