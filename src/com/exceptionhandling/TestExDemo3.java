package com.exceptionhandling;

public class TestExDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Java World");
		
		try{
			int a=10;
			int b=0;
			int result=a/b;
			System.out.println("result : "+result);
		}catch(NullPointerException NPE) {
			System.out.println("NullPointerException");
//		}catch(Exception EX) {
//			System.out.println("NullPointerException");
		}catch(ArithmeticException AE) {
			System.out.println("NullPointerException");
		}catch(ArrayIndexOutOfBoundsException NPE) {
			System.out.println("NullPointerException");
		}catch(StringIndexOutOfBoundsException NPE) {
			System.out.println("NullPointerException");
		}
	}

}
