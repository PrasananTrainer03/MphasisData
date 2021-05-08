package com.java.mphasis.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class EmployDAO {

	public String addEmploy(Employ employ) {
		DataSource dataSource = DataSourceHelper.getSource();
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd = "Insert into Employ(empno, Name,Gender,Dept,Desig,Basic) values( "
				+ "?, ?, ?, ?, ?, ?)";
		jt.update(cmd,new Object[] {employ.getEmpno(),employ.getName(),
				employ.getGender(),employ.getDept(),employ.getDesig(),employ.getBasic()});
		return "Record Inserted...";
	}
	public Employ searchEmploy(int empno) {
		DataSource dataSource = DataSourceHelper.getSource();
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd = "select * from Employ";
		List<Employ> employList = new ArrayList<Employ>();
		employList = jt.query(cmd, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				return employ;
			}
			
		});
		Employ result = null;
		if (employList.size() !=0) {
			result = employList.get(0);
		}
		return result;
	}
	public List<Employ> showEmploy() {
		DataSource dataSource = DataSourceHelper.getSource();
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd = "select * from Employ";
		List<Employ> employList = new ArrayList<Employ>();
		employList = jt.query(cmd, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				return employ;
			}
			
		});
		return employList;
	}
}
