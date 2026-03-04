package com.langfundamental.methods.constructors;

public class Student {
	int stdid;
	String name;
	int stdage;

	static int couid = 1;
	static String couname = "india";


	public Student(int stdid, String name, int stdage) {
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		Student s = new Student(1,"teja",21);
		s.show();
		Student s1 = new Student(2,"anjali",21);
		s1.show();
	}

	void show() {
		System.out.println("stdid:" + stdid);
		System.out.println("stdname:" + name);
		System.out.println("stdage:" + stdage);
	}

}
