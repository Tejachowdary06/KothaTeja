package com.javaintro;

public class EmployeeCounter {
	static void hello() {
		int t = 6639;
		int a = t / 1000;
		int b = t / 100 % 10;
		int c = t / 10 % 10;
		int d = t % 10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	static void hell() {
		int t = 6639;
		int a = t % 1000;
		int b = t % 100;
		int c = t % 10;
		int d = t % 6639;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	void he() {
		int a = 6639;
		int b = a / 2000;
		int c = a / 6000 % 500;
		int d = a / 6000 % 200;
		int e = a / 6639 % 100;
		int f = a / 6639 % 50;
		int g = a / 6639 % 20;
		int h = a / 6639 % 10;
		int i = a / 6639 % 5;
		int j = a / 6639 % 2;
		int k = a / 6639 % 1;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

	public static void main(String[] args) {
		EmployeeCounter e = new EmployeeCounter();
		hello();
		hell();
		e.he();
	}
}
