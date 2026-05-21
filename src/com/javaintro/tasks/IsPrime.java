package com.javaintro.tasks;

import java.util.Scanner;

public class IsPrime {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			status = false;
		}
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("The given number is prime or not checking");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		if (isPrime(n)) {
			System.out.println("the given number is prime");
		} else {
			System.out.println("the given number is not prime");
		}

	}

}
