package com.java.mphasis.mvc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployController {
	
	@RequestMapping("/employsearch")
	public ModelAndView searchEmploy(HttpServletRequest req,
				HttpServletResponse res
			) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/java/mphasis/mvc/applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd = "select * from Employ where empno=?";
		List emps=null;
		emps=jt.query(cmd,new Object[] {empno},new RowMapper() {
			
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				String empInfo=rs.getInt("empno")+"----"+rs.getString("name")
				+ "----" +rs.getString("gender")  + "----" +rs.getString("dept")
				+"----"+rs.getString("desig")+"----"+rs.getString("basic");
				return empInfo;
			}
		});
	//	return (new ModelAndView("searchpage","emps",emps));
		return new ModelAndView("searchresult", "emps", emps);
	}
	@RequestMapping("/showemploy")
	public ModelAndView showEmploy() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/java/mphasis/mvc/applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd = "select * from Employ";
		List emps=null;
		emps=jt.query(cmd,new RowMapper() {
			
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				String empInfo=rs.getInt("empno")+"----"+rs.getString("name")
				+ "----" +rs.getString("gender")  + "----" +rs.getString("dept")
				+"----"+rs.getString("desig")+"----"+rs.getString("basic");
				return empInfo;
			}
		});
	//	return (new ModelAndView("searchpage","emps",emps));
		return new ModelAndView("showresult", "emps", emps);
	}
	@RequestMapping("/addemploy")
	public ModelAndView addEmploy(HttpServletRequest req,
					HttpServletResponse res) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/java/mphasis/mvc/applicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		int empno = Integer.parseInt(req.getParameter("empno"));
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String dept = req.getParameter("dept");
		String desig = req.getParameter("desig");
		int basic = Integer.parseInt(req.getParameter("basic"));
		String cmd = "Insert into Employ(empno, Name,Gender,Dept,Desig,Basic) values( "
				+ "?, ?, ?, ?, ?, ?)";
		jt.update(cmd,new Object[] {empno,name,gender,dept,desig,basic});
		return new ModelAndView("result", "result", "Record Inserted...");
	}
}
