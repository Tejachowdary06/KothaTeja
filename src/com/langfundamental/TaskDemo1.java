package com.langfundamental;

import java.util.Scanner;

public class TaskDemo1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TaskDemo1 t = new TaskDemo1();
		System.out.println("enter the price=");
		double price = sc.nextDouble();
		System.out.println("enter the quantity=");
		double quantity = sc.nextDouble();
		double price1 = t.calculate(price, quantity);
		double gst1 = t.gst(price1);
		double delcg = t.delchgs(gst1);
		t.totalprice(delcg);

		sc.close();
	}

	double calculate(double price, double quantity) {
		double itemtotal = price * quantity;
		return itemtotal;
	}

	double gst(double itemtotal) {
		double GST = itemtotal + (itemtotal * 5) / 100;
		return GST;
	}

	double delchgs(double GST) {
		double DCGS = GST + 50;
		return DCGS;
	}

	void totalprice(double finalAmount) {
		System.out.println("total price=" + finalAmount);
	}

}
