package com.array;

public class MultimissingArr {

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,8,10};
		int maxnumber=10;
		boolean[] present=new boolean[maxnumber+1];
		
		for(int num:arr) {
			present[num]=true;
		}
		System.out.print("missing elements");
		for(int i=1;i<=maxnumber;i++) {
			if(!present[i]) {
				System.out.print(i+" ");
			}
		}
	}
}