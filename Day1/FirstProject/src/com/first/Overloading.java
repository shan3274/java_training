package com.first;

import java.util.Scanner;

public class Overloading {
	public String details(String sim1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("Enter the role :");
		String role = sc.nextLine();
		System.out.println("Enter the personal contact number :");
		String pcontact = sc.nextLine();
		return "Name :"+name+" \n Role : "+role+" \n Personal contact : "+pcontact;
	}
	public String details(String sim1,String sim2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("Enter the role :");
		String role = sc.nextLine();
		System.out.println("Enter the personal contact number :");
		String pcontact = sc.nextLine();
		System.out.println("Enter the personal contact number :");
		String ocontact = sc.nextLine();
		return "Name :"+name+" \n Role : "+role+" \n Personal contact : "+pcontact+"\n Official contact :"+ocontact;
	}
	
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		System.out.println(overloading.details("sim1"));
//		System.out.println(overloading.details("sim1","sim2"));
		
	}
}
