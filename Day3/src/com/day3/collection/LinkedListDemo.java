package com.day3.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Customer {
	private int cus_id;
	private String cus_name;
	private String product;
	private int price;

	public Customer(int cus_id, String cus_name, String product, int price) {
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.product = product;
		this.price = price;
	}

	public String details() {
		return "Id :" + Integer.toString(cus_id) + " Name :" + cus_name + " Product :" + product + " Price :" + price;
	}

}

public class LinkedListDemo {

	/*
	 * Create a class CustomerManagement that will use a LinkedList to store
	 * Customer objects(cust_id,name,product & price) and the Scanner class to
	 * interact with the user.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList<String> arr = new LinkedList<>();

		System.out.println("Enter the number of user you want add");
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {

			System.out.println("Enter the Customer "+Integer.toString(i+1)+" id");

			int id = Integer.parseInt(sc.nextLine());

			System.out.println("Enter the Customer  "+Integer.toString(i+1)+ " name");

			String name = sc.nextLine();

			System.out.println("Enter the "+Integer.toString(i+1)+" price");
			int price = Integer.parseInt(sc.nextLine());

			System.out.println("Enter the "+Integer.toString(i+1)+"  product");

			String product = sc.nextLine();

			Customer emp = new Customer(id, name, product, price);

			arr.add(emp.details());
		}


		for (Object k : arr) {
			System.out.println(k);
		}
	}

}
