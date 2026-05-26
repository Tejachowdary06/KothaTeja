package com.array;

public class EvenOddArr {

	public static void main(String[] args) {

		int[] arr = { 12, 23, 36, 22, 24, 65 };

		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}

		System.out.println("even number : " + evencount);
		System.out.println("odd number : " + oddcount);

	}
}