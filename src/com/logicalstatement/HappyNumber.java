package com.logicalstatement;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		while (n > 10) {
			int sum = 0;
			while (n > 0) {
				int r = n % 10;
				n = n / 10;
				int sq = r * r;
				sum = sum + sq;
			}
			n = sum;
		}
		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not Happy Number");
		}

		sc.close();

	}

}
