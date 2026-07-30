package com.array;

public class DupliacteAllArr {

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,3,2,3,4,5,4,6,7,55,4,6,43,35 };
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.println(arr[i]+" ");	
			}
		}
	}

}
