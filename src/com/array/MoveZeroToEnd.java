package com.array;

//2. Given an array, move all zeros to the end while maintaining the order of non-zero elements. Example:
//Input:arr = [0, 1, 0, 3, 12]
//Output:[1, 3, 12, 0, 0]
//Constraint:In-place solution preferred : Time Complexity: O(n)

public class MoveZeroToEnd {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;

			}
		}
		while (index < arr.length) {
			arr[index++] = 0;
		}
		for (int a : arr) {
			System.out.println(a + " ");
		}

	}

}
