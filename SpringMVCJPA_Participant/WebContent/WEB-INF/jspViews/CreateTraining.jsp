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
		<h2>Add Training Details</h2>

		<!-- 1.19 -> Input fields for Training : Training_name,Location,Company,Training_startDate,Training_endDate in form -->
		<form:form modelAttribute="trainObj" method="GET"
			action="${pageContext.request.contextPath }/saveTraining.html">
			<br>
			<table border="2">
				<tr>
					<th>Training Name</th>
					<td><form:input path="training_name" /></td>
					<td><form:errors path="training_name" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<th>Company Name</th>
					<td><form:input path="company" /></td>
					<td><form:errors path="company" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<th>Location Name</th>
					<td><form:input path="location" /></td>
					<td><form:errors path="location" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<th>Training Start date</th>
					<td><form:input path="training_startDate" /></td>
					<td><form:errors path="training_startDate" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<th>Training End Date</th>
					<td><form:input path="training_endDate" /></td>
					<td><form:errors path="training_endDate" cssClass="error"></form:errors></td>
				</tr>
			</table>
			<input type="submit" value="Register" />
		</form:form>
	</center>
</body>
</html>