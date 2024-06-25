package com.first;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the len");
		int len = sc.nextInt();
		
		int c = 0;
		while(c < len) {
			c  = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
