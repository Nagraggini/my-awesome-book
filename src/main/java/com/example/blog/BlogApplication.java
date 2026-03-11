package com.example.animal_shelter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Itt kell rámenned a start gombra, hogy localhost-on tesztelt az weboldalt. Vagy a Spring Boot Dashboard-on a start gombra.
//Elindult az oldal, ha ezt látod a lenti terminálban: Started AnimalShelterApplication in 9.588 seconds (process running for 10.541)
//Ha nem indul el, akkor alul a terminálban keresd meg az ERROR-t.
//http://localhost:8080
@SpringBootApplication
public class AnimalShelterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalShelterApplication.class, args);
	}
	// ! Új branchbe csináld a dolgokat aztán teszt után jöhet a merge.

	// ^ Java Programozás Kezdőknek, ezek spring boot-ról szólank!!!!!!
	// https://www.youtube.com/watch?v=8qMi3e_fzKc&list=PL92V_WHHt2CnXaUIA9T2ww7peDK4lqmZj&index=23

	// ? Ha többször nyomok rá a send-re akkor többször is létrehozza az állatot.
	/*
	 * TODO: Nézd meg a másik kettő videót:
	 * https://www.youtube.com/watch?v=RK6aAjUMcl0&list=PLg7lel5LdVjyO7jk-
	 * 4biyr0fqPVygTLOk
	 * 
	 * ! A webes nézetben állítsd be a poco-meretet és úgy csekkold a weboldalt.
	 */

	// ! Tailwind rendes import állása (npm init -y stb tailwind.config.js stb)

	// & TODO: Legyen egy beléptető felület a dolgozóknak, ahol admin admin a jelszó
	// & -> Itt kezdted el: SpringBoot-LoginAndRegistration
	// youtube.com/watch?v=X7pGCmVxx10&pp=ygUkSG93IHRvIGNyZWF0ZSBhIGxvZ2luIGluIHNwcmluZyBib290

	// & Spring MVC Beginner Project
	// https://www.youtube.com/watch?v=VqptK6_icjk&list=PL82C6-O4XrHejlASdecIsroNEbZFYo_X1
	/*
	 * 
	 * TODO: Örökbe fogadás és törlés az adatbázisból. Legyen egy külön tábla az
	 * örökbe fogadott állatoknak.
	 * Legyen egy külön tábla a mennyországba távozott állatoknak
	 * Örökbeadás funkció gomb és hozzá az ORM.
	 */

	/*
	 * Red (!)
	 * Blue (?)
	 * Green (*)
	 * Yellow (^)
	 * Pink (&)
	 * Purple (~)
	 * Mustard (todo)
	 * Grey (//)
	 */
}
