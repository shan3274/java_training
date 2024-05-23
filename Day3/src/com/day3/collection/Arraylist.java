package com.day3.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			arr.add(i+1);
		}
		
		Iterator iterator = arr.iterator();
		
		/*while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		for(Object st : arr) {
			System.out.println(st);
		}
		
		
	}
}
