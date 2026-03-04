package com.langfundamental.methods.constructors;

public class Car {
	int carid;
	String carname;
	String carbrand;
	String carcolor;
	double carprice;

	Car() {
		carid = 1;
		carname = "audi";
		carbrand = "audi";
		carcolor = "black";
		carprice = 1000000.00;
		
	}
	public static void main(String[] args) {
		Car c= new Car();
		c.show();
		Car c1 = new Car();
		c1.show();
	}
	void show() {
		System.out.println("carid : "+carid);
		System.out.println("carname : "+carname);
		System.out.println("carbrand : "+carbrand);
		System.out.println("carcolor : "+carcolor);
		System.out.println("carprice : "+carprice);
	}

}
