package com.example.animal_shelter.api.models;

public final class Cat extends Animal {

	private boolean hosszuszoru; // Ha hamis, akkor rövidszőrű.

	public Cat(String nev, int suly, boolean hosszuszoru) {
		super(nev, suly);
		this.hosszuszoru = hosszuszoru;
	}

	// Ez a getter, "is" lett, mert logikai típusú az adattag. Hosszúszőrű-e?
	public boolean isHosszuszoru() {
		return hosszuszoru;
	}

	/*
	 * @Override
	 * public double napiEtelAdag() {
	 * 
	 * return getSuly() / 70.0; // Így double lesz a visszatérési érték.
	 * }
	 */
	public String toString() {
		// A sima super a konstruktor hívná.
		return super.toString() + " " + (hosszuszoru ? "hosszúszőrű" : "rövidszőrű");

	}
}
