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
		<h2>Training Details</h2>
		<form:form>
			<br>
			<c:if test="${ not empty TrainingDetailsList}">
				<table border="2">
					<tr>
						<th>TrainingID</th>
						<th>TrainingName</th>
						<th>CompanyName</th>
						<th>Location</th>
						<th>StartDate</th>
						<th>EndDate</th>
					</tr>
					<c:forEach var="var" items="${TrainingDetailsList}">
						<tr>
							<td>${var.trainingId }</td>
							<td>${var.training_name }</td>
							<td>${var.location }</td>
							<td>${var.company }</td>
							<td>${var.training_startDate}</td>
							<td>${var.training_endDate }</td>
						</tr>
					</c:forEach>
				</table>

			</c:if>
			<c:if test="${empty TrainingDetailsList}">

				<h2>No Training Available</h2>

			</c:if>
		</form:form>
	</center>

	<!-- 1.24-> Display all the training details-> Trainingid,Training_name,Location,Company,Training_startDate,Training_endDate -->
</body>
</html>