package com.langfundamental.constructors;

class Vachile {
	String brand;

	Vachile(String brand) {
		this.brand = brand;

	}
}

class Car1 extends Vachile {
	String name;
	String model;
	double price;

	Car1(String name, String model, double price) {
		super("tayota");
		this.model = model;
		this.name = name;
		this.price = price;

	}

}

public class Electrical extends Car1 {
	String batteryCapacity;

	Electrical(String batteryCapacity) {
		super("innovacrysta", "tata", 200000.00);
		this.batteryCapacity = batteryCapacity;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Electrical e = new Electrical("10000MAH");
		e.show();

	}

	void show() {
		System.out.println("brand of the car:" + brand);
		System.out.println("model of the car:" + model);
		System.out.println("name of the car:" + name);
		System.out.println("price of the car:" + price);
		System.out.println("BatteryCapacity of the car:" + batteryCapacity);
	}

}
