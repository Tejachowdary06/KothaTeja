package com.array;

public class TestArr5 {

	public static void main(String[] args) {

		float[] weight = { 50.93f, 64.45f, 34.23f, 34.24f, 34.23f};
		for(int i=0;i<weight.length;i++) {
			if(weight[i]>45.0) {
				System.out.println(weight[i]);
			}else {
				System.out.println("less weight");
			}
			
		}

	}

}
