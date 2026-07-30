package com.array;

public class BubbleSortArr {

	static void bubbleSort(int[] arr) {
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			boolean swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				count1++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

	public static void main(String[] args) {
		System.out.println("Team 7 on Mission");
		int[] arr = { 7, 3, 6, 5, 2, 9, 1 };
		System.out.println("before sorting");
		for (int b : arr) {
			System.out.print(b + " ");
		}
		System.out.println();

		bubbleSort(arr);
		System.out.println("Team 7 Mission completed");
		System.out.println("after sorting");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
