package com.example.animal_shelter.api.controllers;

//ArrayList-hez:
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.animal_shelter.api.models.Animal;
import com.example.animal_shelter.api.models.AnimalRepository;

import jakarta.servlet.http.HttpServletResponse;

// Ez a kontroller figyeli a szervert, és lehetővé teszi, hogy információkat kapjunk a felhasználókról.
@RestController
public class AnimalsController {

    // syso helyett:
    private static final Logger logger = LoggerFactory.getLogger(AnimalsController.class);

    @Autowired
    private AnimalRepository animalRepo;

    @GetMapping("/add.html")
    public String addPage() {
        return "add";
    }

    // Ez a metódus akkor fut le, ha a felhasználó HTTP GET kérést küld a
    // /users/view URL-re.
    // A @GetMapping annotáció egy endpointot definiál, amin keresztül a kliens
    // kapcsolatba léphet a szerverrel.
    // A visszatérési érték "users/showAll" a Thymeleaf template neve, amit a
    // böngészőnek küldünk.
    @GetMapping("/animals/view")
    // Model -> org.springframework.ui -> Be is kerül fentre az importokhoz.
    public String getAllAnimals(Model model) {
        // Modell: A Spring MVC-ben a Model egy olyan “csomagoló” objektum, amiben
        // adatokat küldünk a HTML template-nek (Thymeleaf, JSP, stb.).
        logger.info("Getting all animals."); // info szintű log

        // Mindegyik állat lekérése az adatbázisból.
        List<Animal> animals = animalRepo.findAll();
        // Vége az adatbázis meghívásnak.

        // A modellhez hozzáadjuk az adatokat.
        // "ani" – ez a név, amin keresztül a template-ben el tudjuk érni.
        model.addAttribute("ani", animals);

        // A "users/showAll" a Thymeleaf template neve, amit visszaad a böngészőnek
        // A templates mappában van a showAll.html, ami meg fog jelenni.
        // A return "users/showAll"; csak a template nevét adja vissza, amit a Spring
        // MVC feldolgoz és a böngészőnek renderel.
        return "animals/showAll";
        // A böngésző nem kapja közvetlenül a Model objektumot, csak a renderelt HTML-t.
    }

    // Ez a metódus a Spring Boot backend egyik endpointja, amely fogadja a HTML
    // form által küldött adatokat, majd elmenti az adatbázisba.
    @PostMapping("/animals/view") // Ez definiál egy HTTP endpointot, ami az add.html fájlban van.

    // @RequestParam Map<String, String> newuser -> Összegyűjti a form mezőket egy
    // Map-be.
    // A newanimal -> Egy kulcs-érték lista.
    // HttpServletResponse response -> Ez a HTTP válasz objektum.
    public String addAnimal(@RequestParam Map<String, String> newanimal, Model model, HttpServletResponse response) {

        logger.info("Add animal.");

        // A html-ben lévő name attribútumra hivatkozunk a jobb oldalon.
        String newName = newanimal.get("name");
        String weightStr = newanimal.get("weight");

        // Ellenőrizzük, hogy a mezők ki vannak-e töltve
        if (newName == null || newName.isBlank() || weightStr == null || weightStr.isBlank()) {
            model.addAttribute("error", "Name and weight are required!");
            return "add"; // vissza a formhoz, hibaüzenettel
        }

        int newWeight;
        try {
            newWeight = Integer.parseInt(weightStr);
        } catch (NumberFormatException e) {
            logger.error("Failed to parse weight: " + weightStr, e);
            model.addAttribute("error", "Hibás input!");
            return "add"; // vissza a formhoz, hibaüzenettel
        }

        // Ezzel mentjük az adatbázisba a sort. Kb egy INSERT INTO ...
        // Ez az ORM (Object-Relational Mapping). Az ORM (itt a Spring Data JPA) kezeli
        // az objektum → adatbázis leképezést.
        animalRepo.save(new Animal(newName, newWeight)); // Jobb oldalt az Animal osztály konstruktorát hívjuk meg.
        response.setStatus(201); // Beállítja a HTTP válasz státuszkódját 201-re, vagyis Created.

        // Ez visszaad egy HTML oldalt. A Spring megkeresi ezt: templates/animals/
        // Átirányítás a listázó oldalra.
        // Redirect POST után: Jó a (PRG – Post/Redirect/Get), így frissítésnél
        // nem ismétlődik a POST, nem lesz duplikáció!
        return "redirect:/animals/view";

    }
}