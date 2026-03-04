package com.langfundamental.methods.constructors;
import java.util.Scanner;

public class Book {
	static Scanner sc = new Scanner(System.in);
	double length;
	double bredth;
	double areaoftriangle;
	
	Book() {
		System.out.println("enter the length : ");
		length=sc.nextDouble();
		System.out.println("enter the bredth : ");
		bredth=sc.nextDouble();
		
		sc.close();
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.show();
	}
	void show() {
		 double areaoftriangle=length*bredth;
		System.out.println("area of tringle : "+areaoftriangle);
	}

}
