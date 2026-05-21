package com.langfundamental.operators;

public class TaskDemo1 {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int z=1;
		int result = x++ + ++x + ++z + ++y -++x + y++ + --z + --z + ++x +y-- + x++ + --x - ++x + ++x;
		System.out.println(result);
		
	}

}
