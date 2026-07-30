package com.array;

public class SecondSmallArr {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 6, 4, 7, 5, 3, 6, 4, 54, 35 };

		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}
		System.out.println("second small=" + second);
	}
}
