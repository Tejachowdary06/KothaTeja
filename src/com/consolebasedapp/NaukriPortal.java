package com.consolebasedapp;

import java.util.Scanner;

public class NaukriPortal {

	public static void main(String[] args) {
		System.out.println("Welcome to IT industry");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("hello : " + name);
		System.out.println("enter your education qualification");
		System.out.println("B.Tech");
		System.out.println("B.Com");
		System.out.println("B.Sc");
		System.out.println("MBA");
		System.out.println("MCA");
		System.out.println("MBBS");

		String qualification = sc.nextLine();
		if (qualification.equalsIgnoreCase("B.Tech")) {
			System.out.println("Great! yor are eligible to proceed");
			System.out.println("Great! How many years of experience do you have?");
			int experience = sc.nextInt();
			if (experience >= 1) {
				System.out.println("Great we can carry on");
				System.out.println("what is your current salary?");
				double salary = sc.nextDouble();
				System.out.println("how much salary your are expecting");
				double expectsalary = sc.nextDouble();
				if (expectsalary > 5000000 && expectsalary <= 8000000) {
					System.out.println("ohk shell we proceed");
					System.out.println("which technology are you skilled in");
					System.out.println("java");
					System.out.println("python");
					System.out.println("devops");
					System.out.println("data science");
					System.out.println("Mysql");
					String tech = sc.next();
					if (tech.equalsIgnoreCase("java")) {
						System.out.println("Great! we can carry on");
						System.out.println("Do you know MySQL");
						String lang = sc.next();
						if (lang.equalsIgnoreCase("yes")) {
							System.out.println("Great! you are eligible to proceed");
							System.out.println("what is your UG percentage");
							int perc = sc.nextInt();
							if (perc >= 70) {
								System.out.println("Great you are eligible for next round");
								System.out.println("Are you willing to Relocate");
								String relocate = sc.next();
								if (relocate.equalsIgnoreCase("yes")) {
									System.out.println("yes we can continue");
									System.out.println("Do you have all education documents");
									String edu = sc.next();
									if (edu.equalsIgnoreCase("yes")) {
										System.out.println("ohh good to continue");
										System.out.println("ohh Great your profile is match with our profile");
										System.out.println("HR team will be contact you soon");
									} else {
										System.out.println("sorry you may leave");
									}

								} else {
									System.out.println("sorry you can leave for the day");
								}

							} else {
								System.out.println("we are looking for more than 70% accademic score is required");
							}
						} else {
							System.out.println("you can leave for the day");
						}
					} else {
						System.out.println("yor expectation is too high we can't affort");
					}

				} else {
					System.out.println("You can leave for the day");
				}

			} else {
				System.out.println("Sorry! Currently we are looking for candidate with at least 1 year experience ");
			}

		} else {
			System.out.println("sorry your education details is not match with our profile");
		}
		sc.close();
	}
}
