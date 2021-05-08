<%@page import="com.java.hib.Employ"%>
<%@page import="com.java.hib.EmployDao"%>
<%@page import="com.java.hib.EmployDaoServiceLocator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
	<tr>
		<th>Employ No</th>
		<th>Employ Name</th>
		<th>Gender</th>
		<th>Department</th>
		<th>Designation</th>
		<th>Salary</th>
	</tr>
	<%
		EmployDaoServiceLocator loc = new EmployDaoServiceLocator();
		EmployDao proxy = loc.getEmployDao();
		Employ[] employs = proxy.showEmploy();
		for(Employ e : employs) {
	%>
	<tr>
		<td> <%=e.getEmpno() %> </td>
		<td><%=e.getName() %>  </td>
		<td><%=e.getGender() %> </td>
		<td><%=e.getDept() %>  </td>
		<td><%=e.getDesig() %>  </td>
		<td><%=e.getBasic() %>  </td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>