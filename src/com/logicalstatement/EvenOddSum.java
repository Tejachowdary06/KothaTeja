package com.logicalstatement;

import java.util.Scanner;

public class EvenOddSum {

	static void evenSum(int n) {
		int evenSum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			}
		}
		System.out.println("EvenSum = " + evenSum);
	}

	static void oddSum(int n) {
		int oddSum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				oddSum = oddSum + i;
			}
		}
		System.out.println("oddSum = " + oddSum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		evenSum(n);
		oddSum(n);
		sc.close();
	}
}
