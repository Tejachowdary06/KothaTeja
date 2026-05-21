package com.langfundamental.constructors;

public class Movie1 {
	String hero;
	String heroine;
	String director;
	double budget;
	String producer;
	String movieName;

	Movie1() {
		System.out.println("no-arg constructor");
	}

	Movie1(String producer, String director) {
		this();
		System.out.println("parameterized-1 constructor called");
		this.producer = producer;
		this.director = director;
	}

	Movie1(Movie1 m, String hero, double budget) {
		this(m.producer,m.director);
		System.out.println("parameterized-2 constructor called");
		this.hero = hero;
		this.budget = budget;
	}

	Movie1(Movie1 m, String heroine, String movieName) {
		this(m,m.hero,m.budget);
		System.out.println("parameterized-3 constructor called");
		this.heroine = heroine;
		this.movieName = movieName;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie1 m = new Movie1();
		m.showDetials();
		Movie1 m1 = new Movie1("D.V.V", "rajamouli");
		m1.showDetials();
		Movie1 m2 = new Movie1(m1, "mahesh babu", 50000000000.00);
		m2.showDetials();
		Movie1 m3 = new Movie1(m2,"priyanka chopra", "VARNASI");
		m3.showDetials();
	}

	void showDetials() {
		System.out.println("************************************");
		System.out.println("name of the hero:" + hero);
		System.out.println("name of the heroine:" + heroine);
		System.out.println("name of the director:" + director);
		System.out.println("name of the producer:" + producer);
		System.out.println("name of the movie:" + movieName);
		System.out.println("budget of the movie:" + budget);
		System.out.println("************************************");
	}

}
