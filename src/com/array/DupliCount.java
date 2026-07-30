package com.array;

public class DupliCount {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 2, 3, 4, 5, 6, 7, 6, 7, 8, 7, 8, 99, 8, 88, 54, 7, 7, 74 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean status = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					status = true;
					break;
				}
			}
			if (status) {
				continue;
			}
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] == arr[i]) {
					count++;
					break;
				}
			}
		}
		System.out.println("duplicate count  " + count);
	}

}
