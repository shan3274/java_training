<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>
	<center>
		<h1>Delete Training Details</h1>
		<form:form modelAttribute="trainObj" method="POST"
			action="${pageContext.request.contextPath}/delete.html">
		Training ID : <form:input path="trainingId" />
			<br>
			<br>
			<input type="submit" value="Delete" />
		</form:form>
	</center>
</body>
</html>