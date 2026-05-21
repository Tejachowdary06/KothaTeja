package com.langfundamental.constructors;

import java.util.Scanner;

public class Rentalcars {

	public static void main(String[] args) {
		Rentalcars c = new Rentalcars();
		System.out.println("company name:"+c.companyName());
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the days:");
		int days=sc.nextInt();
		System.out.println("totalrent"+c.totalrent(days));

	}
	String companyName() {
		String  name="TEJACARRENTALS";
		return name;
	}
	int basePrice() {
		int rent=1000;
		return rent;
	}
	int totalDays(int Days) {
		int days=Days*basePrice();
		return days;
	}
	int insurance() {
		int insur=500;
		return insur;
	}
	int totalrent(int days) {
		int totalrents=totalDays(days)+insurance();
		return totalrents;
	}
}
