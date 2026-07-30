package com.langfundamental.methods;

import java.util.Scanner;

public class TestMethods1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Wether the number is even or odd");
		int n=sc.nextInt();
		
		evenOdd(n);
		
	}
	static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
