package com.oops;

public class ObjScenario1 extends ObjScenario4 {

	void display() {
		System.out.println("hello ObjScenario_1.0 !!!");
	}

	public static void main(String[] args) {

//		By using child object child reference we can call both child and parent class functionalities

		ObjScenario1 s1 = new ObjScenario1();
		s1.show();
		s1.display();

//		We can create parent class object with parent reference in child cls
//		By using parent class reference we can call only parent class funcc not child cls funcc

		ObjScenario4 s2 = new ObjScenario4();
		s2.show();
//		The method display() is undefined for the type ObjScenario4
//		s2.display();
		
//		
		
		ObjScenario4 s3 = new ObjScenario1();
		s3.show();
//		The method display() is undefined for the type ObjScenario4
//		s2.display();
		
	}

}
