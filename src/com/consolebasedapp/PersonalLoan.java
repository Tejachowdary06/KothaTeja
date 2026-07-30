package com.consolebasedapp;

public class PersonalLoan extends Loan {

	public static void main(String[] args) {

		System.out.println("Welcome To TejaChowdary Loan Banking ");

		PersonalLoan pl = new PersonalLoan();
		double sal = pl.getSalary();
		int cibilScore = pl.getCibilScore();
		int age = pl.ageCustomerAge();

		if (age >= 24 && sal > 100000 && (cibilScore >= 300 && cibilScore <= 900) && pl.validateAadhaar()
				&& pl.validatePan() && pl.validatePhone()) {

			System.out.println("Congratulations!!");
			System.out.println("You are Eligible for personal Loan");
			System.out.println("Your ROI is : " + pl.roiInfo());
			System.out.println("Enter Address details");
			String address = pl.getAddress();
			System.out.println("Customer Address is" + address);

		} else {
			System.out.println("Yor Loan Was rejected");
		}

	}

}
