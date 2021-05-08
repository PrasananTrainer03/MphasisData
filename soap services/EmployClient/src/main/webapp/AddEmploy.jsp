<%@page import="com.java.mphasis.ws.EmployDao"%>
<%@page import="com.java.mphasis.ws.EmployDaoServiceLocator"%>
<%@page import="com.java.mphasis.ws.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddEmploy.jsp">
		<center>
			Employ No :
			<input type="number" name="empno" /> <br/><br/> 
			Employ Name : 
			<input type="text" name="name" /> <br/><br/> 
			Gender : 
			<input type="radio" name="gender" value="Male" /> Male
			<input type="radio" name="gender" value="Female" /> Female
			 <br/><br/>
			Department : 
			<input type="text" name="dept" /> <br/><br/>
			Designation : 
			<input type="text" name="desig" /> <br/><br/> 
			Basic : 
			<input type="number" name="basic" /> <br/><br/>
			<input type="submit" value="Insert" />
		</center>
	</form>
	<%
		if (request.getParameter("empno") !=null && request.getParameter("basic") != null) {
			Employ employ = new Employ();
			employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employ.setName(request.getParameter("name"));
			employ.setGender(request.getParameter("gender"));
			employ.setDept(request.getParameter("dept"));
			employ.setDesig(request.getParameter("desig"));
			employ.setBasic(Integer.parseInt(request.getParameter("basic")));
			EmployDaoServiceLocator loc = new EmployDaoServiceLocator();
			EmployDao dao = loc.getEmployDao();
			out.println(dao.addEmploy(employ));
		}
	%>
</body>
</html>