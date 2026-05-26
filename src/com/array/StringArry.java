package com.array;

import java.util.Scanner;

public class StringArry {

	public static void main(String[] args) {
		System.out.println("Main Method started!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		String[] arr=new String[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			if(arr[i].startsWith("a")&&arr[i].endsWith("i")) {
				System.out.println(arr[i]);
			}
		}
	}

}
