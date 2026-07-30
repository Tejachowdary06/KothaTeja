package com.consolebasedapp;

import java.util.Scanner;

public class RailwayTicketBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String passengerName = "";
		String gender = "";
		int age = 0;
		int trainChoice = 0;
		int seatNo = 1;
		double fare = 0;

		int choice;
		char cont = 0;

		do {

			System.out.println("\n=================================");
			System.out.println("   RAILWAY RESERVATION SYSTEM");
			System.out.println("=================================");
			System.out.println("1. Search Train");
			System.out.println("2. Book Ticket");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. View Available Seats");
			System.out.println("5. Print Ticket");
			System.out.println("6. Exit");

			System.out.print("Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("\nAvailable Trains");
				System.out.println("1. Intercity Express");
				System.out.println("2. Charminar Express");
				System.out.println("3. Godavari Express");
				break;

			case 2:

				sc.nextLine(); // clear buffer

				System.out.print("Enter Passenger Name: ");
				passengerName = sc.nextLine();

				System.out.print("Enter Age: ");
				age = sc.nextInt();

				System.out.println("\nSelect Gender");
				System.out.println("1. Male");
				System.out.println("2. Female");
				System.out.println("3. Other");
				System.out.print("Enter Gender Choice: ");

				int genderChoice = sc.nextInt();

				switch (genderChoice) {
				case 1:
					gender = "Male";
					break;
				case 2:
					gender = "Female";
					break;
				case 3:
					gender = "Other";
					break;
				default:
					gender = "Not Specified";
				}
				
				boolean trainstatus=false;
				while(!trainstatus) {
				System.out.println("\nSelect Train");
				System.out.println("1. Intercity Express");
				System.out.println("2. Charminar Express");
				System.out.println("3. Godavari Express");

				System.out.print("Enter Train Choice: ");
				trainChoice = sc.nextInt();
				switch (trainChoice) {

				case 1:
					trainstatus=true;
					fare = 500;
					break;

				case 2:
					trainstatus=true;
					fare = 700;
					break;

				case 3:
					trainstatus=true;
					fare = 900;
					break;

				default :
					System.out.println("Invalid Train Choice");
				}
				}

				if (age >= 60) {
					fare = fare - (fare * 0.20);
					System.out.println("20% Senior Citizen Discount Applied");
				}

				System.out.println("\nTicket Booked Successfully");
				System.out.println("Seat Number : " + seatNo++);
				System.out.println("Fare : Rs." + fare);

				break;

			case 3:

				if (passengerName.equals("")) {
					System.out.println("No Ticket Booked Yet!");
				} else {
					passengerName = "";
					gender = "";
					age = 0;
					trainChoice = 0;
					fare = 0;

					System.out.println("Ticket Cancelled Successfully");
				}
				break;

			case 4:

				System.out.println("\nSeat Information");
				System.out.println("Total Seats      : 100");
				System.out.println("Booked Seats     : " + (seatNo - 1));
				System.out.println("Available Seats  : " + (100 - (seatNo - 1)));

				break;

			case 5:

				if (passengerName.equals("")) {
					System.out.println("No Ticket Booked Yet!");
				} else {

					System.out.println("\n=================================");
					System.out.println("           TRAIN TICKET");
					System.out.println("=================================");
					System.out.println("Passenger Name : " + passengerName);
					System.out.println("Age            : " + age);
					System.out.println("Gender         : " + gender);

					switch (trainChoice) {

					case 1:
						System.out.println("Train          : Intercity Express");
						break;

					case 2:
						System.out.println("Train          : Charminar Express");
						break;

					case 3:
						System.out.println("Train          : Godavari Express");
						break;
					}

					System.out.println("Fare           : Rs." + fare);
					System.out.println("=================================");
				}

				break;

			case 6:
				System.out.println("Thank You For Using Railway Reservation System");
				break;

			default:
				System.out.println("Invalid Choice");
			}

			if (choice == 6) {
				break;
			}

			System.out.print("\nDo You Want To Continue (Y/N): ");
			cont = sc.next().charAt(0);

		} while (cont == 'Y' || cont == 'y');

		sc.close();
	}
}