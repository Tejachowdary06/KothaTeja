package com.langfundamental;

public class Multiplication {
	//Instance method to print 1x1=1 table
	void tej(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(number+"x"+i+"="+(number*i));
		}
	}
	public static void main(String[] args) {
		Multiplication m=new Multiplication();
		m.tej(7);
	}
}