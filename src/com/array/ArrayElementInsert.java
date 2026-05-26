package com.array;

import java.util.Scanner;

public class ArrayElementInsert {

	public static void main(String[] args) {
		System.out.println("main method started!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		
		System.out.println("main method started!");
		sc.close();
	}
}
