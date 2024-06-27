<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>
</head>
<body>
	<center>
		<h2>Update Training Details</h2>
		<form:form modelAttribute="trainObj" method="POST"
			action="LoadUpdate2.html">
			<br>
			<table border="2">
				<tr>
					<th>Training ID</th>
					<td><form:input path="trainingId" onchange="submit()" /></td>

				</tr>
			</table>
		</form:form>
		<c:if test="${not empty trainObj2 && message==null }">
			<h3>Below are the details of Employee</h3>
			<form:form modelAttribute="trainObj2" method="POST"
				action="UpdateTraining.html">
				<table border="2">
					<tr>
						<th>Training Name</th>
						<td><form:input path="training_name" /></td>
					</tr>
					<tr>
						<th>Company Name</th>
						<td><form:input path="company" /></td>
					</tr>
					<tr>
						<th>Location</th>
						<td><form:input path="location" /></td>
					</tr>
					<tr>
						<th>Start Date</th>
						<td><form:input path="training_startDate" /></td>
					</tr>
					<tr>
						<th>Start Date</th>
						<td><form:input path="training_endDate" /></td>
					</tr>
				</table>
				<input type="submit" value="Update">
			</form:form>
		</c:if>
		

		<!-- 1.21->Add fields to update the details by ID -->
</body>
</html>