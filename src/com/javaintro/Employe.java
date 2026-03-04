package com.javaintro;

public class Employe {
	static int AccountNo=100;
	String Name;
	double Balance;
	static void Count() {
		AccountNo++;
		System.out.println("AccountNo:"+AccountNo);
	}
	 void main(String[] args) {
		Employe e1=new Employe();
		e1.Name="teja";
		e1.Balance=3500.45;
		Count();
		System.out.println(e1.Name+"balance "+e1.Balance+"acno: "+AccountNo);
	//	System.out.println("Balance:"+e1.Balance);
		Employe e2=new Employe();
		e2.Name="anjali";
		e2.Balance=3000.45;
		Count();
		System.out.println("Name:"+e2.Name);
		System.out.println("Balance:"+e2.Balance);
		Employe e3=new Employe();
		e3.Name="vinay";
		e3.Balance=400.79;
		Count();
		System.out.println("Name:"+e3.Name);
		System.out.println("Balance:"+e3.Balance);
		Employe e4=new Employe();
		e4.Name="visnay";
		e4.Balance=500.58;
		Count();
		System.out.println("Name:"+e4.Name);
		System.out.println("Balance:"+e4.Balance);
	}
}
