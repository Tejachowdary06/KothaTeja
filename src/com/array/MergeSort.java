package com.array;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 2, 83, 28, 73, 24, 90 };
		divideSort(arr);

		for (int wakeup : arr) {
			System.out.print(wakeup + " ");

		}

	}

	private static void divideSort(int[] arr) {
		if (arr.length == 1) {
			return;
		}

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = arr[left.length + i];
		}

		divideSort(left);
		divideSort(right);
		mergeSort(arr, left, right);

	}

	private static void mergeSort(int[] arr, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}

	}
}
