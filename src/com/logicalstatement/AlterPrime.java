package com.logicalstatement;

import java.util.Scanner;

public class AlterPrime {

	static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting  numnbers");
		int start = sc.nextInt();
		System.out.println("Enter ending  numnbers");
		int end = sc.nextInt();
		int count = 0;

		for (int i = start; i < end; i++) {
			if (isprime(i)) {
				if (count % 2 == 0) {
					System.out.print(i + " ");
				}
				count++;
			}
		}
		sc.close();
	}

}
