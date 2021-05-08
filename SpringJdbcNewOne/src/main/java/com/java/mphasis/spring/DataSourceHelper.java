package com.java.mphasis.spring;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataSourceHelper {

	public static DataSource getSource() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/java/mphasis/spring/applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		return dataSource;
	}
}
