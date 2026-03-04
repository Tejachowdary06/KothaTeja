package com.javaintro;

public class Example {
   static int a=10;
	int b=20;
	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example();
		a=50;
		e1.b=60;
		System.out.println(a+""+e2.b);
	}
}