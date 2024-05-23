package com.secondday;

public class StringOperation {
	public static void main(String[] args) {
		String str = new String("Java is programming language");
		String str2 = str.toUpperCase();
		System.out.println(str.indexOf('v'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.replace("Java", "Python"));
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf('v'));
		System.out.println(str.substring(0, 5));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.endsWith("age"));
		System.out.println(str.isEmpty());
		
	}
}
