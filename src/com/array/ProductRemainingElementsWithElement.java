package com.array;

public class ProductRemainingElementsWithElement {

	public static void main(String[] args) {
		System.out.println("Product of remaning elements with current element");
		int[] arr = { 1, 2, 3, 4 };
		
		for (int i = 0; i < arr.length; i++) {
			int product=1;
			for (int j = 0; j < arr.length; j++) {
				if(i==j) {
					continue;
				}
				product*=arr[j];
			}
			System.out.println(product);
		}
	}

}
