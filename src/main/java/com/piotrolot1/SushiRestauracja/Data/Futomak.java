package com.piotrolot1.SushiRestauracja.Data;

public class Futomak {
	
	private static int idx= 1;
	private String name;
	private String link;
	private int cena;
	
	public Futomak(String name, int cena) {
		this.name = name;
		this.link = "futomaki" + idx++ + ".png";
		this.cena = cena;
	}

	public static int getIdx() {
		return idx;
	}

	public String getName() {
		return name;
	}

	public String getLink() {
		return link;
	}

	public int getCena() {
		return cena;
	}

	public String getInfo() {
		return getName() + " " + getCena();
	}
	
	
	@Override
	public String toString() {
		return "Futomak [name=" + name + ", link=" + link + ", cena=" + cena + "]";
	}
	
}
