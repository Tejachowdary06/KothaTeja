package com.array;

public class TestArr7 {

	public static void main(String[] args) {

		int[] num = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int start = 0;
		int end = num.length-1;

		while (start < end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}
		for (int n : num) {
			System.out.print(n+"  ");
		}

	}

}
