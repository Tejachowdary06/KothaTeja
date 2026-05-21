package com.langfundamental.constructors;

public class CarExtendsBus {
	int carid;
	String carbrand;
	double price;

	CarExtendsBus() {
		System.out.println("no arg constructor");

	}

	CarExtendsBus(int carid, String carbrand, double price) {
		System.out.println("3 arg counstructor");
		this.carid = carid;
		this.carbrand = carbrand;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

	}

}
