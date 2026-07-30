package com.array;

public class DuplicateArray1 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
		int i = 0;
		System.out.println(arr[i]);
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] == arr[j]) {
				continue;
			} else {
				i++;
				arr[i] = arr[j];
			}
			System.out.println(arr[i] + " ");
		}
		
		System.out.println("length : " + (i + 1));
	}

}
