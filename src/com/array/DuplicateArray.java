package com.array;

import java.util.Arrays;

//WAP to print duplicate values in the array
public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 4, 5 };
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
