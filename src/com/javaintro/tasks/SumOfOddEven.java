package com.javaintro.tasks;

public class SumOfOddEven {

	public static void main(String[] args) {
		int sumEven=0;
		int count=0;
		int sumOdd=0;
		int count1=0;
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				count++;
				sumEven+=i;
			}else {
				count1++;
				sumOdd+=i;
			}
		}
		System.out.println("the sum of even numbers are : "+sumEven);
		System.out.println("count of even numbers are : "+count);
		System.out.println("the sum of odd numbers are : "+sumOdd);
		System.out.println("count of odd numbers are : "+count1);
	}
	
}
