package com.day3.collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("harsh likhari");
		treeSet.add("Aditya kachway");
		treeSet.add("anwesh bhai dholakiya");
		treeSet.add("shan khan");
		
		System.out.println(treeSet.pollFirst());
		
	}
}
