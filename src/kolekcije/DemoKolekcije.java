package kolekcije;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoKolekcije {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("pera");
		lista.add("mika");
		lista.add("laza");
		
		for(String element : lista)
			System.out.println(element);
		
		Iterator<String> iterator = lista.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
		}
		
	}

}
