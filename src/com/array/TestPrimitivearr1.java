package com.array;

public class TestPrimitivearr1 {

	public static void main(String[] args) {

//		declaration
		int[] numbers;

//		creation
//		array size me fixed
		numbers = new int[5];

//		initialization
		numbers[0] = 101;
		numbers[1] = 102;
		numbers[2] = 103;
		numbers[3] = 102;
		numbers[4] = 101;

//		representation
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
