package com.first;
import java.util.Arrays;

public class ArraySize {
	public static void main(String[] args) {
		changeArraySize();
	}
	static void changeArraySize() {
		int []arraysize = new int[5];
		System.out.println("Befor "+arraysize.length);
		arraysize= java.util.Arrays.copyOf(arraysize, arraysize.length*2);
		System.out.println("After "+arraysize.length);
	}
}
