package com.array;

public class SelectionSortArr {

	public static void main(String[] args) {

		int[] arr = { 45, 34, 56, 3, 24, 35, 6, 54, 53 };
		int temp = 0;
		System.out.println("beforing sorting");
		for (int b : arr) {
			System.out.print(b + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		System.out.println("after sorting");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
