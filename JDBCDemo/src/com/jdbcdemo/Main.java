package com.jdbcdemo;

import java.sql.*;

public class Main {
	public static void main(String[] args) throws SQLException {
		//fetch data from databae
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/firstdatabase","root","root");
//			Statement statement=connection.createStatement();  
//			ResultSet resultset=statement.executeQuery("select * from employee");
//			while(resultset.next()) {
//				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3)+" "+resultset.getDouble(4)+" "+resultset.getDate(5));
//			}
//			
//			statement.close();
//			connection.close();
//			
//		} catch (ClassNotFoundException e) {
//			
//		}
		
		
//		add data on database
		
//		try 
//		{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/firstdatabase","root","root");
//			Statement statement = connection.createStatement();
//			String sql = "insert into employee values(1,'shan khan','delhi',60000.0,'2024-04-17')";
//			int result = statement.executeUpdate(sql);
//			System.out.println(result+" added");
//			statement.close();
//			connection.close();
//			
//		}catch(ClassNotFoundException e) 
//		{
//			System.out.println(e);
//		}
		
//		update data 
//		try 
//		{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/firstdatabase","root","root");
//			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("UPDATE EMPLOYEE SET LOCATION=?,SALARY=? where EMPID=?");
//			preparedStatement.setString(1,"Pune");
//			preparedStatement.setDouble(2, 73000.00);
//			preparedStatement.setInt(3,1 );
//			int result=preparedStatement.executeUpdate();
//			System.out.println(result + "row updated");
//			preparedStatement.close();
//			connection.close();
//			
//		}catch(ClassNotFoundException e) 
//		{
//			System.out.println(e);
//		}
//		update without preapare statement
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/firstdatabase","root","root");
			Statement statement = connection.createStatement();
			String sql = "update employee set location = 'kolkata' ,salary = 10000.00 where empId = 10";
			int result = statement.executeUpdate(sql);
			System.out.println(result+" updated");
			statement.close();
			connection.close();
			
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e);
		}
//		delete row
//		try 
//		{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/firstdatabase","root","root");
//			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("DELETE FROM EMPLOYEE  where EMPID=?");
//			preparedStatement.setInt(1,1 );
//			int result=preparedStatement.executeUpdate();
//			System.out.println(result + "row updated");
//			preparedStatement.close();
//			connection.close();
//			
//		}catch(ClassNotFoundException e) 
//		{
//			System.out.println(e);
//		}
		
//		delete without prepared statement
//		try 
//		{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/firstdatabase","root","root");
//			Statement statement = connection.createStatement();
//			String sql = "delete from employee where empId = 1";
//			int result = statement.executeUpdate(sql);
//			System.out.println(result+" deleted");
//			statement.close();
//			connection.close();
//			
//		}catch(ClassNotFoundException e) 
//		{
//			System.out.println(e);
//		}
		
	}
}
