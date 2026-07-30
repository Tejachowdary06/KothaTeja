package com.consolebasedapp;

import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {

		double amount = 10000.00;
		String status;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("ATM Menu");
			System.out.println("1:Check Balance");
			System.out.println("2:Deposite");
			System.out.println("3:Withdraw");
			System.out.println("4:Exit");
			System.out.println("Enter Your Choice");
			int Choice = sc.nextInt();
			switch (Choice) {
			case 1 -> {
				System.out.println("Check Balance");
				System.out.println("Current Balance : " + amount);
			}
			case 2 -> {
				System.out.println("How Much You Want To Deposite");
				double deposite = sc.nextDouble();
				if (deposite > 0) {
					amount = deposite;
					System.out.println("Deposite Successful");
					System.out.println(amount + deposite);
				}
			}
			case 3 -> {
				System.out.println("How Much You Want To Withdraw");
				double withdraw = sc.nextDouble();
				if (withdraw <= amount - 1000) {
					System.out.println("Withdraw");
					System.out.println(amount - withdraw);
				} else {
					System.out.println("invalid limit");
				}
			}
			case 4 -> {
				System.out.println("Exit");
			}
			default -> {
				System.out.println("You have no Account in my bank");
			}
			}
			System.out.println("Do you continue Yes/No");
			status = sc.next();
			sc.close();
		} while (status.equalsIgnoreCase("Yes"));
		

	}

}
