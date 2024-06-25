package com.secondday;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder st = new StringBuilder("today is java");
//		System.out.println(st);
//		st.append(" so much");
//		System.out.println(st);
//		st.insert(st.length(), " python ");
//		System.out.println(st);
//		st.replace(2, 6, "like");
//		System.out.println(st);
		
		System.out.println(st.capacity());
	}
}
