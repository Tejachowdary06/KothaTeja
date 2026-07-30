package com.pattern;

public class Pattern6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			// Left stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Spaces
			for (int l = 5; l > i; l--) {
				System.out.print("  ");
			}

			// Right stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 5 - 1; i >= 1; i--) {
			// Left stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Spaces
			for (int l = 5; l > i; l--) {
				System.out.print("  ");
			}

			// Right stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
