package com.accessmodifiers1;

public class TestDemo2 {

	public static void main(String[] args) {
		
//		default data member
		TestAccessDemo1 s1 = new TestAccessDemo1();
		System.out.println(s1.a2);
		System.out.println(s1.name2);
		s1.method2();
		
//		protected
		System.out.println(s1.a3);
		System.out.println(s1.name3);
		s1.method3();
		

//		public class data member
//		we can access anywhere in the entire project
		System.out.println(s1.a4);
		System.out.println(s1.name4);
		s1.method4();
	}

}
