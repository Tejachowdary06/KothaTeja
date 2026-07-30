package com.logicalstatement;

import java.util.Scanner;

public class AsciiRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter the Letter");
			char ch = sc.next().charAt(0);
//			if (ch >= 'A' && ch <= 'Z') {
//				System.out.println("Upper Case letters");
//			} else if (ch <= 'a' && ch <= 'z') {
//				System.out.println("Lower Case Letters");
//			}
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				System.out.println("Alphabet");
			} else if (ch >= '0' && ch <= '9') {
				System.out.println("Numbers");
			} else {
				System.out.println("Special Characters");
			}

			System.out.println("Do you Check With Another Letter Click Yes/No?");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("yes"));
		sc.close();

	}

}
