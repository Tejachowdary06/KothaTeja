package com.langfundamental.constructors;
import java.util.Scanner;

public class Triangle {
	static Scanner sc = new Scanner(System.in);
	double length;
	double bredth;
	double areaoftriangle;
	
	Triangle() {
		System.out.println("enter the length : ");
		length=sc.nextDouble();
		System.out.println("enter the bredth : ");
		bredth=sc.nextDouble();
		
		sc.close();
	}

	public static void main(String[] args) {
		Triangle b = new Triangle();
		b.show();
	}
	void show() {
		 double areaoftriangle=length*bredth;
		System.out.println("area of tringle : "+areaoftriangle);
	}

}
