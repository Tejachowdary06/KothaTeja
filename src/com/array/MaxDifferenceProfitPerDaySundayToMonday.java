package com.array;

import java.util.Scanner;

public class MaxDifferenceProfitPerDaySundayToMonday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 13, 4, 18, 22, 32, 12 };

		for (int i = 0; i < arr.length; i++) {
			int maxValue = i;
			for (int j = 0; j < arr.length; j++) {
				if (arr[maxValue] < arr[j]) {
					arr[maxValue] = arr[j];
					
				}

			}
		}

	}

}
