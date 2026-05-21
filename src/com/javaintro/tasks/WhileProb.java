package com.javaintro.tasks;

public class WhileProb {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started");
		
		int i=1;
		while(10>i) {
			i++;
			System.out.println("hello");
			Thread.sleep(30);
		
		}
		System.out.println("main method ended");

	}

}
