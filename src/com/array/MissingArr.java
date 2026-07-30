package com.array;

public class MissingArr {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,8};
		int n=arr.length+1;
		int sum=0;
		int mis=n*(n+1)/2;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int missing=mis-sum;
		System.out.println(missing);
	}
}
