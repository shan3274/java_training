package com.accenture.jdbcassignment1;

import java.sql.*;

public class Deleteuseer {
	public static void updateEmployee(int id) throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("DELETE FROM EMPLOYEES  where EMPID=?");
			preparedStatement.setInt(1,id );
			int result=preparedStatement.executeUpdate();
			System.out.println(result + "row updated");
			preparedStatement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	public static void updateDepartment(int id) throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("DELETE FROM DEPARMENT  where DEPID=?");
			preparedStatement.setInt(1,id );
			int result=preparedStatement.executeUpdate();
			System.out.println(result + "row updated");
			preparedStatement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	public static void updatePoject(int id) throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("DELETE FROM PROJECT  where PROID=?");
			preparedStatement.setInt(1,id );
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
