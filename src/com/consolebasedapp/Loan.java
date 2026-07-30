package com.consolebasedapp;

import java.util.Scanner;

public class Loan {
	Scanner sc = new Scanner(System.in);
	
	boolean validateAadhaar() {
		System.out.println("Enter your Aadhar Details");
		String aadhar = sc.next();
		return aadhar.matches("\\d{12}");
	}

	boolean validatePan() {
		System.out.println("Enter your Pan Card No");
		String pancard = sc.next();
		return pancard.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	boolean validatePhone() {
		System.out.println("Enter your Phone No ");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}

	int ageCustomerAge() {
		System.out.println("Enter your age");
		int age = sc.nextInt();
		return age;
	}

	double getSalary() {
		System.out.println("Enter your salary");
		double sal = sc.nextDouble();
		return sal;
	}

	int getCibilScore() {
		System.out.println("Enter your cibilscore");
		int cib = sc.nextInt();
		return cib;
	}

	double roiInfo() {
		double roi = 12.0;

		int cibilScore = getCibilScore();
		if (cibilScore >= 300 && cibilScore <= 599) {
			System.out.println("Bad! High risk; loan applications are frequently rejected.");
			roi = 11.0;
		} else if (cibilScore >= 600 && cibilScore <= 699) {
			System.out.println("Average! Approvals are possible, but you may face higher interest rates");
			roi = 10.0;
		} else if (cibilScore >= 700 && cibilScore <= 749) {
			System.out.println("Good! Favorable for most loans and credit cards.");
			roi = 9.0;
		} else if (cibilScore >= 750 && cibilScore <= 900) {
			System.out.println("Best Cibil Score! Favorable for most loans and credit cards.");
			roi = 8.0;
		}

		return roi;
	}

	String getAddress() {
		String address = " ";
		System.out.println("Enter your HouseNo =");
		String flat = sc.next();
		System.out.println("Enter your street =");
		String street = sc.next();
		System.out.println("Enter your city =");
		String city = sc.next();
		System.out.println("Enter your pin code =");
		long pincode = sc.nextLong();
		System.out.println("Enter your state =");
		String state = sc.next();

		address = " Flat No : " + flat + ", Street :  " + street + ", City : " + city + ", Pin Code : " + pincode
				+ ", state : " + state;
		return address;
	}
	
}
