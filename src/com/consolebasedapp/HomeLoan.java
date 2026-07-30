package com.consolebasedapp;

public class HomeLoan extends Loan {

	public static void main(String[] args) {

		System.out.println("Welcome To TejaChowdary Loan Banking ");

		HomeLoan hl = new HomeLoan();
		double sal = hl.getSalary();
		int cibilScore = hl.getCibilScore();
		int age = hl.ageCustomerAge();

		if (age >= 22 && sal > 600000 && (cibilScore >= 300 && cibilScore <= 900) && hl.validateAadhaar()
				&& hl.validatePan() && hl.validatePhone()) {

			System.out.println("Congratulations!!");
			System.out.println("You are Eligible for Home Loan");
			System.out.println("Your ROI is : " + hl.roiInfo());
			System.out.println("Enter Address details");
			String address = hl.getAddress();
			System.out.println("Customer Address is" + address);

		} else {
			System.out.println("Yor Home Loan Was rejected");
		}
	}

}
