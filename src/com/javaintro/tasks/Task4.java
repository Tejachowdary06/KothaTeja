package com.javaintro.tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("check the leap year");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if((year % 400 == 0)||(year % 4==0)&&(year %100!=0)) {
			System.out.println("It is a leap year");
		}else {
			System.out.println("It is not a leap year");
		}
		sc.close();
	}

}
