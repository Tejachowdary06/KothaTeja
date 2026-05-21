package com.langfundamental.constructors;

public class PracticeQuestion5 {

	PracticeQuestion5() {
		PracticeQuestion5 a = new PracticeQuestion5(3);
		System.out.println("no arg constructor");
	}

	PracticeQuestion5(int x) {
		System.out.println("para");
		System.out.println(x);

	}

	public static void main(String[] args) {
		PracticeQuestion5 b = new PracticeQuestion5();

	}
}