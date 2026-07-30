package com.array;

public class SecondLargArr {

	public static void main(String[] args) {

		int[] arr = { 9,4,7,2,84,44,64,66,75 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}
		System.out.println("second largest=" + second);
	}
}
