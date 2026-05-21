package com.langfundamental.constructors;

public class Movie {
	String hero;
	String heroine;
	String director;
	double budget;
	String producer;
	String movieName;

	Movie() {
		System.out.println("no-arg constructor");
	}

	Movie(String producer, String director) {
		System.out.println("parameterized-1 constructor called");
		this.producer = producer;
		this.director = director;
	}

	Movie(Movie m, String hero, double budget) {
		System.out.println("parameterized-2 constructor called");
		this.hero = hero;
		this.budget = budget;
		this.producer = m.producer;
		this.director = m.director;
	}

	Movie(Movie m, String heroine, String movieName) {
		System.out.println("parameterized-3 constructor called");
		this.budget = m.budget;
		this.director = m.director;
		this.hero = m.hero;
		this.producer = m.producer;
		this.heroine = heroine;
		this.movieName = movieName;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Movie m = new Movie();
		m.showDetials();
		Movie m1 = new Movie("D.V.V", "rajamouli");
		m1.showDetials();
		Movie m2 = new Movie(m1, "mahesh babu", 50000000000.00);
		m2.showDetials();
		Movie m3 = new Movie(m2,"priyanka chopra", "VARNASI");
		m3.showDetials();
	}

	void showDetials() {
		System.out.println("name of the hero:" + hero);
		System.out.println("name of the heroine:" + heroine);
		System.out.println("name of the director:" + director);
		System.out.println("name of the producer:" + producer);
		System.out.println("name of the movie:" + movieName);
		System.out.println("budget of the movie:" + budget);
	}

}
