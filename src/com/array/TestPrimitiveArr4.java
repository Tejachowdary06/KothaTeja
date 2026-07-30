package com.array;

public class TestPrimitiveArr4 {

	public static void main(String[] args) {
		
		
//		declaration
		double[] bonus;

//		creation
//		array size me fixed
		bonus = new double[5];

//		initialization
		bonus[0] = 10000.00f;
		bonus[1] = 20000.00f;
		bonus[2] = 3000.00f;
		bonus[3] = 4000.00f;
		bonus[4] = 3000.00f;

//		representation
		for (int i = 0; i < bonus.length; i++) {
			System.out.println(bonus[i]);
		}
		
	}

}
