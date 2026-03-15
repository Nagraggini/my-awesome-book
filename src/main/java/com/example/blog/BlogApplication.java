package com.example.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Itt kell rámenned a start gombra, hogy localhost-on tesztelt az weboldalt. Vagy a Spring Boot Dashboard-on a start gombra.
//Elindult az oldal, ha ezt látod a lenti terminálban: Started AnimalShelterApplication in 9.588 seconds (process running for 10.541)
//Ha nem indul el, akkor alul a terminálban keresd meg az ERROR-t.
//http://localhost:8080
@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	// ! Új branchbe csináld a dolgokat aztán teszt után jöhet a merge.

	// ! TODO: Tailwind rendes import állása (npm init -y stb tailwind.config.js stb)

}
