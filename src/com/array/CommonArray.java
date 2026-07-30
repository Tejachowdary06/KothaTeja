package com.array;

public class CommonArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 ,10};
		int[] arr1 = { 10, 40, 50, 80 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println(arr1[j]);
					break;
				}
			}
		}

	}

}
