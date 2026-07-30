package com.oops;

public interface Animal {
	
	public abstract void walk();
	
	public abstract void sound();
	
	public abstract void eat();
	
	public abstract void sleep();

	default void dance() {
		System.out.println("they can dance like a human ");
	}
	
	
}
