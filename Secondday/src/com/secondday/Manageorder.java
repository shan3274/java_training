package com.secondday;

import java.util.Random;

//you will create a utility class for an e-commerce application. This utility class will
//handle some common tasks such as generating order
//IDs, managing a list of all orders, and providing some static configuration settings.
//Understand and use static variables.
//Implement and call static methods.
//Use static blocks for initialization.
//Define and use a static nested class.

class Orderdetails{
	static int ids;
	static {
		Random rand = new Random();
		ids = rand.nextInt(1000);
	}
	
	static class Display{
		public static String orders(String order_name) {
	 		return Integer.toString(ids) + " "+order_name;
		}
	}
}
public class Manageorder {
	public static void main(String[] args) {
		System.out.println(Orderdetails.Display.orders("Mustang"));
	}
}
