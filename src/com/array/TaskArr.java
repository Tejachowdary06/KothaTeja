package com.array;

import java.util.Scanner;

public class TaskArr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		int[] arr3=new int[size];
		
		int evenindex=0;
		int oddindex=0;
		
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
			if(arr1[i]%2==0) {
				arr2[evenindex]=arr1[i];
				evenindex++;
			}else {
				arr3[oddindex]=arr1[i];
				oddindex++;
			}
			
		}
		System.out.println("arr2");
		for(int i=0; i<evenindex;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("arr3");
		for(int i=0; i<oddindex;i++) {
			System.out.println(arr3[i]);
		}
	}

}
