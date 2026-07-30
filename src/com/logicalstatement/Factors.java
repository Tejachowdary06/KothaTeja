package com.logicalstatement;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		findFactor(n);
		
		sc.close();
	}

	static void findFactor(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println(n);
	}

}
