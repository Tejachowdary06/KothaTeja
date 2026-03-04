package com.javaintro;

class Teja {
	int a = 10;
	static int b = 20;

	void show() {
		int b = 40;
		int a = 90;
		System.out.println(a);
		System.out.println(b);
	}

	static void display() {
		Teja d1 = new Teja();
		int b = 30;
		int a=80;
		System.out.println(d1.a);
		System.out.println(d1.a);
		System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Teja d = new Teja();
		d.show();
		display();
	}
}