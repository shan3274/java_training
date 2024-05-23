package com.secondday;

import java.util.ArrayList;
import java.util.List;

class College{
	public String name;
	public String address;
	
	College(String name,String address){
		this.name = name;
		this.address = address;
	}
}

class University{
	private final List<College> colleges;
	University(List<College> colleges){
		this.colleges = colleges;
	}
	public List<College> getCollege() {
		return colleges;
	}
	
}
public class Composition {
	public static void main(String[] args) {
		College c1 = new College("Gniot","Greater noida");
		College c2 = new College("Down town","Guwahti");
		College c3 = new College("Anna university","Chennai");
		
		List<College> colleges = new ArrayList<>();
		colleges.add(c1);
		colleges.add(c2);
		colleges.add(c3);
		
		University university = new University(colleges);
		List<College> college = university.getCollege();
		
		for(College cg : college) {
			System.out.println(cg.name+" "+cg.address);
		}
		
	}
}
