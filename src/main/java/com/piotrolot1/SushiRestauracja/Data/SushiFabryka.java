package com.piotrolot1.SushiRestauracja.Data;

import java.util.ArrayList;
import java.util.List;

public class SushiFabryka {

	private static List<Futomak> listaFutomakow = new ArrayList<Futomak>();
	
	static {
		listaFutomakow.add(new Futomak("Sake Philadelphia", 25));
		listaFutomakow.add(new Futomak("Sake Kawa", 21));
		listaFutomakow.add(new Futomak("Sake Yaki", 22));
		listaFutomakow.add(new Futomak("Sake Ebi Take", 27));
		listaFutomakow.add(new Futomak("Sake Tatar", 30));

		listaFutomakow.add(new Futomak("Maguro", 26));
		listaFutomakow.add(new Futomak("Maguro Soya", 30));
		listaFutomakow.add(new Futomak("Tei Tempura", 25));
		listaFutomakow.add(new Futomak("Maguro Tatar", 25));
		listaFutomakow.add(new Futomak("Tai Tataki", 25));

		listaFutomakow.add(new Futomak("Ebi Ten", 25));
		listaFutomakow.add(new Futomak("Sake Ebi Ten", 25));
		listaFutomakow.add(new Futomak("Ibodai", 25));
		listaFutomakow.add(new Futomak("Ibodai Yaki", 25));
	}
	
	
	
	
	
	public static List<Futomak> getListaFutomakow() {
		return listaFutomakow;
	}
}
