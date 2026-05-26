package com.array;

import java.util.Scanner;

public class IsPrimeArr {

	public static void main(String[] args) {
		System.out.println("Main Method Started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if (isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status=false;
		}
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				status=false;
			}
		}
		return status;
	}
}
