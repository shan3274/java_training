package com.first;


public class Car {
	private String name;
	private String model;
	private String year;
	private String color;
	public Car(String name, String model,String year,String color){
		this.name = name;
		this.model= model;
		this.year = year;
		this.color = color;		
	}
	
	public void show() {
		System.out.println("Name : "+name);
		System.out.println("Model : "+model);
		System.out.println("Year : "+year);
		System.out.println("Color : "+color);
	}
	public static void main(String[] args) {
		Car cars =new Car("Mustang","gt","1969","black");
		cars.show();
		
	}	
}


