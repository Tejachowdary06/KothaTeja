package com.logicalstatement;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Start Number");
		int start=sc.nextInt();
		System.out.println("Enter the End Number");
		int end=sc.nextInt();
		for(int i=start; i<end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}
	static boolean isPrime(int n) {
		boolean flag=true;
		
		if(n==0 || n==1) {
			flag=false;
			return flag;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				return flag;
				
			}
		}
		
		return flag;
	}

}
