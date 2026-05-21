package com.langfundamental.constructors;

public class PracticeQuestion4 {
	double length;
	double bredth;

	private PracticeQuestion4() {
		System.out.println("no arg constructor called");
		length = 20;
		bredth = 16;
	}

	public static void main(String[] args) {
		PracticeQuestion4 t = new PracticeQuestion4();
		t.method();
	}

	void method() {
		double Total = length * bredth;
		method1(Total);

	}

	void method1(double Area) {
//		double areaOfTriangle = Area;
		System.out.println("areaOfTriangle : " + Area);
	}
}
