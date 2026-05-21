package com.javaintro.tasks;

public class PrimeNumberPrinting {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			status = false;
		}

		for (int i = 2; i < n-1; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("check the prime number");
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

}
