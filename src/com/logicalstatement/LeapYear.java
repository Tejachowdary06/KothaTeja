package com.logicalstatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("checking the year is  leap year or not");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();

		if (year % 400 == 0 && year % 4 == 0 || year % 100 != 0) {
			System.out.println("Enter year is leap year");
		} else {
			System.out.println("Enter year is not a leap year");
		}
		sc.close();
	}

}
