package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//We Worked With add(e); and addAll(collection);
public class TestCollectionDemo1 {
	public static void main(String[] args) {

		Collection<String> uzumaki = new ArrayList<>();
		uzumaki.add("Uzumaki Clan");
		uzumaki.add("Naruto");
		uzumaki.add("Kushina");
		uzumaki.add("Boruto");
		uzumaki.add("Himawari");
		uzumaki.add("Mito");
		uzumaki.add("Nagato");
		System.out.println(uzumaki);

		Collection<String> uchiha = new ArrayList<>();
		uchiha.add("Uchiha Clan");
		uchiha.add("Itachi");
		uchiha.add("Madra");
		uchiha.add("Shisui");
		uchiha.add("Sasuke");
		uchiha.add("Izuna");
		uchiha.add("Fugaku");
		uchiha.add("Indra");
		
		System.out.println(uchiha.size());
		List<String> hiddenLeaf = new ArrayList<>();
		hiddenLeaf.addAll(uzumaki);
		hiddenLeaf.addAll(uchiha);
		System.out.println(hiddenLeaf);

//		System.out.println(uchiha);
		uchiha.clear();
		System.out.println(uchiha);

	}

}
