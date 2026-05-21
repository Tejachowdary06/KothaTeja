package com.javaintro.tasks;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("check the leap year");
		int year = 2100;
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("2100 is a leap year : ");
		} else {
			System.out.println("2100 is not a leap year : ");
		}
		int year1 = 1900;
		if ((year1 % 400 == 0) || (year1 % 4 == 0) && (year1 % 100 != 0)) {
			System.out.println("1900 is a leap year : ");
		} else {
			System.out.println("1900 is not a leap year : ");
		}
		int year2 = 2400;
		if ((year2 % 400 == 0) || (year2 % 4 == 0) && (year2 % 100 != 0)) {
			System.out.println("2400 is a leap year : ");
		} else {
			System.out.println("2400 is not a leap year : ");
		}
	}

}
