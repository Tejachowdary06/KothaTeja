package com.array;

public class MoveZeroToEndPosition {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
