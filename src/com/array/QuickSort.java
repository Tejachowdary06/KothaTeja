package com.array;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 2, 54, 25, 23, 85 };
		
		System.out.println("Before Sort");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		quickSort(arr, 0, arr.length - 1);

		System.out.println("After Sort");
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex-1);
			quickSort(arr, pivotIndex+1, high);

		}

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[low];
		int start = low;
		int end = high;

		while (start < end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				swap(arr, start, end);
			}

		}

		return end;
	}

	private static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

	}
}
