package com.langfundamental.constructors;

public class Employee {
	int employeeid;
	String employeeName;
	String employeeCorse;
	double employeeSalary;

	Employee() {
		employeeid = 101;
		employeeName = "teja";
		employeeCorse = "JFS";
		employeeSalary = 1200000.00;
		System.out.println("Book object is created");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println("employee id : "+e.employeeid);
		System.out.println("employee Name : "+e.employeeName);
		System.out.println("employee Corse : "+e.employeeCorse);
		System.out.println("employee Salary : "+e.employeeSalary);
	}
}
