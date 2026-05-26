package com.array;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 2, 3, 4, 5, 6, 7 };

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");
		}
	}

}
