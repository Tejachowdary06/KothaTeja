package com.langfundamental;
public class Operations {
	byte b=10;
	byte b1=20;
	short s=20;
	short s1=30;
	int i=30;
	int i1=40;
	void add() {
		System.out.println("addition:"+(b+b1));
		System.out.println("addition:"+(s+s1));
		System.out.println("addition:"+(i+i1));
	}
	void sub() {
		System.out.println("subtraction:"+(b-b1));
		System.out.println("subtraction:"+(s-s1));
		System.out.println("subtraction:"+(i-i1));
	}
	void mul() {
		System.out.println("multiplication:"+(b*b1));
		System.out.println("multiplication:"+(s*s1));
		System.out.println("multiplication:"+(i*i1));
	}
	void div() {
		System.out.println("division:"+(b/b1));
		System.out.println("division:"+(s/s1));
		System.out.println("division:"+(i/i1));
	}
	 void main(String[] args) {
	System.out.println("operations are ready to start");
	add();
	sub();
	mul();
	div();
	}
}
