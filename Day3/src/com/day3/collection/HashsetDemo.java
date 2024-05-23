package com.day3.collection;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add("aditya");
		hashset.add("aditya kachway");
		hashset.add("harsh likhari");
		hashset.add("bristi");
		hashset.add("shan");
		hashset.add("anwesh");
		hashset.add("anwesh kumar");
		for (String str : hashset) {
			System.out.println(str);
		}
		
	}
}
