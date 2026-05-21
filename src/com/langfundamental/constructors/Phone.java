package com.langfundamental.constructors;

class Device {
	String brand;
}

class Phone extends Device{
	String simtype;
	
}

class SmartPhone extends Phone{
	int ram;
	int storage;

	SmartPhone(String brand, String simtype, int ram, int storage) {
		System.out.println("4 arg constructor");
		super.brand=brand;
		super.simtype=simtype;
		this.ram=ram;
		this.storage=storage;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		SmartPhone sm = new SmartPhone("Oneplus12R","jio",8,256);
		sm.show();

	}
	void show() {
		System.out.println("brand : "+brand);
		System.out.println("simtype : "+simtype);
		System.out.println("ram : "+ram);
		System.out.println("storage : "+storage);
	}

}
