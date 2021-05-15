package dxc.LeaveManagementProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class EmployeeDAO {

	public Employee searchEmploy(int empno) {
		Connection con=ConnectionHelper.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement("select * from Employee where EMP_ID=?");
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			Employee e = null;
			if(rs.next()) {
				e=new Employee();
				e.setEmpId(rs.getInt("EMP_ID"));
				e.setEmpName(rs.getString("EMP_NAME"));
				e.setEmpEmail(rs.getString("EMP_EMAIL"));
				e.setEmpMobile(rs.getString("EMP_MOB_NO"));
				e.setEmpDptName(rs.getString("EMP_DPT_NAME"));
				e.setEmpDateOfJoin(rs.getDate("EMP_DATE_JOINED"));
				e.setEmpMgrId(rs.getInt("EMP_MGR_ID"));
				e.setEmpLeaveBalance(rs.getInt("EMP_LEAVE_BALANCE"));

			}
			return e;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	public Employee[] showEmploy() {
		Connection con=ConnectionHelper.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement("select count(*) cnt from Employee");
			ResultSet rs=pst.executeQuery();
			rs.next(); 
			int cnt=rs.getInt("cnt"); 
			Employee[] arr=new Employee[cnt]; 
			pst=con.prepareStatement("select * from Employee"); 
			rs=pst.executeQuery();
			int i=0;
			Employee e=null;
			while(rs.next()) {
				e=new Employee();
				e.setEmpId(rs.getInt("EMP_ID"));
				e.setEmpName(rs.getString("EMP_NAME"));
				e.setEmpEmail(rs.getString("EMP_EMAIL"));
				e.setEmpMobile(rs.getString("EMP_MOB_NO"));
				e.setEmpDptName(rs.getString("EMP_DPT_NAME"));
				e.setEmpDateOfJoin(rs.getDate("EMP_DATE_JOINED"));
				e.setEmpMgrId(rs.getInt("EMP_MGR_ID"));
				e.setEmpLeaveBalance(rs.getInt("EMP_LEAVE_BALANCE"));
				arr[i]=e;
				i++;
			}
			return arr;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
