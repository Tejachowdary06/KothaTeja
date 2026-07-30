package com.stringhandling;

public class TestStrDemo1 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		String s = "java";
		String s1 = "java";
		String s2 = "java";
		String s3 = "java";
		
		System.out.println("*************");
		System.out.println(s == s1);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("*************");
		
		s2="spring";
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("*************");
		
		
		System.out.println("Main method ended");

	}
}