package com.day3.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private int emp_id;
	private String emp_name;
	private String emp_location;
	
	public Employee(int emp_id,String emp_name,String emp_location) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_location = emp_location;
	}
	
	public String emp(){
		return "Id " +Integer.toString(emp_id)+"\nName "+emp_name+"\nLoaction "+emp_location;
	}
}

public class Employees {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		ArrayList<String> arr = new ArrayList<>();
		
		System.out.println("Enter the employee id");
		
		int id = sc.nextInt();
		
		System.out.println("Enter the employee name");
		
		String name = sc.nextLine();
		
		System.out.println("Enter the employee Location");
		
		String location = sc.nextLine();
		
		Employee emp =new Employee(id,name,location);
		
		arr.add(emp.emp());
		
		for(Object k :arr) {
			System.out.println(k);
		}
	}
	

}
