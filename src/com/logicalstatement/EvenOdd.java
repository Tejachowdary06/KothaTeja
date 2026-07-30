package com.logicalstatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn = " ";

		do {
			System.out.println("Enter the Number to check Even or Odd");
			int evenOdd = sc.nextInt();
			if (evenOdd % 2 == 0) {
				System.out.println("The given Number Even");
			} else {
				System.out.println("The given number is Odd");
			}
			System.out.println("Do you want to check another Number then click Yes/No ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("yes"));
		
		sc.close();
	}

}
