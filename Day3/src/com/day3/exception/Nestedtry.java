package com.day3.exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Nestedtry {
	static int x = 0;
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your id");
//		
//		try {
//			int id = sc.nextInt();
//			System.out.println("Enter your stream");
//			String straem = sc.nextLine();
//			try {
//				
//				System.out.println(straem);
//				
//				
//			}catch(Exception ex) {
//				System.out.println("Please enter some value");
//			}
//			
//		}catch(InputMismatchException ex) {
//			System.out.println("Please enter the only numerical value");
//		}
//		String arr[] = {"1","2"};
//		main(arr);
		
		display(x);
		
		
	}
	
	public static int display(int i) {
		x = x+3;
		System.out.println(x);
		return x+display(x+2);
	}
}
