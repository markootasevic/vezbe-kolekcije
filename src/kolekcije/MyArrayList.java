package kolekcije;

import java.util.Arrays;



public class MyArrayList <T> {

	Object[] niz;
	int brojElemenata = 0;
	int rast = 2;

	public MyArrayList(){
		niz = new Object[100];
	}
	
	public void add(Object obj) {
		if(brojElemenata < niz.length) {
			niz[brojElemenata] = obj;
			brojElemenata++;
			return;
		}
		
		Object[] noviNiz = Arrays.copyOf(niz, niz.length + rast);
		niz = noviNiz;
		
		niz[brojElemenata] = obj;
	}
	
	
}
