package com.langfundamental.logicalstatement;

import java.util.Scanner;

public class TestLsDemo2 {

	public static void main(String[] args) {
		System.out.println("check the age of the person how old is : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age");
		int age = sc.nextInt();
		
		if (age >=1 && age <=5) {
			System.out.println("the person is a child");

		} else if (age >= 6 && age <= 12) {
			System.out.println("the person is kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("the person is teen");
		} else if (age >= 20 && age <= 35) {
			System.out.println("the person is young");
		} else if (age >= 36 && age <= 59) {
			System.out.println("the person is middle age");
		} else if (age >= 60) {
			System.out.println("the person is old age");
		}
		else {
			System.out.println("invalid age");
		}

	}

}
