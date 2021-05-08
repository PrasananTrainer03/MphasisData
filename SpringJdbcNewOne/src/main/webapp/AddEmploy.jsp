<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="addemploy.mphasis">
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
</body>
</html>