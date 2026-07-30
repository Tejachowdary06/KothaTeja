package com.langfundamental.methods;

import java.util.Scanner;

public class TestMethods4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		vowel(ch);
	}

	static void vowel(char ch) {

		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
				|| ch == 'o' || ch == 'u') {
			System.out.println("It is a vowel");
		} else {
			System.out.println("It is Consonant");
		}
	}
}
