package com.langfundamental;

public class Employee {
	static int empid = 101;
	static String empname = "tejachowdary";
	static double salary = 20000;
	void display(){
		System.out.println("empid = " + empid);
		System.out.println("empname = " + empname);
		System.out.println("employ salary = " + salary);
		double bonus = salary * 0.1;
		salary = salary + bonus;
		System.out.println("total = " + salary);
	}

	public static void main(String[] args) {
		Employee m = new Employee();
		m.display();
	}
}
