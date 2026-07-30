package com.exceptionhandling;

import java.security.InvalidAlgorithmParameterException;

public class ATMService {

	private Account account;

	public ATMService(Account account) {
		this.account = account;
	}

	public void login(String enterpin) throws InvalidPinException {

		if (!account.getPin().equals(enterpin)) {
			throw new InvalidPinException("Incorrect pin please enter a valid pin");
		}

		System.out.println("Login successful");

	}
	public void authenticate(String pin) throws InvalidPinException {

	    if (!account.getPin().equals(pin)) {
	        throw new InvalidPinException("Invalid PIN Please Enter a Valid Pin");
	    }
	}

	public void checkBalance() {
		System.out.println("Current Balance : " + account.getBalance());
	}

	public void deposite(double deposite) throws InvalidAmountException {
		if (deposite <= 0) {
			throw new InvalidAmountException("Amount Must Be Greater Than Zero");
		}
		account.setBalance(account.getBalance() + deposite);

		System.out.println("₹" + deposite + " Deposited Successfully");
		System.out.println("Current Balance : ₹" + account.getBalance());
	}

	public void withdraw(double withdraw) throws InvalidAmountException, InsufficientBalanceException {
		if (withdraw <= 0) {
			throw new InvalidAmountException("Amount must be greater than zero");
		}

		if (withdraw > account.getBalance()) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}

		account.setBalance(account.getBalance() - withdraw);

		System.out.println("₹" + withdraw + " Withdrawn Successfully");
		System.out.println("Current Balance : ₹" + account.getBalance());

	}

	public void changePin(String oldPin, String newPin) throws InvalidPinException {

		if (!account.getPin().equals(oldPin)) {
			throw new InvalidPinException("Old PIN is Incorrect");
		}

		account.setPin(newPin);

		System.out.println("PIN Changed Successfully");
	}

}
