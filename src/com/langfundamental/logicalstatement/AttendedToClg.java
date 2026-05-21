package com.langfundamental.logicalstatement;

import java.util.Scanner;

public class AttendedToClg {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("are you attending the class regularly");
		
		boolean areYouAttendingCls=sc.nextBoolean();
		
		if (areYouAttendingCls) {
			System.out.println("you will understand the classes properly");
		}else {
			System.out.println("you are a rich kid you no need to come the cls regularly!! you can depend on your parents");
		}
	}

}
