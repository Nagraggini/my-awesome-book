# Java Unit Teszt

Ez az összefoglaló a Java beépített assert-jeit és a JUnit 5 tesztelési keretrendszer alapjait tartalmazza.

---

## 1. Java Native Assert (A nyelv része)
Elsősorban fejlesztés alatti belső logikai ellenőrzésre. 
*Figyelem: Alapból ki van kapcsolva, a `-ea` (enable assertions) kapcsolóval kell futtatni a JVM-et.*

| Szintaxis                     | Leírás                                          |
| :---------------------------- | :---------------------------------------------- |
| `assert feltétel;`            | Ha a feltétel `false`, `AssertionError`-t dob.  |
| `assert feltétel : "Üzenet";` | Hiba esetén az üzenet is megjelenik a konzolon. |

---

## 2. JUnit 5 Életciklus (Annotációk)
Meghatározzák a metódusok futási sorrendjét a tesztelés során.



| Annotáció         | Típus         | Leírás                                                                        |
| :---------------- | :------------ | :---------------------------------------------------------------------------- |
| **`@BeforeAll`**  | `static void` | **Egyszer** fut le az osztály összes tesztje előtt (pl. DB kapcsolat nyitás). |
| **`@BeforeEach`** | `void`        | **Minden** `@Test` előtt lefut. Setup, példányosítás, alaphelyzet.            |
| **`@Test`**       | `void`        | Maga a teszteset, itt fut le a vizsgált logika.                               |
| **`@AfterEach`**  | `void`        | **Minden** `@Test` után lefut. Cleanup, cache ürítés, loggolás.               |
| **`@AfterAll`**   | `static void` | **Egyszer** fut le a legvégén. Erőforrások (pl. DB) lezárása.                 |

---

## 3. Alap Assert-ek (JUnit 5 Assertions)
Ezekkel igazoljuk, hogy a kódunk a várt módon működik-e.

| Metódus                               | Ellenőrzés                           |
| :------------------------------------ | :----------------------------------- |
| `assertEquals(expected, actual)`      | A két érték megegyezik-e.            |
| `assertNotEquals(unexpected, actual)` | A kapott érték eltér-e a megadottól. |
| `assertTrue(condition)`               | A feltétel igaz-e.                   |
| `assertFalse(condition)`              | A feltétel hamis-e.                  |
| `assertNull(object)`                  | Az objektum `null` értékű-e.         |
| `assertNotNull(object)`               | Az objektum létezik-e (nem `null`).  |

---

## 4. Kivételkezelés tesztelése: `assertThrows`
Ellenőrzi, hogy a kódunk dob-e hiba esetén megfelelő kivételt.

```java
// A metódus visszatér a kapott kivétellel, amit tovább vizsgálhatunk
Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
    myObject.doSomething(-1);
});

// Opcionális: a hibaüzenet pontos ellenőrzése
assertEquals("Negatív szám nem megengedett!", exception.getMessage());
