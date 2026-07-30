package com.consolebasedapp;

import java.util.Scanner;

public class SavingsAccount extends Accounts {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome To SavingsAccount");

		SavingsAccount sa = new SavingsAccount();
		sa.customerdetails();
		sa.choice();
		
		
	}

}
