package com.example.animal_shelter.api.models;

public final class Dog extends Animal {

	private int marmagassag;

	public Dog(String nev, int suly, int marmagassag) {
		super(nev, suly);
		// Ellenőrzött módon adjuk át az értéket.
		setMarmagassag(marmagassag);
	}
	/*
	 * @Override
	 * public double napiEtelAdag() {
	 * 
	 * return getSuly() / 50.0; // Így double lesz a visszatérési érték.
	 * }
	 */

	public int getMarmagassag() {
		return marmagassag;
	}

	public void setMarmagassag(int marmagassag) {

		if (marmagassag >= 10) {

			this.marmagassag = marmagassag;

		} else {

			throw new IllegalArgumentException("A marmagasság minimum 10 cm kell legyen!");
		}

	}

	public String toString() {
		return super.toString() + " marmagasság: " + marmagassag;

	}

}
