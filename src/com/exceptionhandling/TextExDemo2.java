package com.exceptionhandling;

public class TextExDemo2 {

	public static void main(String[] args) {
		System.out.println("Naruto Version-1 !!!");

		try {
			System.out.println("Madra Uchiha Came to This Picture He Got Points");
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Madra got 0 outof 10");
			System.out.println("Madra Lose The Match With Itachi ");
		} finally {
			System.out.println("Itachi Won The Match Congratulation To God Itachi");
		}

	}

}
