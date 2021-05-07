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

<c:forEach var="listValue" items="${emps}">
<table border="3">
<tr>
<td>
${listValue}
</td>
</tr>
</table>
</c:forEach>

</c:if>
</body>
</html>