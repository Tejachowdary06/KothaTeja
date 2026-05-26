package com.array;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 5, 7, 3, 8, 9, 0, 2, 3, 5, 6, 9, 67, 6 };
		System.out.println(arr.length);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.print(arr[i] + " ");
				while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
					i++;
				}
			}
		}
	}
}
