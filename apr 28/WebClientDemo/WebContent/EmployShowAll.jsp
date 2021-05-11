<%@page import="com.java.dxc.rs.Employ"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		 URL url = new URL("http://localhost:8181/EmployServiceExample/webapi/employ");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");

	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }

	        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));

	        String output;
	        out.println("Employ Records are  ");
	        String res="";
	        while ((output = br.readLine()) != null) {
	        	res+=output;
	          //  out.println(output);
	            
	        }
	        
	         ObjectMapper objectMapper = new ObjectMapper();
	        Employ[] employ = objectMapper.readValue(res, Employ[].class);
	        for(Employ e : employ) {
	        	out.println(e.getEmpno() + " " +e.getName() + " " +e.getDept() 
	        		+ " " + e.getDesig() + "<br/>");
	        }
	  %>
</body>
</html>