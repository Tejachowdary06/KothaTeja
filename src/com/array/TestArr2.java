package com.array;

public class TestArr2 {

	public static void main(String[] args) {

		double[] hight = { 5.5, 5.4, 5.8, 4.8, 4.7, 4.5 };

//		By Using ForLoop 
//		for (int i = 0; i < hight.length; i++) {
//			System.out.print(hight[i]+"  ");
//		}
		
//		By Using ForEachloop
		for(double h:hight) {
			System.out.println(h);
		}

	}

}
