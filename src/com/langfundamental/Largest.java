package com.langfundamental;

class Largest {
	int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Largest v = new Largest();
		System.out.println("factorial=" + v.factorial(12));
	}
}