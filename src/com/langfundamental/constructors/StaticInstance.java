package com.langfundamental.constructors;

public class StaticInstance {
	static int a;
	int b;
	{
		b = 30;
	}
	static {
		a = 35;
	}

	StaticInstance() {
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {
		StaticInstance s = new StaticInstance();
	}
}
