package com.array;

import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int key=sc.nextInt();
		
		int[] arr= {10,20,30,40,50,60,70};
		boolean found=false;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==key) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("enter value is found");
		}else {
			System.out.println("enter the value is not found");
		}
	}

}
