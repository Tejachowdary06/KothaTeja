package com.langfundamental.constructors;

//varanasi
public class Movie2 {
	String mname;
	String hero;
	String heroine;
	String director;
	String producer;
	double budget;

	Movie2() {
		this("Varasi","Mahesh Babu");
		System.out.println("no arg");

	}

	Movie2(String mname, String hero) {
		this(mname,hero,"Prinka Chopra");
		System.out.println("One arg");
	}

	Movie2(String mname, String hero, String heroine) {
		this(mname,hero,heroine,"Raja mouli");
		System.out.println("Two arg");
	}

	Movie2(String mname, String hero, String heroine, String director) {
		this(mname,hero,heroine,director,"Chowdary",7675678876667.00);
		System.out.println("Three arg");
	}

	Movie2(String mname, String hero, String heroine, String director, String producer, double budget) {
		this.mname = mname;
		this.hero = hero;
		this.heroine = heroine;
		this.director = director;
		this.producer = producer;
		this.budget = budget;
		System.out.println("Five arg");
	}

	public static void main(String[] args) {

		Movie2 v = new Movie2();
		v.show();
		Movie2 v1 = new Movie2("Varanasi", "Mahesh babu");
		v1.show();
		Movie2 v2 = new Movie2("Varanasi", "Mahesh babu", "Prinka Chopra");
		v2.show();
		Movie2 v3 = new Movie2("Varanasi", "Mahesh babu", "Prinka Chopra", "SS Raja Mouli");
		v3.show();
		Movie2 v4 = new Movie2("Varanasi", "Mahesh babu", "Prinka Chopra", "SS Raja Mouli", "Teja Chowdary",
				8765000000.00);
		v4.show();

	}

	void show() {
		System.out.println(mname);
		System.out.println(hero);
		System.out.println(heroine);
		System.out.println(director);
		System.out.println(producer);
		System.out.println(budget);
		System.out.println("***********");
	}

}
