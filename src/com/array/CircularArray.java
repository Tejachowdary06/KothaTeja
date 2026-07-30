package com.array;

public class CircularArray {
	static int sum=0;

	public static void main(String[] args) {

		Object[] arr = { 10, new Object[] { 20, 30, new Object[] { 40, 50 } } };

		m1(arr);
		System.out.println("Sum = " + sum);
	}

	static void m1(Object[] arr) {

		for (Object element : arr) {

			if (element instanceof Object[]) {
			  m1((Object[]) element);
			} else {
				System.out.println(element + " ");
				sum += (Integer) element;
			}
		}

		
	}
}