package com.array;

public class NegtiveNumbers {

	public static void main(String[] args) {

		int[] a = { 1, -2, 3, -4, 5, -6 };
		int[] b = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				b[index++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[index++] = a[i];
			}
		}
		for (int ba : b) {
			System.out.print(ba + " ");
		}

	}

}
