package com.day3.exception;

import java.io.IOException;


class One{
	public static void readFile()throws IOException{
		System.out.println("this is  parent");
		throw new IOException("File not found");
		
	}
}

public class ThrowDemo extends One{
	public static void main(String[] args) {
		try {
			readFile();
		}catch(IOException ex) {
			System.out.println("Exception");
		}
	}
	
	public  static void readFile()throws IOException{
		System.out.println("this is main class");
		throw new IOException("File not found");
	}
}
