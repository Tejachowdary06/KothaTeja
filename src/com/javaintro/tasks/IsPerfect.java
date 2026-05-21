package com.javaintro.tasks;

import java.util.Scanner;

public class IsPerfect {

	static boolean isPerfect(int n) {
		boolean flag = false;
		int sum = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {

		System.out.println("given number is perfect or not");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = sc.nextInt();
		boolean status = isPerfect(num);
		
		if (status) {
			System.out.println("the given value is perfect :");
		} else {
			System.out.println("the given value is not perfect");
		}

	}

}
