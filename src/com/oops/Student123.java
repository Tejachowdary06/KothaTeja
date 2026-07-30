package com.oops;

class Student1 implements Cloneable {
	int id;
	String name;
	Address12 address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	Student1(int id, String name, Address12 address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

}

class Address12 {
	String city = "hyd";

	Address12(String city) {
		this.city = city;
	}
}

public class Student123 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address12 add = new Address12("Hyd");
		Student1 oc = new Student1(101, "teja", add);
		

		System.out.println("******obj-1*******");
		System.out.println(oc.id);
		System.out.println(oc.name);
		System.out.println(oc.address.city);

		System.out.println("****************");
		
		Student1 oo = (Student1) oc.clone();
		System.out.println("******obj-2*******");
		System.out.println(oo.id);
		System.out.println(oo.name);
		System.out.println(oo.address.city);

		System.out.println("****************");
		
		oo.id=102;
		oo.name="anjali";
		oo.address.city="bang";
		System.out.println("******obj-3*******");
		System.out.println(oo.id);
		System.out.println(oo.name);
		System.out.println(oo.address.city);
		System.out.println("*******obj-4******");
		System.out.println(oc.id);
		System.out.println(oc.name);
		System.out.println(oc.address.city);
		
		
		
		

	}

}
