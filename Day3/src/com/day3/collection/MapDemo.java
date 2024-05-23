package com.day3.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(100,"Aditya kachway");
		map.put(200, "Anwesh bhai dholakya");
		map.put(300,"Harsh likhari");
		map.put(400, "Akhas chopra");
		
//		for(Map.Entry m1: map.entrySet()) {
//			System.out.println(m1.getKey()+" "+m1.getValue());
//		}
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
	}

}
