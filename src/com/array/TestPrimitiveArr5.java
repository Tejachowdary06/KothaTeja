package com.array;

public class TestPrimitiveArr5 {

	public static void main(String[] args) {
		

//		declaration
		byte[] numbers;

//		creation
//		array size me fixed
		numbers = new byte[5];

//		initialization
//		in byte we can't store more than 127 the range is -128 to +127
		numbers[0] = 121;
		numbers[1] = 123;
		numbers[2] = 127;
		numbers[3] = 113;
		numbers[4] = 123;

//		representation
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
