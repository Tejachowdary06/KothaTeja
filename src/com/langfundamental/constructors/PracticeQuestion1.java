package com.langfundamental.constructors;

public class PracticeQuestion1 {
	int mobilemodel;
	String mobileName;
	String mobilebrand;
	long imei;
	String networkType;

	PracticeQuestion1() {
		System.out.println("mobile phone started");
		mobilemodel = 123;
		mobileName = "oneplus12r";
		mobilebrand = "oneplus";
		imei = 7333262726L;
		networkType = "6gb data";
//		System.out.println("mobile model : " + mobilemodel);
//		System.out.println("mobile brand : " + mobilebrand);
//		System.out.println("mobile Name : " + mobileName);
//		System.out.println("mobile imei : " + imei);
//		System.out.println("mobile networkType : "+networkType); 
	}

	public static void main(String[] args) {
		PracticeQuestion1 p = new PracticeQuestion1();
		p.show();

	}

	void show() {
		System.out.println("mobile model : " + mobilemodel);
		System.out.println("mobile brand : " + mobilebrand);
		System.out.println("mobile Name : " + mobileName);
		System.out.println("mobile imei : " + imei);
		System.out.println("mobile networkType : " + networkType);
	}

}
