package com.javaintro.tasks;

public class Task1 {
	static int total=0;
	void show() {
		total++;
	}

	public static void main(String[] args) {
		Task1 t = new Task1();
		Task1 t1 = new Task1();
		t.show();
		t1.show();
		System.out.println(total);
	}
}
