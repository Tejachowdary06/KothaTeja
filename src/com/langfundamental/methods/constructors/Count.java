package com.langfundamental.methods.constructors;

public class Count {
	static int total = 0;

	Count() {
		total++;
	}

	public static void main(String[] args) {
		Count c = new Count();
		Count c1 = new Count();

		show();

	}

	static void show() {
		System.out.println("total objects : " + total);
	}
}
