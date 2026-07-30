package com.array;

public class MoveZeroOneSide {

	public static void main(String[] args) {
		int[] arr = { 0,2, 0, 13, 36,49,50, 0 };
		int temp[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp[index++] = arr[i];
				
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}
}
