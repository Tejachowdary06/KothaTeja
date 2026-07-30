package com.logicalstatement;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0) {
			int r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.print("reverse number : "+rev);
		System.out.println();
		if(temp==rev) {
			System.out.println("The number is palindrome");
		}else {
			System.out.println("The number is not palindrome");
		}
		sc.close();
	}

}
