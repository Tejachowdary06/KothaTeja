package com.oops;

public class Student2 {

	public static void main(String[] args) {

		Student c = new Student();

//		we can access the data by using setters and getters from one class to another class
		c.setstid(101);
		c.setsname("ammu");
		c.setbranch("cse");
		c.setyop(2026);
		System.out.println(c.getstid());
		System.out.println(c.getsname());
		System.out.println(c.getbranch());
		System.out.println(c.getyop());

	}
//	Customer c1 = new Customer();
//	we can not access the directly
//	c1.cId = 101;
//	c1.cName = "teja";
//	c1.cQulification = "sr.developer";
//	System.out.println(c1.cId);
//	System.out.println(c1.cName);
//	System.out.println(c1.cQulification);
}
