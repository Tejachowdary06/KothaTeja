package com.javaintro;
public class Bikes {
	int chno;
	String name;
	
	static int CountryNo;
	static String CountryName;
	
	void main() {
		System.out.println("bike showroom lanched");
		Bikes b1=new Bikes();
		CountryNo=1;
		CountryName="India";
		b1.chno=74623876;
		b1.name="ninja";
		System.out.println("CountryNo:"+CountryNo);
		System.out.println("CountryName:"+CountryName);
	}
}
