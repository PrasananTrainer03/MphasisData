package com.java.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployInsert {

	public static void main(String[] args) {
		ApplicationContext ctx=new 
				ClassPathXmlApplicationContext("com/java/spring/jdbc/applicationContext.xml");

		DataSource ds = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(ds);
		String cmd = "insert into employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		jt.update(cmd,new Object[] {
			155,"Hari Bhanu","Male","Java","SE",58244	
		});
		System.out.println("Record Inserted...");
	}
}
