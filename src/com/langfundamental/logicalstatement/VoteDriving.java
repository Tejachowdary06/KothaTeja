package com.langfundamental.logicalstatement;

import java.util.Scanner;

public class VoteDriving {

	public static void main(String[] args) {
		System.out.println("main method is started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("u are eligible for voting and driving");
			System.out.println("congratulation");

		} else {
			System.out.println("your are not eligible for voting and driving");

			System.out.println("main method ended");
		}
	}
}
