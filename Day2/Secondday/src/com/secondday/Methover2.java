package com.secondday;

public class Methover2 extends Methover1{
	public void show() {
		System.out.println("this is child class");
	}
	
	public static void main(String[] args) {
		Methover2 obj = new Methover2();
		Methover2 obj2 = new Methover2();
		obj.show();
		obj2.show();
	}
}
