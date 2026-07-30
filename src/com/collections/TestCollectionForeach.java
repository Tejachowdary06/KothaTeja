package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionForeach {

	public static void main(String[] args) {

		Collection<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);

//		for (int li : list) {
//		if (li == 10) {
//			list.remove(li);
//		}
//		}
//		System.out.println(list);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			if (i == 20) {
				itr.remove();
			}
		}
		System.out.println(list);
	}
}

