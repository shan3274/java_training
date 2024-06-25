package com.accenture.junitassignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

//JUnit Test Cases:
// (Use
// annotations:@Test,@beforeEach,@AfterEach,@BeforeAll,@AfterAll,@RepeatedTest
// Open EmployeeTest.java and implement test cases to validate the following
// scenarios:
// Ensure that an employee object can be created with valid input data (e.g.,
// non-empty name, positive age, positive salary).
// and also Validate Employee is null

import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee employee;

	@BeforeAll
	static void beforeAll() {
		System.out.println("Executing before all tests");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("Executing after all tests");
	}

	@BeforeEach
	void setup() {
		employee = new Employee();
		employee.setEmp_name("Shan khan");
		employee.setEmp_age(23);
		employee.setSalary(28000.00);
	}

	@AfterEach
	void newTestData() {
		employee = new Employee();
		employee.setEmp_name("Harsh likhari");
		employee.setEmp_age(23);
		employee.setSalary(28000.00);
	}

	@Test
	void nonEmptyName() {
		assertNotNull(employee.getEmp_name());
	}
	@Test
	void positiveAge() {
		assertTrue(employee.getEmp_age() > 0);
	}
	
	@Test
	void positiveSalary() {
		assertTrue(employee.getSalary()>0);
	}
	@Test
	void notNullEmployee() {
		assertNotNull(employee);
	}

	@RepeatedTest(3)
	void repeatedTest() {
		System.out.println("Executing repeated test");
	}
}
