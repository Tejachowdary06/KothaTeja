package com.langfundamental.constructors;

public class PracticeQuestion3 {
	int empid;
	String empName;

	PracticeQuestion3() {
		super();
		this.empid = 101;
		this.empName = "teja";
		System.out.println("no arg constructor");
		System.out.println("employeeid : " + empid);
		System.out.println("employee Name : " + empName);
	}

	PracticeQuestion3(PracticeQuestion3 e) {
		empid=e.empid;
		empName=e.empName;
		System.out.println("parameterized constructor");
		System.out.println("employeeid : " + empid);
		System.out.println("employee Name : " + empName);

	}

	public static void main(String[] args) {
		PracticeQuestion3 e = new PracticeQuestion3();
		PracticeQuestion3 e1 = new PracticeQuestion3(e);

	}

}
