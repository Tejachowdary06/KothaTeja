package com.array;

public class TestArr10 {

	public static void main(String[] args) {

		Integer[] marks = { 80, 90, 75, 64, 86, 93, };

		int sum = 0;

		for (Integer mark : marks) {
//			Auto Boxing
			sum += mark;
		}

		System.out.println("Sum = " + sum);

	}

}
