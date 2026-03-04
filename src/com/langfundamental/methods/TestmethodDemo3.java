package com.langfundamental.methods;

public class TestmethodDemo3 {
	static int i = 0;

	void wholenum() {
		i++;
		System.out.println("natural numbers=" + i);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestmethodDemo3 a = new TestmethodDemo3();
		for (int j = 0; j < 10; j++) {
			a.wholenum();
		}
		int count = 0;
		while (count < 20) {
			a.wholenum();
			count++;
		}
	}

}