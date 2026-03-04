package com.langfundamental;

import java.util.Scanner;

public class BankDemo1 {
	static Scanner sc = new Scanner(System.in);
	int accno;
	String name;
	int balance;
	int pin;

	public static void main(String[] args) {
		System.out.println("main method started");
		BankDemo1 b = new BankDemo1();
		b.accno = 1234;
		b.name = "teja";
		b.balance = 20000;
		b.pin = 1265348;
		BankDemo1 b1 = new BankDemo1();
		b1.accno = 1234;
		b1.name = "anjali";
		b1.balance = 40000;
		b1.pin = 1268534;

		deposite(b);
		withdraw(b);
		pinchange(b);

		sc.close();
	}

	static void deposite(BankDemo1 b) {
		System.out.println("Enter the Deposit amount:");
		int a1 = sc.nextInt();
		int amount=b.balance+a1;
		System.out.println("Total Balance:" + (amount));
		check(amount);

	}

	static void withdraw(BankDemo1 b) {
		System.out.println("Enter the withdraw amount");
		int a2 = sc.nextInt();
		System.out.println("Total Balance:" + (b.balance - a2));

	}

	static void pinchange(BankDemo1 p) {
		System.out.println("enter the pin:");
		int a3 = sc.nextInt();
		System.out.println("pin :" + a3);

	}
	static void check(int f) {
		System.out.println("enter the check amount");
		int a4 = sc.nextInt();
		int total=f+a4;
		System.out.println("total balance:"+(total));
	}

}
