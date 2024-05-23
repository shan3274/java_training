package com.day3.exception;

public class ExceptionDemo {
	
	public static void ArrayIndexOutofBond(int[] arr,int l) {
		try {
			System.out.println(arr[l+1]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		
	}
	
	public static void Nullpointer(String str) {
		try {
			System.out.println(str.length());
		}catch(NullPointerException ex) {
			System.out.println(ex);
		}
		
	}
	public static void Numberformat(String str) {
		
		try {
			System.out.println(Integer.parseInt(str));
		}catch(NumberFormatException ex) {
			System.out.println(ex);  
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		ArrayIndexOutofBond(arr, arr.length);
		Nullpointer(null);
		Numberformat("shan");
	}
}
