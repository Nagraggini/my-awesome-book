package com.example.animal_shelter.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Készítse el az osztályhierarchiát úgy, hogy általános állat nem jöhet létre, csak kutya vagy macska.
//Emiatt lesz ez absztrakt, mert ezt nem lehet példányosítani.
//abstract class volt

//A models mappában lévő java fájlokkal kezeljük a felhasználókat.(vagy objektumokat,szolgáltatásokat)
//Az annotációk megmondja, hogy van egy ilyen táblánk az adatbázisban.
@Entity
@Table(name = "animals")
public class Animal {

	// Ezek az elsődleges kulcs létrehozásához kellenek. Az animals adattáblában van
	// egy uid oszlopunk.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Lefogja generálni az értékét.
	private int uid;

	// Változók:
	private String name;
	private int weight;

	// A leszármazott osztály példányosításakor az absztrakt osztály konstruktora is
	// lefut. Jelen esetben az Allat() metódus.
	public Animal(String name, int weight) {
		// Ellenőrzött módon adjuk át az értékeket.
		setName(name);
		setWeight(weight);
	}

	public Animal() {

	}

	// Getterek/setterek
	// Minden állatról tudjuk a nevét (nem lehet üres) és a súlyát (minimum 2 kg).
	// A kutyáról tudjuk továbbá a marmagasságát (mimimum 10 cm), a macskáról pedig,
	// hogy
	// rövidszőrű vagy hosszúszőrű.
	public String getName() {
		return name;
	}

	public void setName(String name) {

		// Ellenőrzés.
		if (name != null && !name.isBlank()) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("A név kitöltése kötelező!");
		}

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {

		if (weight >= 2) {// Ellenőrzés. this.suly = suly; } else { throw new
			this.weight = weight;
		} else {
			// Nincs szükség külön változóra, ha nem használjuk később.
			// IllegalArgumentException ia= new IllegalArgumentException();
			throw new IllegalArgumentException("A súly legalább 2 kiló kell legyen.");
		}

		/*
		 * if (suly < 2) {// Az igaz ágba azt szoktuk rakni, amit szeretnénk,hogy
		 * történjen. Szóval az // első megoldás a jó! Ez konvenció, elvárás.
		 * 
		 * throw new IllegalArgumentException("A súly legalább 2 kiló kell legyen."); }
		 * // Ilyenkor nem is kell else ág.
		 */

	}

	@Override
	public String toString() {
		return name + " " + weight + " kg";
	}

	// Absztrakt osztályként előírtuk, hogy ezt a leszármazottaknak kötelező felül
	// írniuk.
	// public double napiEtelAdag();

}
