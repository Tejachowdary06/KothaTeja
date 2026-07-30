package com.logicalstatement;

import java.util.Scanner;

public class NPrimeNumbers {

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				return false;

			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print prime numbers");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; count < n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		sc.close();

	}

}
