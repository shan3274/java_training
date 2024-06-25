package com.accenture.jdbcassignment1;

import java.sql.*;

public class Updatedetails {
	
	public static void updateEmployees(String location,double salary) throws SQLException{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("UPDATE EMPLOYEES SET LOCATION=?,SALARY=? where EMPID=?");
			preparedStatement.setString(1,location);
			preparedStatement.setDouble(2, salary);
			preparedStatement.setInt(3,1 );
			int result=preparedStatement.executeUpdate();
			System.out.println(result + "row updated");
			preparedStatement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	
	public static void updateDepartment(String location) throws SQLException{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("UPDATE DEPARMENT SET LOCATION=? where DEPID=?");
			preparedStatement.setString(1,location);
			preparedStatement.setInt(2,7 );
			int result=preparedStatement.executeUpdate();
			System.out.println(result + "row updated");
			preparedStatement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	
	public static void updateProject(String location) throws SQLException{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("UPDATE PROJECT SET LOCATION=? where PROID=?");
			preparedStatement.setString(1,location);
			preparedStatement.setInt(2,7 );
			int result=preparedStatement.executeUpdate();
			System.out.println(result + "row updated");
			preparedStatement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	
	public static void updateTask(String task1) throws SQLException{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("UPDATE TASK SET TASK1=? WHERE TASK1=?");
			preparedStatement.setString(1,task1);
			preparedStatement.setString(2, "add database");
			int result=preparedStatement.executeUpdate();
			System.out.println(result + "row updated");
			preparedStatement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}

}
