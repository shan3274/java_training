package com.accenture.jdbcassignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Insertdata {
	
	public static void addEmployee(int id,String emp_name,String emp_location,double emp_salary,String hire_date) throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			Statement statement = connection.createStatement();
			String sql = "insert into employees values("+id+",'"+emp_name+"','"+emp_location+"','"+emp_salary+"','"+hire_date+"')";
			int result = statement.executeUpdate(sql);
			System.out.println(result+" added");
			statement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	
	public static void addDepartment(int id,String dep_name,String dep_location) throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			Statement statement = connection.createStatement();
			String sql = "insert into deparment values("+id+",'"+dep_name+"','"+dep_location+"')";
			int result = statement.executeUpdate(sql);
			System.out.println(result+" added");
			statement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	
	public static void addProject(int id,String pro_name,String pro_location) throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			Statement statement = connection.createStatement();
			String sql = "insert into project values("+id+",'"+pro_name+"','"+pro_location+"')";
			int result = statement.executeUpdate(sql);
			System.out.println(result+" added");
			statement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}
	public static void addTask(String task1,String task2,String task3) throws SQLException {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture","root","root");
			Statement statement = connection.createStatement();
			String sql = "insert into task values('"+task1+"','"+task2+"','"+task3+"')";
			int result = statement.executeUpdate(sql);
			System.out.println(result+" added");
			statement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
	}

}
