package com.consolebasedapp;

import java.util.Scanner;

public class Restarent {

	public static void main(String[] args) {
		int category, choice, quantity;
		double TotalBill = 0;
		String EnterItem;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter the category");
			System.out.println("1.non-veg");
			System.out.println("2.veg");
			System.out.println("3.staters");
			category = sc.nextInt();
			switch (category) {
			case 1 -> {
				System.out.println("Non-Veg  Menu");
				System.out.println("1.Chicken Biryani");
				System.out.println("2.Mutton Biryani");
				System.out.println("3.Fish Biryani");
				System.out.println("4.Chicken Fry Mandi");
				System.out.println("5.Chicken Juicy Mandi");
				System.out.println("6.Chicken Broasted Mandi");
				System.out.println("7.Mutton Fry Mandi");
				System.out.println("8.Mutton Juice Mandi");
				System.out.println("9.Mutton Broasted Mandi");
				System.out.println("enter you choice");
				choice = sc.nextInt();
				System.out.println("How many quantity you want");
				quantity = sc.nextInt();
				switch (choice) {
				case 1 -> {
					TotalBill += quantity * 140;
					System.out.println("Chicken Biryani Added");

				}
				case 2 -> {
					TotalBill += quantity * 180;
					System.out.println("Mutton Biryani Added");

				}
				case 3 -> {
					TotalBill += quantity * 150;
					System.out.println("Fish Biryani Added");

				}
				case 4 -> {
					TotalBill += quantity * 230;
					System.out.println("Chicken Fry Biryani Added");

				}
				case 5 -> {
					TotalBill += quantity * 260;
					System.out.println("Chicken Juicy Mandi Added");

				}
				case 6 -> {
					TotalBill += quantity * 270;
					System.out.println("Chicken Broasted Mandi Added");

				}
				case 7 -> {
					TotalBill += quantity * 320;
					System.out.println("Mutton Fry Mandi Added");

				}
				case 8 -> {
					TotalBill += quantity * 370;
					System.out.println("Mutton Juicy Mandi Added");

				}
				case 9 -> {
					TotalBill += quantity * 380;
					System.out.println("Mutton Broasted Mandi Added");
				}
				default -> {
					System.out.println("Enter Choice Is Invalid");
				}

				}

			}
			case 2 -> {
				System.out.println("Veg  Menu");
				System.out.println("1.Panneer Biryani");
				System.out.println("2.Veg Biryani");
				System.out.println("3.Paneer Mandi");
				System.out.println("4.Panner Gravy Mandi");
				System.out.println("enter you choice");
				choice = sc.nextInt();
				System.out.println("How many quantity you want");
				quantity = sc.nextInt();
				switch (choice) {
				case 1 -> {
					TotalBill += quantity * 150;
					System.out.println("Paneer Biryani Added");

				}
				case 2 -> {
					TotalBill += quantity * 130;
					System.out.println("Veg Biryani Added");

				}
				case 3 -> {
					TotalBill += quantity * 210;
					System.out.println("Paneer Mandi Added");

				}
				case 4 -> {
					TotalBill += quantity * 230;
					System.out.println("Paneer Gravy Biryani Added");
				}
				default -> {
					System.out.println("Enter Choice Is Invalid");
				}

				}
			}
			case 3 -> {
				System.out.println("starters  Menu");
				System.out.println("1.Gulab Jamun");
				System.out.println("2.Double Ka Meetha");
				System.out.println("3.Ice Cream");
				System.out.println("Enter You Choice");
				choice = sc.nextInt();
				System.out.println("How Many Quantity You Want");
				quantity = sc.nextInt();
				switch (choice) {
				case 1 -> {
					TotalBill += quantity * 40;
					System.out.println("Gulab Jamun");

				}
				case 2 -> {
					TotalBill += quantity * 60;
					System.out.println("Double Ka Meetha");

				}
				case 3 -> {
					TotalBill += quantity * 40;
					System.out.println("Ice Cream");
				}
				default -> {
					System.out.println("Enter Choice Is Invalid");
				}

				}
			}
			default -> {
				System.out.println("Enter Category Invalid");
			}

			}
			System.out.println("Current Bill : " + TotalBill);
			System.out.println("Do you want more itmes Click Yes/No");
			EnterItem = sc.next();
			sc.close();

		} while (EnterItem.equalsIgnoreCase("yes"));

	}
}
