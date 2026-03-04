package com.langfundamental;

public class TestDemo2 {

	 void hell(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number+"x"+i+"="+(number*i));
		}
	}

	public static void main(String[] args) {
		TestDemo2 t1 = new TestDemo2();
		t1.hell(7);

	}

}
