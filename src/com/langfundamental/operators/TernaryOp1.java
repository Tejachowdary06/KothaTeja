package com.langfundamental.operators;

public class TernaryOp1 {

	static int a = 5;
	static int b = 10;
	static int c = 4;
	static int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	static String evenodd = (a % 2 == 0) ? "even" : "odd";

	public static void main(String[] args) {
		System.out.println(max);
		System.out.println(evenodd);

	}

}
