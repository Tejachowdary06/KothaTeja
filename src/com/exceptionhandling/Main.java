package com.exceptionhandling;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome To Chowdary Bank ");

		Scanner sc = new Scanner(System.in);

		Account account = new Account(6346477346L, "Teja", "2233", 10000.00);

		ATMService service = new ATMService(account);

		try {

			int choice;
			do {
				System.out.println("\n===== ATM MENU =====");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Change PIN");
				System.out.println("5. Exit");

				System.out.print("Enter Choice : ");
				choice = sc.nextInt();

				switch (choice) {

				case 1:
					boolean authenticated = false;

					while (!authenticated) {
						try {
							System.out.print("Enter PIN: ");
							String pin = sc.next();

							service.authenticate(pin);
							authenticated = true;

						} catch (InvalidPinException e) {
							System.out.println(e.getMessage());
							System.out.println("Please try again.");
						}
					}

					service.checkBalance();
					break;

				case 2:
					boolean authenticated1 = false;

					while (!authenticated1) {
						try {
							System.out.print("Enter PIN: ");
							String pin = sc.next();

							service.authenticate(pin);
							authenticated1 = true;

						} catch (InvalidPinException e) {
							System.out.println(e.getMessage());
							System.out.println("Please try again.");
						}
					}
					System.out.print("Enter Deposit Amount : ");
					double deposit = sc.nextDouble();

					service.deposite(deposit);

					break;

				case 3:
					boolean authenticated2 = false;

					while (!authenticated2) {
						try {
							System.out.print("Enter PIN: ");
							String pin = sc.next();

							service.authenticate(pin);
							authenticated2 = true;

						} catch (InvalidPinException e) {
							System.out.println(e.getMessage());
							System.out.println("Please try again.");
						}
					}

					System.out.print("Enter Withdraw Amount : ");
					double withdraw = sc.nextDouble();

					service.withdraw(withdraw);

					break;

				case 4:
					System.out.print("Enter Old PIN : ");
					String oldPin = sc.next();
					
					System.out.print("Enter New PIN : ");
					String newPin = sc.next();

					service.changePin(oldPin, newPin);

					break;

				case 5:

					System.out.println("Thank You...");
					break;

				default:

					System.out.println("Invalid Choice");
				}
			} while (choice != 5);

		} catch (InvalidPinException e) {

			System.out.println(e.getMessage());

		} catch (InvalidAmountException e) {

			System.out.println(e.getMessage());

		} catch (InsufficientBalanceException e) {

			System.out.println(e.getMessage());

		} catch (Exception e) {

			System.out.println("Something Went Wrong");

		} finally {

			sc.close();

		}

	}

}
