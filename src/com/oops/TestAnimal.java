package com.oops;

public class TestAnimal {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Zoo Park");
		
//		Cannot instantiate the type Animal
//		we can not create object to a interface
//		Animal a = new Animal();
		
		Dog d=new Dog();
		System.out.println(" Dog info ");
		d.sound();
		d.eat();
		d.sleep();
		d.walk();
		d.dance();
		System.out.println("*******************");
		
		Animal c=new Cat();
		System.out.println(" Cat info ");
		c.sound();
		c.sleep();
		c.eat();
		c.walk();
		c.dance();
		
	}

}
