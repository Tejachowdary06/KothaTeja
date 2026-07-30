package com.langfundamental.operators;

import java.util.Scanner;

public class TernaryOp2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		String check = (num % 2 == 0) ? "even" : "odd";
		System.out.println(check);
		sc.close();
	}

}
