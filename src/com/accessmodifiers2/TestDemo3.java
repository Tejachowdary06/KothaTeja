package com.accessmodifiers2;

import com.accessmodifiers1.TestAccessDemo1;

public class TestDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {
		
		TestDemo3 s2=new TestDemo3();
		
//		private
//		TestAccessDemo1 s1 = new TestAccessDemo1();
//		System.out.println(s2.a1);
//		System.out.println(s2.name1);
//		s2.method1();
//		
		
//		default we cannot access within the package and outside of the package
//		TestAccessDemo1 s1 = new TestAccessDemo1();
//		System.out.println(s1.a2);
//		System.out.println(s1.name2);
//		s1.method2();
		 
//		protected
//		we can access with the help of child class object reference 
		System.out.println(s2.a3);
		System.out.println(s2.name3);
		s2.method3();
		
//		public class data member 
//		we can access anywhere in the entire project
		System.out.println(s2.a4);
		System.out.println(s2.name4);
		s2.method4();
		
		
		

		
	}

}
