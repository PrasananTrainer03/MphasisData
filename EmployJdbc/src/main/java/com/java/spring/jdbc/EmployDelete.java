package com.java.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployDelete {

	public static void main(String[] args) {
		ApplicationContext ctx=new 
				ClassPathXmlApplicationContext("com/java/spring/jdbc/applicationContext.xml");

		DataSource ds = (DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(ds);
		String cmd = "Delete from Employ where empno=?";
		jt.update(cmd,new Object[] {
			155	
		});
		System.out.println("Record Deleted...");
	}
}
