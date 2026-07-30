package com.array;

public class TestArr3 {

	public static void main(String[] args) {

		int[] marks = { 94, 84, 73, 58, 93, 96 };
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		System.out.println(sum);
		int avg = sum / marks.length;
		System.out.println(avg);
	}

}
