package com.oops;

public class Dog implements Animal {

	public void sound() {
		System.out.println("bow bow bow ....!!");
	}

	public void eat() {
		System.out.println("Dog can eat non veg..!!");
	}

	public void sleep() {
		System.out.println("Dog can sleep at morning");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and jump");
	}

}
