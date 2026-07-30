package com.exceptionhandling;

public class AmountException extends Exception {

    public AmountException() {
        super("Amount must be greater than zero");
    }

    public AmountException(String message) {
        super(message);
    }
}