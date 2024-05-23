package com.day3.exception;

public class Customexception {
	static void name(String name) throws NameException{
		throw new NameException(name);
	}
	
	public static void main(String[] args) throws NameException {
		name("shan");
	}

}

class NameException extends Exception{
	public  NameException(String errorMessege) {
		super(errorMessege);
	}
}