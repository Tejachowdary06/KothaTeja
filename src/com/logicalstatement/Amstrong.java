package com.logicalstatement;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int count=0;
		int t=n;
		while(t>0) {
			 t=t/10;
			count++;
		}
		while(temp>0) {
			int rem=temp%10;
			int power=1;
		for(int i=1;i<=count;i++) {
			power=power*rem;
		}
		sum=sum+power;
		temp=temp/10;
	}
		if(sum==n) {
			System.out.println("amstrong");
		}else {
			System.out.println("not amstrong");
		}
		sc.close();

}
}