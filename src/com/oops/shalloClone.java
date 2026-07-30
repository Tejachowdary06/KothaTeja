package com.oops;

class Student3 implements Cloneable {
	int sid;
	String sname;
	Address adress;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	Student3(int sid, String sname, Address adress) {
		this.sid = sid;
		this.sname = sname;
		this.adress = adress;
	}
}

class Address {
	String city = "hyd";

	Address(String city) {
		this.city = city;
	}
}

public class shalloClone {

	public static void main(String[] args) throws CloneNotSupportedException  {

		System.out.println("*******ammu********");
		
		Address Add = new Address("hyderabad");
		Student3 s = new Student3(101, "teja", Add);
		
		System.out.println(s.sid);//101
		System.out.println(s.sname);//teja
		System.out.println(s.adress.city);//hyd
		System.out.println("----------------"); 
		
		Student3 s1=(Student3)s.clone();
		s1.sname="anjali";
		s1.adress.city="banglore";
		
		System.out.println(s1.sid);//101
		System.out.println(s1.sname);//anjali
		System.out.println(s1.adress.city);//bang
		System.out.println("----------------"); 
		
		System.out.println(s.sid);//101
		System.out.println(s.sname);//teja
		System.out.println(s.adress.city);//bang
		System.out.println("----------------"); 

		System.out.println("*******ammu********");
	}

}
