package com.logicalstatement;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number To Check it is Strong Or Not");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			int fact = 1;
			for (int i = rem; i > 0; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			temp=temp/10;
		}
		if(sum==n) {
			System.out.println("Strong");
		}else {
			System.out.println("Not Strong");
		}
		sc.close();
	}

}
