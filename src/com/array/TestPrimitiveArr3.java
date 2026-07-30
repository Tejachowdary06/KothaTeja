package com.array;

public class TestPrimitiveArr3 {

	public static void main(String[] args) {
		
//		declaration
		float[] salary;

//		creation
//		array size me fixed
		salary = new float[5];

//		initialization
		salary[0] = 10000.00f;
		salary[1] = 20000.00f;
		salary[2] = 3000.00f;
		salary[3] = 4000.00f;
		salary[4] = 3000.00f;

//		representation
		for (int i = 0; i < salary.length; i++) {
			System.out.println(salary[i]);
		}
		
	}

}
