package com.piotrolot1.SushiRestauracja.Data;

import java.util.ArrayList;
import java.util.List;

public class Osoba {

	public String imie;
	public String nazwisko;
	public static List<Osoba> listaOsob = new ArrayList<Osoba>();
	
	public Osoba() {
		listaOsob.add(this);
	}

	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		listaOsob.add(this);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}
	
}
