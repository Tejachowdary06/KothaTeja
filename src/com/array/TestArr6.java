package com.array;

public class TestArr6 {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int[] rev=new int[num.length];
		
		for(int i=0;i<num.length;i++) {
			rev[i]=num[num.length-1-i];
		}
		
		for(int n:rev){
			System.out.print(n+"  ");
		}
		
	}

}
