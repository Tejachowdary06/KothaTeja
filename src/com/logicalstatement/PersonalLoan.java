package com.logicalstatement;

import java.util.Scanner;

public class PersonalLoan {
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

		int cibilscore = getCibilScore();
		if (cibilscore >= 300 && cibilscore <= 599) {
			System.out.println("Bad! High risk; loan applications are frequently rejected.");
			roi = 11.0;
		} else if (cibilscore >= 600 && cibilscore <= 699) {
			System.out.println("Avarage! Approvals are possible, but you may face higher interest rates");
			roi = 10.0;
		} else if (cibilscore >= 700 && cibilscore <= 749) {
			System.out.println("Good! Favorable for most loans and credit cards.");
			roi = 9.0;
		} else if (cibilscore >= 750 && cibilscore <= 900) {
			System.out.println("Good! Favorable for most loans and credit cards.");
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

		address = "Flat No : " + flat + ",Street :  " + street + ", City : " + city + ", Pin Code : " + pincode
				+ ", state : " + state;
		return address;
	}

	void getPersonalLoanDocument() {
		System.out.println("All Personal Loan Document have been Verified");
	}

	public static void main(String[] args) {

		System.out.println("Welcome To TejaChowdary Loan Banking ");
		PersonalLoan pl = new PersonalLoan();
		double sal = pl.getSalary();
		int cibilScore = pl.getCibilScore();
		int age = pl.ageCustomerAge();

		if (age >= 26 && sal > 500000 && (cibilScore >= 300 && cibilScore <= 900) && pl.validateAadhaar()
				&& pl.validatePan() && pl.validatePhone()) {

			System.out.println("Congratulations!!");
			System.out.println("You are Eligible for personal Loan");
			System.out.println("Your ROI is : " + pl.roiInfo());
			System.out.println("Enter Address details");
			String address = pl.getAddress();
			System.out.println("Customer Address is" + address);
			pl.getPersonalLoanDocument();

		} else {
			System.out.println("Yor Loan Was rejected");
		}
	}

}
