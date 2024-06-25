package com.accenture.jdbcassignment1;

import java.sql.*;
import com.accenture.*;

/*Assignment Title: JDBC Project: Process Management
Objective:
Develop a Process Management System using Java and JDBC to manage employees, departments, projects, and tasks within Accenture.

Requirements:

Database Setup:

Create a database named Accenture.
Design tables for Employees, Departments, Projects, and Tasks with appropriate columns.
Populate the tables with sample data.

JDBC Connectivity:

Implement a Java program to establish a JDBC connection to the AccentureDB.
Handle exceptions and ensure proper resource management.

CRUD Operations:

Implement CRUD operations for managing 5 employees, departments, projects, and tasks.
Provide functionalities for adding new records, updating existing records, deleting records,
 and retrieving records based on specified criteria using PreparedStatement interface
*/
public class Main {
	

	public static void main(String[] args) throws SQLException {
		// fetch data from databae
//		Fetchdetails.employeeDetails();
//		Fetchdetails.employeeDepartment();
//		Fetchdetails.employeeProject();
//		Fetchdetails.employeeTask();
		// insert data
//		Insertdata.addEmployee(7, "Saurab", "Baliya", 28000.00, "2024-04-17");
//		Insertdata.addDepartment(7, "full stack", "Baliya");
//		Insertdata.addProject(7, "java", "BaliyaS");
//		Insertdata.addTask("N/A", "N/A", "N/A");
//		Update data
//		Updatedetails.updateEmployees("Darbhanga",73000.00);
//		Updatedetails.updateDepartment("Darbhanga");
//		Updatedetails.updateProject("Darbhanga");
//		Updatedetails.updateTask("Add firebase");
		
		Deleteuseer.updateDepartment(1);
		Deleteuseer.updateEmployee(1);
		Deleteuseer.updatePoject(1);

	}

}
