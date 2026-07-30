package com.array;

public class DuplicateArrCount {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,1,2,3,12,2,3,4,5,};
		boolean[] visited = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[i]==arr[k]) {
					count++;
					visited[k] = true;
				}
			}
			System.out.println(arr[i] + " occur" + count + "times");
		}
	}
}