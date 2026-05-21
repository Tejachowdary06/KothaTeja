package com.langfundamental.constructors;

import java.util.Scanner;

public class CarRentals {

	public static void main(String[] args) {
		CarRentals c = new CarRentals();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the days");
		int days=sc.nextInt();
		int totalrent=c.totaldays(days);
		System.out.println(totalrent);

	}

	String hello() {
		String name = "welcome to car rentals";
		return name;
	}

	int baseRentalPrice() {
		int price = 1000;
		return price;
	}

	int insurance() {
		int insurancee = 500;
		return insurancee;
	}
	int totaldays(int days) {
		int day=days*baseRentalPrice()+insurance();
		return day;
		
	}

}
