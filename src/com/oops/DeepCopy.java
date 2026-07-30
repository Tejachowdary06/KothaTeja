package com.oops;

class Teja{
	int id;
	String name;
	Address1 add;
	public Teja(int id, String name, Address1 add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public Teja(Teja Teja) {
		this.id=Teja.id;
		this.name=Teja.name;
		this.add=new Address1(Teja.add);
	}
	
	
}

class Address1{
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1(Address1 add) {

	}
	
}

public class DeepCopy {

	public static void main(String[] args) {
		
		Address1 add=new Address1("hyd");
		Teja t=new Teja(101,"teja",add);
		
		System.out.println("---------------");
		System.out.println(t.id);//101
		System.out.println(t.name);//teja
		System.out.println(t.add.city);//hyd
		System.out.println("---------------");
		
		Teja t1=new Teja(t);
		System.out.println("---------------");
		System.out.println(t1.id);//101
		System.out.println(t1.name);//teja
		System.out.println(t1.add.city);//hyd
		System.out.println("---------------");
		
		t1.add.city="banglore";
		System.out.println("---------------");
		System.out.println(t.add.city);//hyd
		System.out.println(t1.add.city);//bang
		System.out.println("---------------");
		
		
	}

}
