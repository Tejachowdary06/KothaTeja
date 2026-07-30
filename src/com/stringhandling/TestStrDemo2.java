package com.stringhandling;

public class TestStrDemo2 {

	public static void main(String[] args) {

		String str = "aaabbc";

		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.print((char) i+""+count[i]);
			}
		}
	}
}