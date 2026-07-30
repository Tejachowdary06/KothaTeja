package com.array;

public class SecondLargest {

	public static void main(String[] args) {

		int[] num = { 88, 29, 39, 29, 20,100, 30, 45, 56 ,33};

		int larger = num[0];
		int secondLarger = num[1];

		for (int i = 1; i < num.length; i++) {
			if (num[i]>larger) {
				secondLarger = larger;
				larger = num[i];
			} else if (num[i] > secondLarger && num[i] != larger) {
				secondLarger = num[i];
			}

		}
		System.out.println(larger);
		System.out.println(secondLarger);
	}

}