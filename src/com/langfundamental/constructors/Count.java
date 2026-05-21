package com.langfundamental.constructors;

public class Count {
	static int total = 0;

	Count() {
		total++;
	}

	public static void main(String[] args) {
		Count c = new Count();
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

		show();
	}

	static  void show() {
		System.out.println("total objects : " + total);
	}
}