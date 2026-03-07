package com.example.animal_shelter.api.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//Automatikusan létrehoz neked egy komplett adatbázis-kezelő réteget a User entitáshoz — anélkül, hogy SQL-t kellene írni.
//JpaRepository<EntitásTípus, PrimaryKeyTípus>
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    // Listákba lementjük az adatokat az adatbázisból.
    // A változók az Animal.java fájlból vannak. A findBy részre figyelj, nagy
    // betűvel
    // kezd az utána lévő részt.

    List<Animal> findByNameAndWeight(String name, int weight);
}
