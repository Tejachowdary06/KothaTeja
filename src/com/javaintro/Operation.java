package com.javaintro;
public class Operation {
	static int a=685;
	public static void main(String[] args) {
		Operation t= new Operation();
		System.out.println("operation started");
		hundard();
		tens();
		t.ones();
	}
	static void hundard(){
		int c=a/100;
		System.out.println("hundard:"+c);
	}
	static void tens(){
		int d=(a/10)%10;
		System.out.println("tens:"+d);
	}
	 void ones(){
		int e=(a%10);
		System.out.println("ones:"+e);
		{
			System.out.println("hello");
		}
}
}
