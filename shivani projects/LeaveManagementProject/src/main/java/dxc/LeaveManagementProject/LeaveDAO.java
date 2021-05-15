package dxc.LeaveManagementProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LeaveDAO {

	public String approveDeny(int leaveId, int empMgrId, String status, String mgrComment) throws SQLException {
		LeaveDetails leave = searchLeave(leaveId);
		int empId=leave.getEmpId();
		Employee employee = new EmployeeDAO().searchEmploy(empId);
		int mgr = employee.getEmpMgrId();
		System.out.println(empMgrId);
		System.out.println(mgr);
		LeaveStatus lt = LeaveStatus.APPROVED;
		Connection con = ConnectionHelper.getConnection();
		if (empMgrId==mgr) {
			if (status.toUpperCase().equals("YES")) {
				status="APPROVED".trim();
				String cmd = "Update LeaveDetails SET LEA_MGR_COMMENTS=?, LEA_STATUS=? WHERE LEA_ID=?";
				PreparedStatement pst = con.prepareStatement(cmd);
				pst.setString(1, mgrComment);
				pst.setString(2, lt.toString());
				pst.setInt(3, leaveId);
				pst.executeUpdate();
				return "Leave Approved...";
			} else {
				status="DENIED";
				return "Leave Rejected...";
			}
		} else {
			return "Unauthorized manager...";
		}
	}
	public LeaveDetails[] pendingLeaves(int empId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from LeaveDetails WHERE EMP_ID IN(" + 
				" select EMP_ID from Employee Where EMP_MGR_ID=?) AND LEA_STATUS='PENDING'";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		System.out.println(cnt);
		LeaveDetails[] leaves = new LeaveDetails[cnt];
		cmd = "select * from LeaveDetails WHERE EMP_ID IN(" + 
				"  select EMP_ID from Employee Where EMP_MGR_ID=?) AND LEA_STATUS='PENDING'";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, empId);
		rs=pst.executeQuery();
		LeaveDetails leave = null;
		int i=0;
		while (rs.next()) {
			leave = new LeaveDetails();
			leave.setLeaveId(rs.getInt("LEA_ID"));
			leave.setEmpId(rs.getInt("EMP_ID"));
			leave.setLeaveStartDate(rs.getDate("LEA_START_DATE"));
			leave.setLeaveEndDate(rs.getDate("LEA_END_DATE"));
			leave.setLeaveNoOfDays(rs.getInt("LEA_NO_OF_DAYS"));
			leave.setLeaveReason(rs.getString("LEA_REASON"));
			LeaveType lt = LeaveType.valueOf(rs.getString("LEA_TYPE"));
			leave.setLeaveType(lt);
			leave.setLeaveAppliedOn(rs.getDate("LEA_APPLIED_ON"));
			leave.setLeaveManagerComments(rs.getString("LEA_MGR_COMMENTS"));
			LeaveStatus ls = LeaveStatus.valueOf(rs.getString("LEA_STATUS"));
			leave.setLeaveStatus(ls);
			leaves[i]=leave;
			i++;
		}
		return leaves;
		
	}
	public LeaveDetails[] leaveHistory(int empId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "SELECT count(*) cnt FROM LeaveDetails WHERE Emp_ID=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		System.out.println(cnt);
		LeaveDetails[] leaves = new LeaveDetails[cnt];
		cmd = "select * from LeaveDetails WHERE Emp_ID=?";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, empId);
		rs=pst.executeQuery();
		LeaveDetails leave = null;
		int i=0;
		while (rs.next()) {
			leave = new LeaveDetails();
			leave.setLeaveId(rs.getInt("LEA_ID"));
			leave.setEmpId(rs.getInt("EMP_ID"));
			leave.setLeaveStartDate(rs.getDate("LEA_START_DATE"));
			leave.setLeaveEndDate(rs.getDate("LEA_END_DATE"));
			leave.setLeaveNoOfDays(rs.getInt("LEA_NO_OF_DAYS"));
			leave.setLeaveReason(rs.getString("LEA_REASON"));
			LeaveType lt = LeaveType.valueOf(rs.getString("LEA_TYPE"));
			leave.setLeaveType(lt);
			leave.setLeaveAppliedOn(rs.getDate("LEA_APPLIED_ON"));
			leave.setLeaveManagerComments(rs.getString("LEA_MGR_COMMENTS"));
			LeaveStatus ls = LeaveStatus.valueOf(rs.getString("LEA_STATUS"));
			leave.setLeaveStatus(ls);
			leaves[i]=leave;
			i++;
		}
		return leaves;
	}
	public LeaveDetails searchLeave(int leaveId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "Select * from LeaveDetails WHERE LEA_ID=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet rs = pst.executeQuery();
		LeaveDetails leave = null;
		if (rs.next()) {
			leave = new LeaveDetails();
			leave.setLeaveId(rs.getInt("LEA_ID"));
			leave.setEmpId(rs.getInt("EMP_ID"));
			leave.setLeaveStartDate(rs.getDate("LEA_START_DATE"));
			leave.setLeaveEndDate(rs.getDate("LEA_END_DATE"));
			leave.setLeaveNoOfDays(rs.getInt("LEA_NO_OF_DAYS"));
			leave.setLeaveReason(rs.getString("LEA_REASON"));
			LeaveType lt = LeaveType.valueOf(rs.getString("LEA_TYPE"));
			leave.setLeaveType(lt);
			leave.setLeaveAppliedOn(rs.getDate("LEA_APPLIED_ON"));
			leave.setLeaveManagerComments(rs.getString("LEA_MGR_COMMENTS"));
			LeaveStatus ls = LeaveStatus.valueOf(rs.getString("LEA_STATUS"));
			leave.setLeaveStatus(ls);			
		}
		return leave;
	}
	public LeaveDetails[] showLeaves() throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "SELECT count(*) cnt FROM LeaveDetails";
		PreparedStatement pst = con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		System.out.println(cnt);
		LeaveDetails[] leaves = new LeaveDetails[cnt];
		cmd = "select * from LeaveDetails";
		pst = con.prepareStatement(cmd);
		rs=pst.executeQuery();
		LeaveDetails leave = null;
		int i=0;
		while (rs.next()) {
			leave = new LeaveDetails();
			leave.setLeaveId(rs.getInt("LEA_ID"));
			leave.setEmpId(rs.getInt("EMP_ID"));
			leave.setLeaveStartDate(rs.getDate("LEA_START_DATE"));
			leave.setLeaveEndDate(rs.getDate("LEA_END_DATE"));
			leave.setLeaveNoOfDays(rs.getInt("LEA_NO_OF_DAYS"));
			leave.setLeaveReason(rs.getString("LEA_REASON"));
			LeaveType lt = LeaveType.valueOf(rs.getString("LEA_TYPE"));
			leave.setLeaveType(lt);
			leave.setLeaveAppliedOn(rs.getDate("LEA_APPLIED_ON"));
			leave.setLeaveManagerComments(rs.getString("LEA_MGR_COMMENTS"));
			LeaveStatus ls = LeaveStatus.valueOf(rs.getString("LEA_STATUS"));
			leave.setLeaveStatus(ls);
			leaves[i]=leave;
			i++;
		}
		return leaves;
	}
	public int count(int empId, String sdate, String edate) throws SQLException {
		String cmd = "SELECT COUNT(*) cnt FROM leavedetails WHERE EMP_ID = ? " + 
				"         AND LEA_STATUS = 'PENDING' AND " + 
				"       (  LEA_START_DATE <= ? AND LEA_END_DATE >= ? OR " + 
				"        LEA_START_DATE <= ? AND LEA_END_DATE >= ? )";
		Connection con = ConnectionHelper.getConnection();
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empId);
		pst.setString(2, sdate);
		pst.setString(3, sdate);
		pst.setString(4, edate);
		pst.setString(5, edate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		return cnt;
	}
	
	public String applyLeave(LeaveDetails leave) throws SQLException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sd = sdf.format(leave.getLeaveStartDate());
		String ed = sdf.format(leave.getLeaveEndDate());
		int cnt = count(leave.getEmpId(), sd, ed);
		System.out.println("Count is  " +cnt);
		Connection con = ConnectionHelper.getConnection();
		  long ms = leave.getLeaveEndDate().getTime() - leave.getLeaveStartDate().getTime();
		    long m = ms / (1000 * 24 * 60 * 60);
		    int days = (int) m;
		    days = days + 1;
		leave.setLeaveNoOfDays(days);
		EmployeeDAO edao = new EmployeeDAO();
		Employee found = edao.searchEmploy(leave.getEmpId());
		int bal = found.getEmpLeaveBalance();
		int diff = bal - leave.getLeaveNoOfDays();
		if (leave.getLeaveNoOfDays() < 0) {
			return "Start-Date must be Less than End-Date...";
		} else if(bal - leave.getLeaveNoOfDays() < 0) {
			return "Insufficient Leave Balance...";
		} else if (cnt==1) {
			return "You are already applied on the given Dates...";
		}
		else {
		String cmd = "INSERT INTO leavedetails(LEA_START_DATE,LEA_END_DATE,LEA_NO_OF_DAYS,LEA_REASON"
				+ ",LEA_TYPE,LEA_APPLIED_ON,EMP_ID,LEA_STATUS) VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(cmd);
		Date today = new Date();
		String td = sdf.format(today);
		String sdate = sdf.format(leave.getLeaveStartDate());
		String endDate = sdf.format(leave.getLeaveEndDate());
		pst.setString(1, sdate);
		pst.setString(2, endDate);
		pst.setInt(3, leave.getLeaveNoOfDays());
		pst.setString(4, leave.getLeaveReason());
		pst.setString(5, leave.getLeaveType().toString().trim());
		pst.setString(6, td);
		pst.setInt(7, leave.getEmpId());
		String lstatus = "PENDING";
		pst.setString(8, lstatus);
		pst.executeUpdate();
		cmd = "UPDATE employee SET EMP_LEAVE_BALANCE = ? WHERE EMP_ID = ?";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, diff);
		pst.setInt(2, leave.getEmpId());
		pst.executeUpdate();
		return "Leave Applied Successfully...";
		}
	}
}
