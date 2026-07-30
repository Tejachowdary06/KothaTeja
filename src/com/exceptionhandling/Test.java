package com.exceptionhandling;

public class Test {
	public static void main(String[] args) {
		System.out.println("Teja Chowdary");

		try {
//			System.out.println(10 / 0);

			String name = "Teja";
			System.out.println(name.charAt(5));

		} catch (ArithmeticException ae) {
			System.err.println("AE called");
		} catch(StringIndexOutOfBoundsException siobe) {
			System.err.println("SIOBE is called");
		} catch (NullPointerException np) {
			System.err.println("NPE is called");
		}finally {
			System.out.println("finally is called");
		}
		System.out.println("Form Khammam");
	}
}