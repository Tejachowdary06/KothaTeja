package com.logicalstatement;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn = " ";
		do {
			System.out.println("Enter the Number");
			int pnz = sc.nextInt();

			if (pnz > 0) {
				System.out.println("The given Number is Positive : +" + pnz);
			} else if (pnz < 0) {
				System.out.println("The given Number is Negitive : " + -pnz);

			} else if (pnz == 0) {
				System.out.println("The given Number is Zero : ");
			} else {
				System.out.println("Invalid Number : ");
			}
			System.out.println("Do you want to continue click Yes/No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("yes"));
		sc.close();
	}
}
