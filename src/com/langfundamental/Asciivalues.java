package com.langfundamental;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Asciivalues {
	BigInteger b1 = new BigInteger("125125125");
	BigInteger b2 = new BigInteger("125125125");
	BigDecimal bd1 = new BigDecimal("123.2");
	BigDecimal bd2 = new BigDecimal("123.2");
	Integer i1=189;
	Integer i2=637;
	Float f=15.5f;
	Long l=1256644411l;
	Short s=25422;
	void main() {
		System.out.println("main method started !");
		Asciivalues t3 = new Asciivalues();
		System.out.println(t3.i1);
		System.out.println(t3.b1);
		System.out.println(t3.bd1);
		System.out.println(t3.f);
		System.out.println(t3.l);
		System.out.println(t3.s);
		System.out.println(t3.b1.add(t3.b2));
		System.out.println(t3.b1.subtract(t3.b2));
		System.out.println(t3.b1.multiply(t3.b2));
		System.out.println(t3.b1.divide(t3.b2));
		System.out.println("end of the day");
		System.out.println(t3.bd1.add(t3.bd2));
		System.out.println(t3.bd1.subtract(t3.bd2));
		System.out.println(t3.bd1.multiply(t3.bd2));
		System.out.println(t3.bd1.divide(t3.bd2));
	}
}
