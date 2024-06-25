package com.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String emp_name;
	String position;
	int id;
	double salary;
	
	public Employee(int id, String emp_name,String position,double salary) {
		this.emp_name = emp_name;
		this.position = position;
		this.id = id;
		this.salary = salary;
	}
	
	public String toString() {
		return id+" "+emp_name+" "+position+" "+salary;
	}
	
}

class Storebyid implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.salary < o2.salary) {
			return 1;
		}
		return 0;
	}
	
}

class Storebysalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.salary < o2.salary) {
			return 1;
		}
		return 0;
	}
	
}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<>(); 
		employee.add(new Employee(13,"Shan khan","ASA",28000.0));
		employee.add(new Employee(2,"Harsh likhari","ASA",25000.0));
		employee.add(new Employee(3,"Aditya kachway","ASA",38000.0));
		employee.add(new Employee(41,"Anwesh bhai dholakya","ASA",18000.0));
		
		
		Collections.sort(employee,new Storebyid());
		employee.forEach(System.out::println);
		Collections.sort(employee,new Storebysalary());
		employee.forEach(System.out::println);
		
		
	}
}
