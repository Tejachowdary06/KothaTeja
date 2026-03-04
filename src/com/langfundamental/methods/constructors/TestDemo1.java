package com.langfundamental.methods.constructors;

public class TestDemo1 {
	int jsno;
	String name;

	static int couid=1;
	static String counam="india";

	TestDemo1() {
		System.out.println("no arg constructor");
	}

	public static void main(String[] args) {
		TestDemo1 t = new TestDemo1();
		t.jsno = 18;
		t.name = "virat";
		//couid = 1;
		//counam = "india";
		System.out.println("jsno:" + t.jsno);
		System.out.println("playername:" + t.name);
		System.out.println("couid:" + couid);
		System.out.println("counname:" + counam);
		
		TestDemo1 t1 = new TestDemo1();
		t1.jsno=7;
		t1.name="dhoni";
		//couid = 1;
		//counam = "india";
		System.out.println("jsno:" + t1.jsno);
		System.out.println("playername:" + t1.name);
		System.out.println("couid:" + couid);
		System.out.println("counname:" + counam);
	}

}
