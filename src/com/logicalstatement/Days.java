package com.logicalstatement;

import java.util.Scanner;

public class Days {
	static String getdayinfo(int day) {
		switch(day) {
		case 1->{
		return "monday";
		}
		case 2->{
		return "tuesday";
		}
		case 3->{
		return "friday";
		}
		default->{
		return "invalid day";
		}
		
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Day");
		int day=sc.nextInt();
		System.out.println(getdayinfo(day));
		sc.close();
	}

}
