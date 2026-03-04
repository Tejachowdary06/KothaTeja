package com.javaintro;

public class Exam {
	static double celsius = 40;
	double farenheit;

	public static void main(String[] args) {
		Exam t = new Exam();
		Exam e = new Exam();
		t.celsius();
		e.farenheit();
	}

	void farenheit() {
		double farenheit = ((celsius * 9 / 5) + 32);
		System.out.println(farenheit);
	}

	void celsius() {
		double farenheit = 104;
		double celsius = ((farenheit - 32) * 5 / 9);
		System.out.println(celsius);
	}

}