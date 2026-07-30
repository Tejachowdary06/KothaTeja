package com.array;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr = { 99, 100, 43, 53, 34, 89, 33 };
		int large = arr[0];
		int seclarge=arr[1];
		
		for (int i = 1; i < arr.length - 1; i++) {
				
			if(arr[i]>large) {
				seclarge=large;
				large=arr[i];
			}else if(arr[i]>seclarge && arr[i]!=large){
				seclarge=arr[i];
			}
			
		}
		System.out.println("Second Large : "+seclarge);	
	}

}
