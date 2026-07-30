package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//We Worked With Contains(object o); and ContainsAll();
public class TestListDemo1 {
	public static void main(String[] args) {

		Collection<String> uzumaki = new ArrayList<>();
		uzumaki.add("Uzumaki Clan");
		uzumaki.add("Naruto");
		uzumaki.add("Kushina");
		uzumaki.add("Boruto");
		uzumaki.add("Himawari");
		System.out.println(uzumaki);
		
		Collection<String> uchiha = new ArrayList<>();
		uzumaki.add("Uchiha Clan");
		uchiha.add("Itachi");
		uchiha.add("Madra");
		uchiha.add("Shisui");
		uchiha.add("Sasuke");
		
		List<String> hiddenLeaf = new ArrayList<>();
		hiddenLeaf.addAll(uzumaki);
		hiddenLeaf.addAll(uchiha);
		System.out.println(hiddenLeaf);
		
		System.out.println(uchiha.contains("Sasuke"));
		uchiha.clear();
		uchiha.add("indra");
		uchiha.add("izuna");
		System.out.println(uchiha.contains("Sasuke"));
		System.out.println(uchiha.contains("indra"));
		System.out.println(hiddenLeaf.containsAll(uzumaki));
		System.out.println(hiddenLeaf.containsAll(uchiha));
		System.out.println(uzumaki.containsAll(uchiha));
		System.out.println(uchiha.containsAll(uzumaki));
	}

}
