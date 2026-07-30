package com.consolebasedapp;

import java.util.Scanner;

public class VegetablesFruitShopping {

	public static void main(String[] args) {

		int category, choice, quantity;
		double totalBill = 0;
		String continueShopping;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("**MARKET MENU**");
			System.out.println("1.Vegatable Market");
			System.out.println("2.Fruit Market");
			System.out.println("Enter Category:");
			category = sc.nextInt();
			switch (category) {
			case 1 -> {
				System.out.println("**VEGETABLE MARKET**");
				System.out.println("1.Tomato   - Rs.100/kg");
				System.out.println("2.Potato   - Rs.30/kg");
				System.out.println("3.Onion    - Rs.50/kg");
				System.out.println("4.Carrot   - Rs.60/kg");

				System.out.println("Enetr Vegetable Choice:");
				choice = sc.nextInt();
				System.out.println("Enter Quantity (kg)");
				quantity = sc.nextInt();
				switch (choice) {
				case 1 -> {
					totalBill += quantity * 100;
					System.out.println("Tomato Added");
				}
				case 2 -> {
					totalBill += quantity * 30;
					System.out.println("Potato Added");
				}
				case 3 -> {
					totalBill += quantity * 50;
					System.out.println("Onion Added");
				}
				case 4 -> {
					totalBill += quantity * 60;
					System.out.println("Carrot Added");
				}
				default -> {
					System.out.println("Invalid Vegetable Choice");
				}

				}

			}
			case 2 -> {
				System.out.println("** FRUIT MARKET **");
				System.out.println("1. Apple   - Rs.120/kg");
				System.out.println("2. Banana  - Rs.50/dozen");
				System.out.println("3. Mango   - Rs.100/kg");
				System.out.println("4. Orange  - Rs.80/kg");
				System.out.println("Enter Fruit Choice :");
				choice = sc.nextInt();
				System.out.println("Enetr Quantity :");
				quantity = sc.nextInt();
				switch (choice) {
				case 1 -> {
					totalBill += quantity * 120;
					System.out.println("Apple Added");
				}
				case 2 -> {
					totalBill += quantity * 50;
					System.out.println("Banana Added");
				}
				case 3 -> {
					totalBill += quantity * 100;
					System.out.println("Mango Added");
				}
				case 4 -> {
					totalBill += quantity * 80;
					System.out.println("Orange Added");
				}
				default -> {
					System.out.println("Invalid Fruit Choice");
				}
				}

			}
			default -> {
				System.out.println("Invalid Category");
			}
			}
			System.out.println("Current Bill :Rs." + totalBill);
			System.out.println("Do you want to continue shopping(YES/NO)?");
			continueShopping = sc.next();
		} while (continueShopping.equalsIgnoreCase("yes"));
		System.out.println("total bill = " + totalBill);
		System.out.println("-----final bill------");
		System.out.println("Thanks for shopping");
		sc.close();
	}
}