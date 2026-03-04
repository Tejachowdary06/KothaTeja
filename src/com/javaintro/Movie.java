package com.javaintro;
public class Movie {
	static int count=0;
	void show(){
		System.out.println("instance method called");
		count++;
	}
	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.show();
		Movie m2=new Movie();
		m2.show();
		Movie m3=new Movie();
		m3.show();
		Movie m4=new Movie();
		m4.show();
		Movie m5=new Movie();
		m5.show();
		Movie m6=new Movie();
		m6.show();
		Movie m7=new Movie();
		m7.show();
		Movie m8=new Movie();
		m8.show();
		System.out.println(count);
	}
}