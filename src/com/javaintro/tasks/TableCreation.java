package com.javaintro.tasks;

import java.util.Scanner;

public class TableCreation {

	public static void main(String[] args) {
		
		System.out.println("print the tables");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter which number you need to  procced :");
		int n=sc.nextInt();
		System.out.println("enter the number where up to you need :");
		int n1=sc.nextInt();
		
		for(int i=0;i<=n1;i++) {
			
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
