package com.javaintro;

public class Count {
	static int total = 0;

	void add() {
		total++;

	}

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		c1.add();
		c2.add();
		System.out.println(total);
	}
}
