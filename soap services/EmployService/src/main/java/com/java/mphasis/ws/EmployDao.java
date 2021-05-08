package com.java.mphasis.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployDao {

	public String addEmploy(Employ employ) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "insert into employ(empno,name,gender,dept,desig,basic)  "
				+ " values(?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setInt(6, employ.getBasic());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	public Employ[] showEmploy() throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Employ";
		PreparedStatement pst = con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt= rs.getInt("cnt");
		Employ[] employList = new Employ[cnt];
		cmd = "select * from Employ";
		pst = con.prepareStatement(cmd);
		rs = pst.executeQuery();
		Employ employ = null;
		int i=0;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
			employList[i]=employ;
			i++;
		}
		return employList;
	}
}
