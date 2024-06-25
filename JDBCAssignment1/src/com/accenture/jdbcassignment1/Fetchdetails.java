package com.accenture.jdbcassignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetchdetails {
	public static void employeeDetails() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture", "root",
					"root");
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employees");

			System.out.println("Employee details");
			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3)
						+ " " + resultset.getDouble(4) + " " + resultset.getDate(5));
			}

			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} finally {
			System.out.println("Done!!!!");
		}

	}

	public static void employeeDepartment() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture", "root",
					"root");
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery("select * from deparment");

			System.out.println("Employee department");
			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3));
			}

			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} finally {
			System.out.println("Done!!!!");
		}
	}

	public static void employeeProject() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture", "root",
					"root");
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery("select * from project");

			System.out.println("Employee project");
			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3));
			}

			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} finally {
			System.out.println("Done!!!!");
		}
	}

	public static void employeeTask() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3300/accenture", "root",
					"root");
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery("select * from task");

			System.out.println("Employee project");
			while (resultset.next()) {
				System.out
						.println(resultset.getString(1) + " " + resultset.getString(2) + " " + resultset.getString(3));
			}

			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} finally {
			System.out.println("Done!!!!");
		}
	}

}
