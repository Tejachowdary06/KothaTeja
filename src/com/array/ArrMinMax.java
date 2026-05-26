package com.array;

public class ArrMinMax {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] num = { 1, 4, 8, 56, 45, 32, 74, -56, 54, 76, 37, 87 };

		int min = num[0];
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];

			} else if (num[i] > max) {
				max = num[i];

			}
		}
		System.out.println("min value : " + min);
		System.out.println("max value : " + max);

	}

}
