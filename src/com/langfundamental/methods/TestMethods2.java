package com.langfundamental.methods;

import java.util.Scanner;

public class TestMethods2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Check Wether The Given Number Is Square");
		int n = sc.nextInt();
		
		int square=square(n);
		System.out.println(square);

	}

	static int square(int n) {
		int n1 = n * n;
		return n1;
	}

}
