package g1.EmployServiceExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployDAO {

	public String addEmploy(Employ employ) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "Insert into Employ values(?, ?, ?, ?, ?)";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getDept());
		pst.setString(4, employ.getDesig());
		pst.setInt(5, employ.getBasic());
		pst.executeUpdate();
		return "Employ Record Inserted...";
	}
	public Employ searchEmploy(int empno) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
		}
		return employ;
	}
	public Employ[] showEmploy() throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Employ";
		PreparedStatement pst = con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		Employ[] arrEmploy = new Employ[count];
		cmd = "select * from Employ";
		pst = con.prepareStatement(cmd);
		rs = pst.executeQuery();
		Employ employ = null;
		int i=0;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
			arrEmploy[i]=employ;
			i++;
		}
		return arrEmploy;
	}
}
