package com.logicalstatement;

import java.util.Scanner;

public class ElectricCityBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn="";
		
		do {
		System.out.println("Enter the Units");
		int units = sc.nextInt();
		int bill = 0;
		if (units <= 100) {
			bill = units * 2;
		} else if (units <= 200) {
			bill = units * 3;
		} else if (units <= 300) {
			bill = units * 4;
		} else {
			bill = units * 7;
		}
		System.out.println("*************************");
		System.out.println("Electric Bill is : "+bill);
		System.out.println("*************************");
		
		System.out.println("Do You Want To Continue Click Yes/No");
		yn=sc.next();
	}while(yn.equalsIgnoreCase("y"));
	}

}
