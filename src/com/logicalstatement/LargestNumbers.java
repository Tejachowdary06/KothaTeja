package com.logicalstatement;

import java.util.Scanner;

//Check the two numbers and print the number is larger or not
public class LargestNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number : ");		
		int a=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("The Given First Number is Larger");
		}else if(a<b) {
			System.out.println("The Given Second Number is Larger");
		}
		sc.close();
	}

}
