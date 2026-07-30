package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionEmpty2 {

	public static void main(String[] args) {

		Collection<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list.hashCode());
		
		if(!list.isEmpty()) {
			System.out.println("the list is not empty");
		}else {
			System.out.println("the list is empty");
		}
		System.out.println(list.remove(30));
	}

}
