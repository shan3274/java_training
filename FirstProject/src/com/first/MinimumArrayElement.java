package com.first;

public class MinimumArrayElement {

	public static void main(String[] args) {
		int arr[] = {1,6,2,6,2,8,0};
		System.out.println(findMinimum(arr));
		
	}
	public static int findMinimum(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]< min) min = arr[i];
		}
		return min;
	}
}
