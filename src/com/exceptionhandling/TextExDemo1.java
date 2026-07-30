package com.exceptionhandling;

public class TextExDemo1 {

	public static void main(String[] args) {

		int[] arr= {10,20,30,40,50,60};
		int low=0;
		int high=arr.length-1;
		int target=40;
		int index=-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(target==arr[mid]) {
				index=mid;
				break;
			}else if(target<arr[mid]) {
				high=mid-1;
			}else if(target>arr[mid]) {
				low=mid+1;
			}
		}
		System.out.println(index);
		
	}

}
