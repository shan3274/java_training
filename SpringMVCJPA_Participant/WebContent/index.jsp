<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Training Management System</h2>
		<a href="${pageContext.request.contextPath}/LoadSaveTraining.html">Add Training</a><br> <br> 
		<a href="${pageContext.request.contextPath}/LoadUpdateTraining.html">Update Training</a><br> <br>
		<a href="${pageContext.request.contextPath}/GetDetails.html">Get All Training Details</a><br> <br>
		<a href="${pageContext.request.contextPath}/GetDetById.html">Delete Training</a>
	</center>
</body>
</html>