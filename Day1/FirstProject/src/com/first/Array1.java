package com.first;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int arr1[] =new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
	
		arr1[4] = sc.nextInt();
		arr = arr1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
