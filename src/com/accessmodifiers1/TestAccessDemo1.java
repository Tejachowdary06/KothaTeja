package com.accessmodifiers1;

//if we use private 
//Illegal modifier for the class TestAccessDemo1; only public, abstract & final are permitted
//Only public,<default>,strictfp,abstract & fianl are permitted for class
public class TestAccessDemo1 {

//	private data members
//  if we keep private to the class level data we can not access 
//	the data outside of the package and within the package also

	private int a1 = 18;
	private String name1 = "virat";

//	private TestAccessDemo1() {
//		System.out.println("constructor1 called");
//	}

//	default data member
//	default we can access within the same package and we cannot access outside of the package
	int a2 = 7;
	String name2 = "Dhoni";

	void method1() {
		System.out.println("method 1 called");
	}

//	TestAccessDemo1() {
//		System.out.println("constructor1 called");
//	}

	void method2() {
		System.out.println("method 2 called");
	}

//	protected data member
	protected int a3 = 45;
	protected String name3 = "rohit";

	protected TestAccessDemo1() {
		System.out.println("constructor1 called");
	}

//	public data member 
//	public we can use in the entire project
	
	static {
		System.out.println("static block is called");
	}
	{
		System.out.println("instance block is called");
	}

	public void method3() {
		System.out.println("method 3 called");
	}

	public int a4 = 93;
	public String name4 = "bhumra";

//	public TestAccessDemo1() {
//		System.out.println("constructor1 called");
//	}

	public void method4() {
		System.out.println("method 4 called");
	}

	public static void main(String[] args) {

		TestAccessDemo1 s1 = new TestAccessDemo1();
//		private
		System.out.println(s1.a1);
		System.out.println(s1.name1);
		s1.method1();
//		defalut
		System.out.println(s1.a2);
		System.out.println(s1.name2);
		s1.method2();
//		protected
		System.out.println(s1.a3);
		System.out.println(s1.name3);
		s1.method3();
//		public
		System.out.println(s1.a4);
		System.out.println(s1.name4);
		s1.method4();

	}

}
