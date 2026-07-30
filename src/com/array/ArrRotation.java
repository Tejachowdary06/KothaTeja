package com.array;

import java.util.Scanner;

public class ArrRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("how many times you want to rotate");
		int r = sc.nextInt();
		arrRotation(arr, r);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	static void arrRotation(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
		
//		step 1:reverse the total arr
		arrReverse(arr, start, end);
//		step 2:reverse the first half arr
		arrReverse(arr,start,r-1);
//		step 3:reverse the second half arr
		arrReverse(arr,r,end);
	}

	static void arrReverse(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}

}
