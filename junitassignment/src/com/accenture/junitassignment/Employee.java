package com.accenture.junitassignment;

public class Employee {
	// Assignment Title: Employee Validation with JUnit
	//
	// Instructions:
	//
	// Create Java class Employee.java and Create JUnit test class
	// EmployeeTest.java.
	//
	// Make sure you have JUnit configured in your development environment.
	//
	//
	// Employee Class:
	//
	// Employee.java contains a simple Java class representing an employee.
	// The class includes attributes such as name, age, and salary, along with
	// getter and setter methods.
	// Your task is to validate the input data for these attributes using JUnit test
	// cases.
	//
	

	private String emp_name;
	private long emp_age;
	private double salary;

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public long getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(long emp_age) {
		this.emp_age = emp_age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
