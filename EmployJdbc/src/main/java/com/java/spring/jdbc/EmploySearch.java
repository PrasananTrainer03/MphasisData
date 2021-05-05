package com.java.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmploySearch {
	public static void main(String[] args) {
		ApplicationContext ctx=new 
				ClassPathXmlApplicationContext("com/java/spring/jdbc/applicationContext.xml");

		DataSource ds = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(ds);
		
		int empno=1;
		String str = "select * from Employ where empno=?";
		List emps = jt.query(str,
				new Object[] {empno},
				new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("empno") + "  " +rs.getString("name") 
				+ " " +rs.getString("dept") + " " +rs.getString("desig") 
				+ "  " +rs.getString("gender") + "   " +rs.getInt("basic");
			}
			
		});
		for(Object ob : emps) {
			System.out.println(ob);
		}
	}
}
