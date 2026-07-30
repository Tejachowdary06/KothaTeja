package com.array;

public class TestArr11 {

	public static void main(String[] args) {

		int[] evenodd = { 1, 2, 3, 4, 5, 6 };
		int evencount = 0;
		int oddcount = 0;

		for (int i = 0; i < evenodd.length; i++) {
			if (evenodd[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}