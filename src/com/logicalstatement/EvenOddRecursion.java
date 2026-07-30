package com.logicalstatement;

import java.util.Scanner;

public class EvenOddRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		evenOddRecursion(n);
		
		sc.close();
	}

	static void evenOddRecursion(int n) {
		if (n == 0) {
			System.out.println("Even");
		}
		else if (n == 1) {
			System.out.println("Odd");
		}
		else {
			evenOddRecursion(n-2);
		}
		
	}

}
