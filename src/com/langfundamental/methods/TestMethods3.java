package com.langfundamental.methods;

import java.util.Scanner;

public class TestMethods3 {
	static int n = 0;

	public static void main(String[] args) {
		int sumOfTwo = sum(n);
		System.out.println(sumOfTwo);
		
	}

	static int sum(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number n1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the Number n2 : ");
		int n2 = sc.nextInt();
		System.out.println("sum");
		int a = n1 + n2;
		return a;
	}

}
