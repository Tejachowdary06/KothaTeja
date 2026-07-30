package com.array;

public class PrefixSuffixProductElement {

	public static void main(String[] args) {
		System.out.println("Product of remaning elements with current element");
		int[] arr = { 1, 2, 3, 4 };

		int n = arr.length;
		int[] ar = new int[n];
		ar[0] = 1;

		for (int i = 1; i < n; i++) {
			ar[i] = ar[i - 1] * arr[i - 1];
		}
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			ar[i] = ar[i] * suffix;
			suffix *= arr[i];
		}
		for(int a:ar) {
			System.out.println(a);
		}

	}

}
