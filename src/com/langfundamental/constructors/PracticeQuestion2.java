package com.langfundamental.constructors;

public class PracticeQuestion2 {

	PracticeQuestion2() {
		System.out.println("no arg constructor");
	}

	PracticeQuestion2(PracticeQuestion2 p) {
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		PracticeQuestion2 p = new PracticeQuestion2();
		PracticeQuestion2 p1 = new PracticeQuestion2(p);
	}

}
