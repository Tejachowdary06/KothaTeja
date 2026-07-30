package com.logicalstatement;

import java.util.Scanner;

//Check the two numbers and print the number is larger or not
public class LargestNumbers3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		System.out.println("Enter the Third Number");
		int c = sc.nextInt();
		if (a >b) {
			if(a>c) {
			System.out.println("The Given First Number is Larger");
			}
		} if (b > a) {
			if(b > c) {
			System.out.println("The Given Second Number is Larger");
		}
		}
		if(c>a) {
			if(c>b) {
			System.out.println("The Given Third Number is Larger");
		}
		}
		sc.close();
	}
}
