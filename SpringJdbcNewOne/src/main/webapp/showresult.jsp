<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty emps }">
<table border="3">
<tr>
  <th>Employ No</th>
  <th>Name</th>
  <th>Gender</th>
  <th>Department</th>
  <th>Designation</th>
  <th>Basic</th>
</tr>
<c:forEach var="v" items="${emps}">
<tr>
<td>
${v.empno}
</td>
<td>
${v.name}
</td>
<td>
${v.gender}
</td>
<td>
${v.dept}
</td>
<td>
${v.desig}
</td>
<td>
${v.basic}
</td>
</tr>

</c:forEach>
</table>
</c:if>
</body>
</html>