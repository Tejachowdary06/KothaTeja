package com.langfundamental;

public class Teja {
	// Instance method is positive true
	boolean ispositive(int number) {
		return number > 0;
	}

	public static void main(String[] args) {
		Teja n = new Teja();
		System.out.println(n.ispositive(32));
		System.out.println(n.ispositive(-43));
		System.out.println(n.ispositive(544));
		System.out.println(n.ispositive(-34));
	}
}