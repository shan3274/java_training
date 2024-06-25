package com.secondday;

class Organisation{
	public Organisation(){
		System.out.println("Constructor calling");
	}
	static void show() {
		System.out.println("Show method");
	}
}
public class Mli extends Organisation{
//	Mli(){
//		super();
//	} 
	public static void main(String[] args) {
		new Mli();
		show();
	}
}
