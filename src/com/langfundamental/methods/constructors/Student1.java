package com.langfundamental.methods.constructors;

public class Student1 {
	String sname;
	double socmarks1;
	double matmarks2;
	double engmarks3;
	String branch;
	static double totalmarks;
	static double avarage;

	Student1(String sname, double socmarks1, double matmarks2, double engmarks3,String branch) {
		this.sname = sname;
		this.socmarks1 = socmarks1;
		this.matmarks2 = matmarks2;
		this.engmarks3 = engmarks3;
//		totalmarks = socmarks1 + matmarks2 + engmarks3;
//		avarage = totalmarks / 3;
//		System.out.println("total marks " + sname + " = " + totalmarks);
//		System.out.println("avarage marks " + sname + " = " + avarage);

	}

	public static void main(String[] args) {
		Student1 s = new Student1("teja", 60, 88, 68,"cse");
		s.show();
		Student1 s1 = new Student1("anjali", 100, 98, 99,"cse");
		s1.show();
		Student1 s2 = new Student1("vinay", 97, 86, 69,"cse");
		s2.show();
	}

	void show() {
		double totalmarks = socmarks1 + matmarks2 + engmarks3;
		double avarage = totalmarks / 3;
		System.out.println("total marks " + sname + " = " + totalmarks);
		System.out.println("avarage marks " + sname + " = " + avarage);

	}

}
