package com.array;

public class TestPrimitiveArr2 {

	public static void main(String[] args) {
		
//		declaration
		String[] names;

//		creation
//		array size me fixed
		names = new String[5];

//		initialization
		names[0] = "Teja";
		names[1] = "Anjali";
		names[2] = "Vinay";
		names[3] = "Navya";
		names[4] = "Anjali";

//		representation
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		
	}

}
