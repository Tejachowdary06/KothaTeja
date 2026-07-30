package com.exceptionhandling;

public class CustomExDemo1 {

	    public static void main(String[] args) {

	        try {
	            throw new AmountException("Invalid Deposit Amount");
	        }
	        catch (AmountException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

