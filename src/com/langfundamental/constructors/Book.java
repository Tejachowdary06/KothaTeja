package com.langfundamental.constructors;

public class Book {
	String bookName;
	String authorName;
	double bookPrice;
	String releaseDate;

	Book() {
		this("mahabaratham");
		System.out.println("no arg constructor");
	}

	Book(String bookName) {
		this(bookName, "kotha");
		System.out.println("one parameter constructor");
	}

	Book(String bookName, String authorName) {
		this(bookName, "teja", 10000);
		System.out.println("two parameter constructor");
	}

	Book(String bookName, String authorName, double bookPrice) {
		this(bookName, authorName, bookPrice, "18-06-2029");
		System.out.println("three parameter constructor");
	}

	Book(String bookName, String authorName, double bookPrice, String releaseDate) {
		System.out.println("four parameter constructor");
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.releaseDate = releaseDate;
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.show();

	}

	void show() {
		System.out.println("BookName is : " + bookName);
		System.out.println("authorName is : " + authorName);
		System.out.println("bookPrice is : " + bookPrice);
		System.out.println("releaseDate is : " + releaseDate);
	}

}
