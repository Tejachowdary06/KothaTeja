package com.array;

public class InsertInPerticularPlace {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		 int position=3;
		 int element=35;
		 int[] arr2=new int[arr.length+1];
		 
		 for(int i=0;i<position;i++) {
			 arr2[i]=arr[i];
		 }
		 arr2[position]=element;
		 for(int i=position;i<arr.length;i++) {
			 arr2[i+1]=arr[i];
		 }
		 for(int a:arr2) {
			 System.out.print(a+" ");
		 }
	}
}