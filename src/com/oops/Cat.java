package com.oops;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("meow meow meow ....!!");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat Rat..!!");
	}

	@Override
	public void sleep() {
		System.out.println("Cat can sleep");
	}

	@Override
	public void walk() {
		System.out.println("Cat walk like catwalk");

	}

}
