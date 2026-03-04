package com.langfundamental;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo1 t = new TestDemo1();
		t.show();

	}
	void show() {
		int i=1;
		for (i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
