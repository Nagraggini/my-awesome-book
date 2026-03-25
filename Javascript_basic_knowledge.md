# Tartalomjegyzék

- [Tartalomjegyzék](#tartalomjegyzék)
- [Források](#források)
- [Alert](#alert)
- [Prompt](#prompt)
- [Explicit és implicit](#explicit-és-implicit)
- [Adattípusok(primitívek)](#adattípusokprimitívek)
  - [let vs var vs const](#let-vs-var-vs-const)
- [If - elágazások](#if---elágazások)
- [Switch szerkezet](#switch-szerkezet)
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
- [Időzítő beállítása](#időzítő-beállítása)
- [Html és js összekötése](#html-és-js-összekötése)
- [Összefoglaló](#összefoglaló)
- [Hibák](#hibák)
  - [Leggyakoribb hibatípusok](#leggyakoribb-hibatípusok)
  - [Hibakezelés (Error Handling)](#hibakezelés-error-handling)

# Források

https://sanfranciscoboljottem.com            
https://www.youtube.com/playlist?list=PLyriihBWoulwgaKMNF6M20iD0c6iDtu0S        
https://www.youtube.com/watch?v=BUFagBZZafo&list=PLg7lel5LdVjyO7jk-4biyr0fqPVygTLOk&index=5      
https://www.codedex.io/home
    
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

# Összefoglaló

1. A DOM (Document Object Model)
A böngésző a HTML dokumentumot egy "fa struktúraként" értelmezi, amit DOM-nak hívunk. A JavaScript segítségével hozzáférhetünk ezekhez az elemekhez (ágakhoz), és módosíthatjuk őket.

2. Elemek kiválasztása
Megtanulhatod, hogyan "találd meg" a HTML elemeket a kódban, például:

```javascript
document.getElementById('azonosito');
document.querySelector('.osztaly-nev');
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