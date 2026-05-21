package com.langfundamental.constructors;

public class Employee1 {
	int empid;
	String empname;
	double salary;

	Employee1() {
		this(1001);
		System.out.println("no arg constructor");
		display();
		System.out.println("**********************");
	}

	Employee1(int empid) {
		this(empid, "teja");
		System.out.println("one arg constructor");
		display();
		System.out.println("**********************");
	}

	Employee1(int empid, String empname) {
		this(empid, empname, 10000.00);
		System.out.println("two arg constructor");
		display();
		System.out.println("**********************");
	}

	Employee1(int empid, String empname, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;

		System.out.println("three arg constructor");
		System.out.println("**********************");
	}

	public static void main(String[] args) {
		Employee1 em = new Employee1();
		em.display();

	}

	void display() {
		System.out.println("employee id : " + empid);
		System.out.println("employee name : " + empname);
		System.out.println("employee salary : " + salary);
	}

}
