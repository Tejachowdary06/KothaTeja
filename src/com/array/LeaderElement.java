package com.array;

public class LeaderElement {

	public static void main(String[] args) {

//		              0  1  2   3   4  5  6  7  8
		int[] arr = { 2, 7, 15, 10, 9, 6, 1, 3, 5 };

		for (int i = arr.length - 1; i >= 0; i--) {
			boolean leader = true;
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i] < arr[j]) {
					leader = false;
					break;
				}
			}
			if (leader) {
				System.out.println("Leader Element : " + arr[i]);
			}
		}
	}

}
