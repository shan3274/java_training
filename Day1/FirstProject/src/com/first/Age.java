package com.first;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
//		Age < 13: Child
//		Age >= 13 and < 20: Teenager
//		Age >= 20 and < 65: Adult
		
		Scanner sc= new Scanner(System.in);
		
		int age  = sc.nextInt();
		if (age < 13) {
			System.out.println("Child");
		}else if(age >= 13 && age < 20) {
			System.out.println("Teenager");
		}else if(age>= 20 && age <65){
			System.out.println("Adult");
		}else {
			System.out.println("Senior");
		}
		
		
	}
}
