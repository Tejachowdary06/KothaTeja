package com.langfundamental.methods;

public class TestMethodsDemo1 {

	public static void main(String[] args) {
		TestMethodsDemo1 t = new TestMethodsDemo1();
		t.age(20, 60);

	}

	void age(int a, int b) {
		int sum = a + b;
		System.out.println("addition:" + sum);
		age2(sum, 40);
	}

	void age2(int a, int b) {
		int sub = a - b;
		System.out.println("subraction:" + sub);
		age3(2, sub);

	}

	static void age3(int a, int b) {
		int mul = a * b;
		System.out.println("multipication:" + mul);

	}

}
