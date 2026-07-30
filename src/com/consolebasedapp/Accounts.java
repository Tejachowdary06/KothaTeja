package com.consolebasedapp;

import java.util.Scanner;

public class Accounts {

	static Scanner sc = new Scanner(System.in);
	String accountNo;
	String customerName;
	double balance;

	void customerdetails() {
		System.out.println("Enter Customer Account No : ");
		accountNo = sc.next();
		System.out.println("Enter Customer Name : ");
		customerName = sc.next();
		System.out.println("Enter the Current Balance");
		balance = sc.nextDouble();
		
	}

	void deposite() {
		System.out.println("Enter the amount to Deposite");
		double amount = sc.nextDouble();
		balance += amount;
		System.out.println("Amount deposited successfully");
		System.out.println("Current Balance : " + balance);
	}

	void withdraw() {
		System.out.println("Enter the amount to Withdraw");
		double withdraw = sc.nextDouble();
		if (withdraw <= balance) {
			balance -= withdraw;
			System.out.println("Amount deposited successfully");
			System.out.println("Current Balance : " + balance);
		} else {
			System.out.println("Insuffient Funds");
		}
	}

	void checkBalance() {
		System.out.println("Current Balance : " + balance);
	}
	
	double getIntrestRate() {
		return 0;
		
	}
	
	void choice() {
		System.out.println("enter your choice");
		System.out.println("1.Deposite");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		int ch = sc.nextInt();
		switch(ch) {
		case 1->deposite();
		case 2->withdraw();
		case 3->checkBalance();
		}
		

	}

}
