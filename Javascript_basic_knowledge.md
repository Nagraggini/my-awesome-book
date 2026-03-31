# Tartalomjegyzék

- [Tartalomjegyzék](#tartalomjegyzék)
- [Források](#források)
- [Strict mód](#strict-mód)
- [Alert](#alert)
- [Prompt](#prompt)
- [Explicit és implicit](#explicit-és-implicit)
- [Adattípusok(primitívek)](#adattípusokprimitívek)
  - [let vs var vs const](#let-vs-var-vs-const)
- [VS Code debug](#vs-code-debug)
- [If - elágazások](#if---elágazások)
- [Switch szerkezet](#switch-szerkezet)
- [JavaScript operátorok – összefoglaló cheat sheet](#javascript-operátorok--összefoglaló-cheat-sheet)
  - [Tömb műveletek](#tömb-műveletek)
    - [sort](#sort)
  - [pop/push/shift](#poppushshift)
- [Primitívek, referenciák, objektumok](#primitívek-referenciák-objektumok)
  - [Objektumok](#objektumok)
- [Ciklusok (Loop)](#ciklusok-loop)
  - [While](#while)
  - [Egy soros ciklus](#egy-soros-ciklus)
  - [Do-while](#do-while)
  - [For ciklus](#for-ciklus)
- [Feladatok](#feladatok)
- [Memória túlcsordulás HD (StackOverflow)](#memória-túlcsordulás-hd-stackoverflow)
- [Inkrementálás](#inkrementálás)
- [Metódusok](#metódusok)
- [Math.](#math)
- [OOP](#oop)
- [Időzítő beállítása](#időzítő-beállítása)
- [Html és js összekötése](#html-és-js-összekötése)
- [Összefoglaló](#összefoglaló)
- [Hibák](#hibák)
  - [Leggyakoribb hibatípusok](#leggyakoribb-hibatípusok)
  - [Hibakezelés (Error Handling)](#hibakezelés-error-handling)
- [Modern JS és lambda (arrow function) verzió](#modern-js-és-lambda-arrow-function-verzió)
- [Cheat Sheet](#cheat-sheet)
- [DOM manipuláció](#dom-manipuláció)
  - [DOM kiválasztó metódusok](#dom-kiválasztó-metódusok)
- [style](#style)
- [querySelectorAll](#queryselectorall)
- [innerHTML vs textContent vs innerText](#innerhtml-vs-textcontent-vs-innertext)
  - [Mikor melyiket használd?](#mikor-melyiket-használd)
  - [Példák](#példák)
- [HTML DOM API Képességek és Alapok](#html-dom-api-képességek-és-alapok)
  - [Mit tehetünk a DOM API-val?](#mit-tehetünk-a-dom-api-val)
  - [A JavaScript a közvetítő nyelv](#a-javascript-a-közvetítő-nyelv)
  - [API Metódusok és Tulajdonságok](#api-metódusok-és-tulajdonságok)
    - [Globális objektumok](#globális-objektumok)
    - [A Document objektum](#a-document-objektum)
    - [Kiválasztás (Selection)](#kiválasztás-selection)
  - [Gyakori kiválasztási módszerek:](#gyakori-kiválasztási-módszerek)
- [JavaScript DOM Manipuláció Puska](#javascript-dom-manipuláció-puska)
  - [4. Eseménykezelők](#4-eseménykezelők)
    - [Alapszintű (HTML-központú):](#alapszintű-html-központú)
- [localStorage](#localstorage)
- [Haladóbb (toggle)](#haladóbb-toggle)

# Források

https://sanfranciscoboljottem.com            
https://www.youtube.com/playlist?list=PLyriihBWoulwgaKMNF6M20iD0c6iDtu0S        
https://www.youtube.com/watch?v=BUFagBZZafo&list=PLg7lel5LdVjyO7jk-4biyr0fqPVygTLOk&index=5      
https://www.codedex.io/home
https://www.freecodecamp.org/learn/javascript-v9/lecture-working-with-the-dom-click-events-and-web-apis/how-do-you-create-new-nodes-using-innerhtml-and-createelement
https://www.udemy.com/course/the-complete-javascript-course/

# Strict mód

```javascript
"use strict";
```

/*
Strict mode segít:

hibákat korábban észrevenni
tisztább, biztonságosabb kódot írni
elkerülni rejtett bugokat
*/
# Alert
```javascript
    alert("Itt írtam a kódot: https://jsfiddle.net/");
    //clg -> console log hotkey
```

# Prompt

```javascript
//A prompt a felugró ablak. A "name" egy címke, a "Bobby" egy input mező.

    var name = window.prompt("What's your name?", "Bobby");
    window.alert("Hello " + name + "!");

    console.log("hello " + n)
```

# Explicit és implicit

Kötőjelet nem lehet írni a js-ben a változó nevébe.

Explicit érték adás.
Ez explicit, mert az értékadás külön történik a deklarációtól.

```javascript
    var a;
    a = 1;
```

Implicit érték adás.
Ez implicit, mert az értékadás „bele van foglalva” a deklarációba.

```javascript
    var b = 2;
    //alert(a + b);
```

# Adattípusok(primitívek)

```javascript
    var c = 3; //number
    var d = 3.5; //float

    var a = "Hello"; // dupla idézőjel
    var b = "Hello"; // szimpla idézőjel
```

A backtick (`) speciális, mert enged változóbeillesztést és többsoros szöveget

```javascript
    let name = "Andrea";
    var c = `Hello`; // backtick (templateliterál)
    const a =2;

    let message = `Hello, ${name}!`; // → "Hello, Andrea!"
    var g = true; //boolean
    var i = null; //null
    var j; //undefined

```

## let vs var vs const

A “var” simán újra definiálható, ezért inkább **nem használják**.
A “let” nem definiálható újra, ugyanabban a hatókörben.
A "const"-nak csak egyszer lehet értéket adni, olyanmint a javaban a final típusú változó.

```javascript
    //for ciklus:
    for (var j=0; j<10; j++){
       console.log(j);
    }

    for (let i=0; i<10; i++){
       console.log(i);
    }
    console.log(i);//Hibaüzenetet kapunk, mert a let-el deklarált változó, csak a scope-n belül létezik.
```
# VS Code debug

[Itt](https://nagraggini-blog.onrender.com/#vscode_install) találod az útmutatót a telepítéshez.

Futtatáskor a Chromeban F12-t nyomj a devtool eléréséhez és a console részre te is tudsz írni, pl új változót is deklarálhatsz.

# If - elágazások

```javascript
    var ageOfGyula = 17;

    //== összehasonlító operátor
    // felkiáltójel= nem egyenlő operátor

    if (ageOfGyula == 17) {
            //alert("Majdnem nagykorú.");
        } else if (ageOfGyula < 18) {
            //alert("Gyula még kiskorú.");
        } else {
            //alert("Gyula már nagykorú.");
    }
```

```javascript
const a=1;
a=2; //Error, csak egyszer lehet értéket adni a const változónak.
```

# Switch szerkezet

```javascript
    var r = "Rudi4";

    switch (r) {
        case "Rudi":
        //alert("Rudi egy kutya.");
        break;

        case "Mici":
        // alert("Mici egy macska.");
        break;

        default:
        //alert("Nem kutya, sem macska.");
    }
```

**==** (egyenlőség, laza összehasonlítás)
Automatikus típusátalakítást végez.
Ha a két érték nem ugyanaz a típus, JavaScript megpróbáljaátkonvertálni őket, hogy össze tudja hasonlítani.
Ezért néha váratlan eredményt ad.

**===** (szigorú egyenlőség)
Nem végez típusátalakítást.
Csak akkor ad true-t, ha érték és adattípus is megegyezik.

```javascript
    switch (ageOfGyula) {

        case ageOfGyula === 17:
            // alert("Majdnem nagykorú.");
            break;

        case ageOfGyula > 18:
            //alert("Gyula már nagykorú.");
            break;

        default:
            //alert("Gyula még kiskorú.");
    }
```javasript

# Tömbök

```javascript
    var fruits = ["grape", "apple", "banana"];

    alert(fruits[0]); //első elem kiíratása

    var a = [];
    a.push(1, 2, 3, 4, 5); //hozzáadjuk az elemeket.
    console.log(a); //Kiírja az elemeit. output: (5) [1, 2, 3, 4, 5]
```

# JavaScript operátorok – összefoglaló cheat sheet

```bash
========================
ARITMETIKAI OPERÁTOROK
========================
+     # összeadás
-     # kivonás
*     # szorzás
/     # osztás
%     # maradék (modulus)
**    # hatványozás

========================
ÖSSZEHASONLÍTÓ OPERÁTOROK
========================
==    # egyenlő (típus konverzióval)
===   # szigorúan egyenlő (érték + típus)
!=    # nem egyenlő (típus konverzióval)
!==   # szigorúan nem egyenlő

>     # nagyobb
<     # kisebb
>=    # nagyobb vagy egyenlő
<=    # kisebb vagy egyenlő

========================
 LOGIKAI OPERÁTOROK
========================
&&    # ÉS (AND)
||    # VAGY (OR)
!     # NEM (NOT)

========================
ÉRTÉKADÓ OPERÁTOROK
========================
=     # értékadás
+=    # hozzáadás és értékadás
-=    # kivonás és értékadás
*=    # szorzás és értékadás
/=    # osztás és értékadás
%=    # maradék és értékadás
**=   # hatványozás és értékadás

========================
INKREMENT / DEKREMENT
========================
++    # növelés 1-gyel
--    # csökkentés 1-gyel

========================
TÍPUS OPERÁTOROK
========================
typeof        # típust ad vissza
instanceof    # objektum típust ellenőriz

========================
HÁRMAS (TERNARY) OPERÁTOR
========================
feltétel ? érték1 : érték2

Példa:
let x = 10;
let result = x > 5 ? "nagy" : "kicsi";

========================
NULLISH COALESCING
========================
??   # ha null vagy undefined → másik érték

Példa:
let a = null ?? "default"; // "default"

========================
OPTIONAL CHAINING
========================
?.   # biztonságos hozzáférés

Példa:
user?.name   # nem dob hibát, ha user nincs

========================
BITWISE OPERÁTOROK
========================
&    # AND
|    # OR
^    # XOR
~    # NOT
<<   # balra shift
>>   # jobbra shift
>>>  # jobbra shift (unsigned)

========================
STRING OPERÁTOR
========================
+    # string összefűzés

Példa:
"Hello" + " World"
```

## Tömb műveletek

### sort

```javascript
    var fruits = ["grape", "apple", "banana"];
    fruits.sort(); //rendezés
```

A JavaScript sort() alapértelmezetten nem számként, hanem szövegként (stringként) rendez.

```javascript
    var a=[1, 2, 3, 4, 5,55,9,63,22];
    a.sort(); //output: (9) [1, 2, 22, 3, 4, 5, 55, 63, 9]
    a.sort((x, y) => x - y);  //output: (9) [1, 2, 3, 4, 5, 9, 22, 55, 63]
```

Vagy:
```javascript
    var a=[1, 2, 3, 4, 5,55,9,63,22];

    // callbacks
    function asc(a,b) {
     return a-b;
    }

    a.sort(asc);
```

Látványos példa a magyarázatra:

```javascript
    var a=[1, 2, 3, 4, 5, 55, 9, 63, 22];

    a.sort((x, y) => {
        console.log(`${x} - ${y} = ${x-y}`); //Mindegyik értéket összehasonlítja mindegyik értékkel.
        return x - y;
    });

    console.log(a);
```

## pop/push/shift

```javascript
    var x= a.pop(); //Kiszedi a legutolsó elemet és elmenti a változóba. output: undefined
    x; //output: 5
    a; //output: (4) [1, 2, 3, 4]
```

Lehet a konzolon is lekérni a változókat például, vagy újat magadni.

```javascript
    var a = [1, 2, 3];
    var b = [];
    b.push(4, 5, 6);

    var c = a.concat(b); //Egybe fűzés. output: (6) [1, 2, 3, 4, 5, 6]
    console.log(c);
    console.log(c.slice(1, 3)); //output: (2)[(2, 3)];

    c.shift() //Kiszedi az első elemet. output: (5) [2, 3, 4, 5, 6]
```

# Primitívek, referenciák, objektumok

```javascript
    var lista1 = ["alma", "körte", "makszem"];
    var lista2 = ["alma", "körte", "makszem"];
```

Objektumok=Összetett adattípusok, nem egyszerű számok, vagy szövegek.

```javascript
    alert(lista1 == lista2);
```

false, mert két különböző objektumra mutatnak, különböző helyen vannak tárolva a memóriában.
A == objektumok esetén referenciát hasonlít, nem tartalmat.

```javascript
    alert(lista1 === lista2);
```

false, mert két különböző objektumra mutatnak, különböző helyen vannak tárolva a memóriában.
Típust is ellenőriz ÉS objektumoknál szintén csak a referenciát hasonlítja.

```javascript
    var lista1 = ["alma", "körte", "makszem"];
    var lista2 = lista1;

    alert(lista1 === lista2); // true
```

A fenti példában ugyanarra az objektumra mutatnak.

## Objektumok

```javascript
    var myobj= new Object();
    myobj.name='Steve';
    myobj; //output: 'Steve'

// A böngészőben van egy JS objektumom (objects):
//Adatcserére jó.

    var person = {
        name: "bobby",
        age: 42,
        email: "bobbyc@sfu.ca",
        address: {
            number: "123",
            street: "fake st",
        },
        speak: function (words) {
            //Metódus.
            console.log(words);
        },
    };

    person.speak("hello"); //output: hello
```

# Ciklusok (Loop)

## While

```javascript
    var a = 0;

    while (a < 6) {
        alert("A értéke kisebb, mint 6, mert a= " + a);
        a = a + 1;
    }
    alert("Kiléptünk a ciklusból, mert A értéke: " + a);
```

## Egy soros ciklus

Egysoros ciklusnál nincs kapcsos zárójel, de csak egy utasítás tartozik a ciklushoz.

```javascript
    var a = 0;

    while (a < 6)
        a = a + 1;
```

## Do-while

Egyszer mindenképpen le fog futni.
```javascript
    var a = 0;

    do {
        alert("a= "+a);
        a++;
    } while (a == 0);
```

## For ciklus

Kiíratjuk a tömb elemeit.

```javascript
    for (i = 0; i < fruits.length; i++) {
        alert(fruits[i]);
    }
```

# Feladatok

1. feladat – Életkor ellenőrzés
2. 
```javascript
A prompt stringet ad vissza, ezért Number()-ral számmá kell alakítani.

    var age = Number(prompt("Kérlek, add meg az életkorodat:"));

    if (age < 14) {
            alert("Gyerek");
        } else if (age >= 14 && age <= 17) {
            alert("Tizenéves");
        } else {
            alert("Felnőtt");
    }
```

```javascript
Boolean(10>9); //true
```

1. feladat – Gyümölcs kereső 🍎
   
```javascript
//Van egy tömb:

    var fruits = ["alma", "körte", "banán", "narancs"];
```

A program:
Kérjen be egy gyümölcsnevet (prompt-tal).
Ha a megadott gyümölcs benne van a tömbben → alert("Van ilyen gyümölcs!")
Ha nincs benne → alert("Nincs ilyen gyümölcs!")

Használhatsz:
```javascript
fruits.includes(keresettGyumolcs)

    var fruits = ["alma", "körte", "banán", "narancs"];

    var valasztottertek = prompt("Válasz egy gyümölcsöt:").toLowerCase();

    if (fruits.includes(valasztottertek)) {
            alert("Van ilyen gyümölcs.");
        } else {
            alert("Nincs ilyen gyümölcs.");
    }
```

2. feladat – Számláló ciklus \_🔁

Írj egy while ciklust, ami:
0-tól indul,
minden lépésben kiírja a számot (alert vagy console.log),
és 5-ig számol.
De ha a szám 3, akkor írja ki: "Ez a kedvenc számom!"

```javascript
    var number = 0;

    while (number <= 5) {
        alert(`A szám: ${number}`);

        /*=== (szigorú egyenlőség)
        Nem végez típusátalakítást.
        Csak akkor ad true-t, ha érték és adattípus is megegyezik.*/

            if (number === 3) {
                alert("Ez a kedvenc számom.");
            }
        number++;
    }
```

# Memória túlcsordulás HD (StackOverflow)

Ez egy végtelen ciklus, ami sosem áll meg.
Egy idő után elfogy a rendelkezésünkre álló memória, vagyis túlcsordulunk a memóriából. -> StackOverflow

```javascript
    var fruits = ["banana", "grape", "apple"];

    while (a == 0) {
        var b = "onodnfvnfdkvnkfjd";
    }
```

# Inkrementálás

JavaScript inkrementálás (++) működésének klasszikus példája, és valóban nem minden nyelv kezeli ugyanúgy.

Post-increment (a++) → előbb használja az értéket, majd növeli

Pre-increment (++a) → előbb növeli, majd használja az értéket

```javascript
    var a = 0;

    // post-increment
    var c = a++; //Az érték átadás után növeltük az értéket.

    alert(c + " " + a); //output: 0 1

    // pre-increment
    c = ++a; //Először növeljük az értéket és utána adjuk át.

    alert(c); //output: 2
```

# Metódusok

```javascript
    function house() {
    alert("Itt lakom látod, ez az a ház!");
    }

    function house2(package) {
    alert(package);
    }

    //Meghívjuk a metódust.
    house();
    house2("Szevasz! Bent vagyok a házban!");
```

---

```javascript
    var myfunc2 = function(){
      console.log('hello world 2');
    }

    myfunk2;
```
---

Hacsak egy argumentumot adunk át, és az is már összeadott érték (68 + 96 = 164).
Ezért a függvényben a = 164 lesz, és b = undefined.

A JavaScriptben az undefined + szám → NaN (Not a Number), tehát az alert NaN-t fog mutatni.

```javascript
    function sum(a, b) {
        alert(a + b);
    }

    sum(68 + 96);
```

Helyes megoldás:

```javascript
    function sum(a, b) {
    alert(a + b);
    }

    sum(3, 5);
```

# Math.

```javascript
//Minimum: 0 (előfordulhat)
//Maximum: 0.999999... (de 1 sosem lesz)
Math.random();

const number = Math.trunc(Math.random()*20)+1; // 1-20 közötti szám kreálása.
//A +1 azért kell, hogy lehessen 20 is az eredmény.
```

Van még egy pár metódusa a Math osztálynak.
<!-- TODO -->

# OOP

<!-- TODO -->

```javascript
class Felhasznalo {
  // 1. Mezők (Property-k) deklarálása (opcionális, de tiszta)
  szerep = 'tag'; 
  #jelszo; // Privát mező (kívülről nem elérhető)

  // 2. Konstruktor: ez fut le példányosításkor (new Felhasznalo)
  constructor(nev, kor, jelszo) {
    this.nev = nev; // Nyilvános tulajdonság
    this.kor = kor;
    this.#jelszo = jelszo;
  }

  // 3. Metódus (függvény az osztályon belül)
  koszon() {
    console.log(`Szia, a nevem ${this.nev}, és ${this.kor} éves vagyok.`);
  }

  // 4. Getter és Setter (kontrollált hozzáférés)
  get profilInfo() {
    return `${this.nev} (${this.szerep})`;
  }

  set eletkorFrissites(ujKor) {
    if (ujKor > 0) {
      this.kor = ujKor;
    }
  }

  // 5. Statikus metódus (az osztályhoz tartozik, nem a példányhoz)
  static leiras() {
    console.log("Ez egy Felhasználó osztály sablon.");
  }
}

// HASZNÁLAT:
const adam = new Felhasznalo('Ádám', 28, 'titok123');
adam.koszon(); // "Szia, a nevem Ádám..."
console.log(adam.profilInfo); // "Ádám (tag)"
Felhasznalo.leiras(); // Osztály szintű hívás
```


# Időzítő beállítása

```javascript
    var i = 0;

    //inter-ban eltároljuk az időazonosítóját.
    var inter = window.setInterval(function(){
        console.log(i); //Kiíratás.
        i++; //Szám növelése.
     },1000) //1000 milliszekundum = 1 másodperc, vagyis minden másodpercben lefut.

```

A setInterval() futtatja a kódot ismételten bizonyos időközönként.
1-1000-ig kiírja a számokat.

Ez a callback függvény:

```javascript
    function(){
            console.log(i);
            i++;
        }
```

Ezzel lehet megállítani:

```javascript
    clearInterval(inter);
```

Modern módszer:

```javascript
setInterval(() => console.log("hello"), 1000);
//A hello előtt megjelenik egy szám és az növekszik másodpercenként.
```

# Html és js összekötése

A html kódba ezt írd bele, rakhatod a head, vagy a body-ba is.

```html
    <!--defer: A script csak akkor fut le, amikor a HTML teljesen betöltődött.-->
    <script src="script.js" defer></script>
```

Egy komponens id-jára, így kell hivatkozni:

```javascript
    document.getElementById("fname");

    var t=document.getElementById("fname");
    t.value; //output: ''

    //Beírom az input mezőbe azt, hogy Bobby.
    t.value; //output: 'Bobby'
```

Egy komponens value-ra való hivatkozás:

```javascript
    //A html-ben van egy gomb, aminek a value-ja SuBmit.
    var c=document.querySelector('input[value="SuBmit"]');

    c.value; //'SuBmit'
    c.value='SEND', //'SEND'
```

```javasript
//Elem szövegét módosítjuk. pl.: div,p , span
document.querySelector(".number").textContent = 13;

//Szám beállítása az input mezőben. ez lehet input, vagy textarea
document.querySelector(".guess").value = 23;
```


Típus csekkolás

```javascript
    // 1. Az elem szövegként jön ki (string)
    let a = document.querySelector(".number").textContent;
    typeof a; // "string"

    // 2. Átalakítás számmá
    a = Number(a);
    typeof a; // "number"
```

A táblázat összes cellájára való hivatkozás:

```javascript
    var td =document.getElementsByTagName("td");
    td[0]; // → első td , maga az HTML elem, output: <td>1</td>

    td[0].innerHTML;
    //→ az elem belsejében lévő tartalom (szöveg vagy HTML)
    //output: 1
```

Billentyű lenyomás eseményfigyelő:

Figyeli, hogy a felhasználó lenyomott-e a billentyűzeten egy gombot, azt is nézi, ha nem egy input mezőben nyomott meg valamit.

addEventListener mindig függvényt vár, nem a függvény azonnali meghívását.

```javascript
    window.addEventListener('keypress',processKey);

    function processKey(evt){
        console.log(evt);
    }
    //output: KeyboardEvent {isTrusted: true, key: 'f', code: 'KeyF', location: 0, ctrlKey: false, …}
```

Ezzel, csak a betűket írjuk ki:

```javascript
    window.addEventListener('keypress',processKey);

    function processKey(evt){
        console.log (evt.key);
    }
    //output: f
```

Click eseményhez:

```javascript
    var button=document.querySelector('input[value="SuBmit"]');

    button.addEventListener('click',kattintas);
    function kattintas(){
        console.log("Kattintottal.");
    }
```

Arrow függvény click eseményhez:

```javascript
    window.addEventListener('click', () => {
        console.log("Kattintottál.");
    }); //Csak akkor fut, amikor valóban kattintanak az ablakban.
```

Még rövidebb arrow függvény:

```javascript
    addEventListener('click', () => console.log("kattintas"));
```

Ezzel nem fog csinálni semmit az oldal, ha rákattintok a gombra:

```javascript
    var button=document.querySelector('input[value="SuBmit"]');

    button.addEventListener('click',function(evt){
        evt.preventDefault()
    });
```

A class-on belül meg lehet adni alosztályt, ha van: 

```javascript
// <button class="btn check">Check!</button>
//A btn class-on belül a check gombot kérjük le.
document.querySelector(".check").addEventListener();
```


# Összefoglaló

1. A DOM (Document Object Model)
A böngésző a HTML dokumentumot egy "fa struktúraként" értelmezi, amit DOM-nak hívunk. A JavaScript segítségével hozzáférhetünk ezekhez az elemekhez (ágakhoz), és módosíthatjuk őket.

2. Elemek kiválasztása
Megtanulhatod, hogyan "találd meg" a HTML elemeket a kódban, például:

```javascript
document.getElementById("azonosito"); // id-ra hivatkozunk.
document.querySelector("body");  // tag, amiből tuti egy darab van.
document.querySelector("#azonosito"); // id-ra hivatkozunk.
document.querySelector(".osztaly-nev"); // class-ra hivatkozunk.

```

3. Eseménykezelés (Event Listeners)
Ez a webes interaktivitás lelke. A JavaScript képes "figyelni" a felhasználó mozdulatait, például:

- Kattintás (click)
- Billentyűleütés (keydown)
- Egér mozgatása (mouseover)

Példa egy gombnyomás kezelésére:

```javascript
const gomb = document.querySelector('button');
gomb.addEventListener('click', () => {
  alert('Megnyomtad a gombot!');
});
```

4. HTML/CSS dinamikus módosítása
A JavaScripttel nemcsak a szöveget cserélhetjük ki az oldalon, hanem stílusokat is módosíthatunk (pl. egy gomb színe megváltozik, ha rákattintanak), vagy új elemeket hozhatunk létre és törölhetünk.

# Hibák

A programozás során elkerülhetetlen, hogy hibákba fussunk, ezért kulcsfontosságú megérteni, miért történnek, és hogyan javíthatjuk ki őket.

Íme egy összefoglaló a JavaScript leggyakoribb hibaüzeneteiről és a hibakezelési technikákról:

## Leggyakoribb hibatípusok

**SyntaxError** (Szintaktikai hiba): Akkor fordul elő, ha a kód nem felel meg a nyelv nyelvtani szabályainak (pl. hiányzó zárójel, idézőjel vagy vessző). A JavaScript értelmezője ilyenkor el sem tudja indítani a futtatást.

Példa: console.log("Hello"; (hiányzik a bezáró zárójel).

**ReferenceError** (Referencia hiba): Akkor jelentkezik, ha egy olyan változóra vagy függvényre hivatkozunk, amely nem létezik, vagy nincs definiálva az adott hatókörben (scope).

Példa: console.log(x); (ha x korábban nem lett deklarálva).

**TypeError** (Típus hiba): Akkor kapjuk, ha egy műveletet nem megfelelő típusú adaton próbálunk elvégezni. Például olyan értéket próbálunk függvényként meghívni, ami nem az, vagy egy null érték tulajdonságát akarjuk elérni.

Példa: let num = 5; num.toUpperCase(); (a számoknak nincs ilyen metódusa).

**RangeError** (Tartomány hiba): Akkor fordul elő, ha egy érték kívül esik a megengedett tartományon.

Példa: Egy tömbnek negatív hosszt próbálunk megadni.

## Hibakezelés (Error Handling)

A JavaScript biztosítja a try...catch szerkezetet, amellyel "elkaphatjuk" a futásidejű hibákat, így megakadályozhatjuk, hogy az egész program összeomoljon.

**try blokk**: Itt helyezzük el azt a kódot, amely potenciálisan hibát dobhat.

**catch blokk**: Ha a try blokkban hiba történik, a futtatás ide ugrik át. Itt kezelhetjük a hibát (pl. hibaüzenet kiírása).

**finally blokk**: Ez a rész mindenképpen lefut, függetlenül attól, hogy történt-e hiba vagy sem. Gyakran használják erőforrások felszabadítására vagy takarításra.

**throw** kulcsszó: Segítségével mi magunk is létrehozhatunk és "dobhatunk" egyedi hibákat, ha egy bizonyos feltétel nem teljesül.

Miért fontos ez?
A hibák megértése segít a hibakeresésben (debugging). Ahelyett, hogy találgatnánk, a hibaüzenet pontosan megmondja:

- Mi a hiba típusa.
- Hol történt (fájl és sor száma).
- Hogyan háríthatjuk el.

# Modern JS és lambda (arrow function) verzió

```javascript
document.addEventListener("DOMContentLoaded", () => {

    //HTML-ben a button id=gomb
    const gomb = document.getElementById("gomb");

    gomb.addEventListener("click", () => {
        alert("Rákattintottál!");
    });
});

```

DE!!! Nem kell a fenti, ha a html-ben a </body> mögé rakod ezt:
```html
 <script src="script.js" defer></script>
 ```

# Cheat Sheet

```bash
//Ebbe kell az egész js kódot beírni.
document.addEventListener("DOMContentLoaded", () => {}

| Téma                | Szintaxis / Példa                                                                     | Magyarázat                        |
| ------------------- | ------------------------------------------------------------------------------------- | --------------------------------- |
| **Változók**        | `let nev = "Anna";`<br>`const PI = 3.14;`                                             | `let` változtatható, `const` nem  |
| **Típusok**         | `string, number, boolean, null, undefined, object`                                    | Alap JS típusok                   |
| **Feltételek**      | `if (x > 10) {...} else {...}`<br>`x > 10 ? "igen" : "nem";`                          | If/else és ternary                |
| **Ciklusok**        | `for (let i=0;i<5;i++){}`<br>`while(x<10){x++}`<br>`array.forEach(i=>console.log(i))` | For, while, foreach               |
| **Függvények**      | `function osszeg(a,b){return a+b}`<br>`const osszeg = (a,b)=>a+b`                     | Klasszikus és arrow függvény      |
| **Tömbök**          | `tomb.push(4)`<br>`tomb.pop()`<br>`tomb.map(x=>x*2)`                                  | Elem hozzáadás/törlés, átalakítás |
| **Objektumok**      | `const ember={nev:"Anna",kor:25}`<br>`console.log(ember.nev)`                         | Tulajdonságok és metódusok        |
| **DOM kiválasztás** | `document.getElementById("id")`<br>`document.querySelector(".class")`                 | Elem kiválasztása                 |
| **DOM módosítás**   | `elem.innerText="Hello"`<br>`elem.style.color="red"`                                  | Szöveg és stílus módosítás        |
| **Eseménykezelés**  | `gomb.addEventListener("click", (e)=>console.log(e.target))`                          | Arrow function + event objektum   |
| **this vs event**   | `function(){console.log(this)}`<br>`(e)=>console.log(e.target)`                       | Arrow nem ad saját `this`-t       |
| **DOM létrehozás**  | `const p=document.createElement("p"); p.innerText="Új"; document.body.appendChild(p)` | Új elem létrehozása és hozzáadása |
| **Tipikus hibák**   | `document.getElementById("gomb")` túl korán → null                                    | DOM mindig legyen betöltve        |
```


JSON (JavaScript Object Notation) 

---
# DOM manipuláció

//A querySelector-al tudunk hozzáférni a DOM fához, amit a html-ben hoztunk létre. A tag-ek a node-ok.



## DOM kiválasztó metódusok

1. Egyetlen elem kiválasztása
Ha pontosan tudod, melyik elemet akarod módosítani, ezeket használd:

**document.getElementById("azonosito")**: A leggyorsabb és legbiztosabb módszer. Mivel az id egyedi kell legyen az oldalon, ez mindig pontosan egy elemet ad vissza.

**document.querySelector(".osztaly")**: Nagyon rugalmas, mert CSS szintaxist használ. Ha több elem is megfelel a feltételnek, csak a legelsőt adja vissza.

2. Több elem kiválasztása (Listák)
Gyakran előfordul, hogy egyszerre több elemen akarsz változtatni (például az összes bekezdés színét átírni):

**document.getElementsByTagName("p")**: Összegyűjti az összes <p> (bekezdés) elemet egy listába.

**document.getElementsByClassName("kiemelt")**: Minden elemet visszaad, aminek az osztályneve "kiemelt".

**document.querySelectorAll(".doboz")**: Ez a "svájci bicska". Bármilyen CSS szelektorral (osztály, ID, attribútum) megkeresi az összes egyező elemet.

Fontos tudnivaló: Amikor listát kapsz vissza (pl. querySelectorAll), nem tudod közvetlenül módosítani a stílusát (mint pl. .style.color = "red"). Ilyenkor egy for ciklussal vagy forEach metódussal végig kell menned a lista elemein.

# style

A css -> js alakításnál a kebab-case → camelCase lesz. Ezek inline stílusok lesznek a htmlben, a css fájlban nem fog megváltozni semmi sem.

```javascript

//Csak egy elemet módosít (az első találatot)
document.querySelector(".number").style.width = "30rem"; //rem: Egy relatív mértékegység a html font-size-hoz viszonyítva.
//font-size: 10px -> 30rem = 30 × 10px = 300px

document.getElementById('demo').style.display = 'none';   // eltünteti
document.getElementById('demo').style.display = 'block';  // megjeleníti blokk elemként
document.getElementById('demo').style.display = 'inline';   // soron belül
document.getElementById('demo').style.display = 'flex';   // modern layout
document.getElementById('demo').style.display = 'grid';   // komplex layout

//Layout / megjelenés
el.style.display = "block";
el.style.visibility = "hidden";
el.style.overflow = "hidden";

//Színek és háttér
el.style.color = "red";
el.style.backgroundColor = "blue";
el.style.opacity = "0.5"; //Muszáj a számokat is idézőjelek közé beírnunk, mert string kell nekünk. 

//Méret és térköz
el.style.width = "200px";
el.style.height = "100px";

el.style.margin = "10px";
el.style.padding = "5px";

//Szöveg
el.style.fontSize = "20px";
el.style.fontWeight = "bold";
el.style.textAlign = "center";

//Pozicionálás
//Transzformációk / animáció
//Border és shadow
```

# querySelectorAll

```javascript
document.querySelectorAll("div"); //html tag.

document.querySelectorAll(".rounded"); //class

document.querySelectorAll("#logo"); //specifikus id
```

```javascript
document.querySelectorAll("a[href='https://www.freecodecamp.org/']"); //Minden elem aminek ez az attribútuma.

  //A querySelectorAll nem egyetlen elemet ad vissza, hanem egy NodeList-et (olyan, mint egy tömb/lista).
  const ingredientsLista = document.querySelectorAll("ul.ingredients li");
  const negyedikGomb = document.getElementById("negyedikGomb");

  negyedikGomb.addEventListener("click", () => {
    // Egy ciklussal végigmegyünk a lista minden egyes elemén
    ingredientsLista.forEach((e) => {
      e.style.backgroundColor = "blue";
      e.style.color = "white";
    });
  });
```

```html
<ul class="ingredients">
          <li>Liszt</li>
          <li>Tojás</li>
</ul>
```


# innerHTML vs textContent vs innerText

Ez a három tulajdonság a leggyakoribb módja annak, hogy JavaScript segítségével kezeljük egy HTML elem tartalmát. Bár hasonlónak tűnnek, kritikus különbségek vannak köztük.

1. element.innerHTML
Ez a tulajdonság a teljes HTML kódot kezeli, ami az elemen belül van.

Írás: Ha értéket adsz neki, a böngésző HTML-ként értelmezi a szöveget. Ha beleírsz egy <b> taget, a szöveg félkövér lesz.

Olvasás: Visszaadja a szöveget az összes belső HTML taggel együtt.

Veszély: XSS (Cross-Site Scripting) támadási felületet nyit. Ha ismeretlen felhasználótól érkező adatot (pl. kommentet) illesztesz be vele, kártékony scriptek futhatnak le az oldaladon.

2. element.textContent
Ez a tulajdonság a nyers szöveggel foglalkozik, és ez a legbiztonságosabb választás.

Írás: Minden karaktert sima szövegként kezel. Ha beleírsz egy <b> taget, az szövegként fog megjelenni (<b>szöveg</b>), nem lesz félkövér.

Olvasás: Visszaadja az elemben lévő összes szöveget, beleértve a rejtett elemeket is (amikre display: none van állítva).

Előny: Gyorsabb, mert a böngészőnek nem kell HTML-t elemeznie, és biztonságos, mert nem futtat kódokat.

3. element.innerText
Gyakran összekeverik a textContent-tel, de van egy fontos különbség: az innerText stílus-tudatos.

Láthatóság: Csak azt a szöveget adja vissza, ami látható a képernyőn. Ha egy szövegrész el van rejtve CSS-sel, az innerText nem fogja látni, míg a textContent igen.

Formázás: Figyelembe veszi a sortöréseket és a stílusokat (pl. a csupa nagybetűs CSS formázást nagybetűként adja vissza).

Hátrány: Valamivel lassabb, mert a böngészőnek ki kell számolnia a CSS-t (layout/reflow), mielőtt visszaadná az eredményt.

## Mikor melyiket használd?

**textContent**: Használd ezt alapértelmezettként, ha szöveget akarsz módosítani. Ez a leggyorsabb és legbiztonságosabb.

**innerText**: Csak akkor használd, ha kifejezetten csak a felhasználó által ténylegesen látott szövegre van szükséged.

**innerHTML**: Csak akkor használd, ha valódi HTML struktúrát akarsz létrehozni (pl. egy új listát vagy táblázatot), és a forrásod 100%-ig megbízható.

## Példák

```javascript
document.getElementById("elsoGomb").innerHTML = "<b>Szia</b>";
Félkövérrel lesz kiírva.

document.getElementById("elsoGomb").textContent =("Szia <b>Barátom</b>!"); 
//output: Szia <b>Barátom</b>!

document.getElementById("elsoGomb").innerText=("Szia <b>Barátom</b>!"); 
//output: Szia <b>Barátom</b>!
```

# HTML DOM API Képességek és Alapok

A DOM (Document Object Model) API lehetővé teszi a fejlesztők számára a weboldalak dinamikus kezelését.

## Mit tehetünk a DOM API-val?

A DOM API segítségével a következőkre vagyunk képesek:
* **Elemek keresése és kiválasztása** a dokumentumban.
* **Tartalom és attribútumok módosítása** (pl. szöveg átírása, képforrás cseréje).
* **Elemek hozzáadása, eltávolítása vagy módosítása** a struktúrában.
* **CSS stílusok megváltoztatása** futásidőben.
* **Eseménykezelők hozzáadása**, hogy reagáljunk a felhasználói bevitelre (kattintás, gépelés, stb.).

## A JavaScript a közvetítő nyelv

* A **DOM API** egy szabvány, amely meghatározza, hogyan lehet lekérni, módosítani, hozzáadni vagy törölni a HTML DOM elemeket.
* A **JavaScript** az a programozási nyelv, amelyet a böngészőkben használunk, hogy ezen az API-n keresztül elérjük a DOM-ot.


## API Metódusok és Tulajdonságok

### Globális objektumok
A fejlesztők olyan globális objektumokat használnak belépési pontként az API-hoz, mint a `document` és a `window`.

### A Document objektum
Ha egy HTML oldal bármely eleméhez hozzá akarsz férni, mindig a `document` objektummal kell kezdened. 
> A **document objektum** jelképezi a teljes weboldaladat.

### Kiválasztás (Selection)
Ahhoz, hogy JavaScripttel manipulálni tudj egy HTML elemet, legelőször **ki kell választanod** azt az elemet (például az ID-ja vagy a CSS osztálya alapján).

---

## Gyakori kiválasztási módszerek:
* `document.getElementById("id")` – Elem kiválasztása egyedi azonosító alapján.
* `document.querySelector(".osztaly")` – Az első olyan elem, amely megfelel a CSS választónak.
* `document.querySelectorAll("p")` – Az összes adott típusú/osztályú elem kiválasztása.

# JavaScript DOM Manipuláció Puska

Ez a dokumentum a legfontosabb DOM (Document Object Model) metódusokat és tulajdonságokat foglalja össze.

---
```bash
## 1. Tartalom elérése és módosítása

| Tulajdonság           | Leírás                                                                       |
| :-------------------- | :--------------------------------------------------------------------------- |
| `element.innerHTML`   | Az elem belső HTML tartalmát adja vissza vagy módosítja (tag-ekkel együtt).  |
| `element.textContent` | Az elem nyers szöveges tartalmát kezeli (biztonságosabb, mint az innerHTML). |

## 2. Attribútumok és Stílusok

| Tulajdonság / Metódus               | Leírás                                                                     |
| :---------------------------------- | :------------------------------------------------------------------------- |
| `element.attribute`                 | Közvetlen elérés (pl. `element.id` vagy `element.src`).                    |
| `element.style.property`            | Az elem inline CSS stílusát módosítja (pl. `element.style.color = "red"`). |
| `element.setAttribute(attr, value)` | Új attribútumot hoz létre vagy módosít egy meglévőt.                       |
| `element.getAttribute(attr)`        | Lekéri egy adott attribútum értékét.                                       |

## 3. Struktúra manipulálása (DOM fa)

| Metódus                           | Leírás                                               |
| :-------------------------------- | :--------------------------------------------------- |
| `document.createElement(tag)`     | Létrehoz egy új HTML elemet a memóriában.            |
| `document.appendChild(node)`      | Hozzáad egy elemet egy szülőelem utolsó gyerekeként. |
| `document.removeChild(node)`      | Eltávolít egy gyerekobjektumot a DOM-ból.            |
| `document.replaceChild(new, old)` | Kicserél egy létező gyerek elemet egy újra.          |
```

## 4. Eseménykezelők

### Alapszintű (HTML-központú):
```javascript
document.getElementById("gomb").onclick = function() {
    alert("Kattintottál!");
};

---
<p id="demo"></p>

document.getElementsByTagName("p")[0].innerHTML = "Hello";
---
```

# localStorage

```javascript
//Mentés
localStorage.setItem("nev", "Leroy");

//Lekérés
const nev = localStorage.getItem("nev");
console.log(nev); // Leroy

//Törlés
localStorage.removeItem("nev");

//Összestörlése
localStorage.clear();

//Mentés tömbbel
const todos = ["tanulás", "edzés", "projekt"];
localStorage.setItem("todos", JSON.stringify(todos));

//Visszaolvaás
const todos = JSON.parse(localStorage.getItem("todos")) || [];
console.log(todos);
```

# Haladóbb (toggle)

```javascript
// .style → közvetlenül ír
document.getElementById("demo").style.color = "red";

// getComputedStyle → olvas (végleges stílus)
console.log(getComputedStyle(document.getElementById("demo")).color);

// classList.add → CSS osztály hozzáadása
document.getElementById("demo").classList.add("active");

// classList (profi megoldás) → pl. toggle használat
document.getElementById("demo").classList.toggle("hidden");
```

