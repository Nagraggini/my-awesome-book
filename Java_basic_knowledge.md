# Programozás Java nyelven

1. Nézz megy egy gyorstalpalót.
2. Készítesd 3 db guided projektet.
3. Készíts egy saját projektet, minden segítség nélkül.

Források:  
https://sanfranciscoboljottem.com  
https://okt.inf.szte.hu/prog1/gyakorlat/eloadas/Java/objectsAndClasses/  
https://data-flair.training/blogs/stacks-and-queues-in-c/  
https://itszotar.hu/jvm-java-virtualis-gep-mi-a-mukodese-es-mi-a-szerepe-a-java-kod-futtatasaban/  
https://www.youtube.com/watch?v=8qMi3e_fzKc&list=PL92V_WHHt2CnXaUIA9T2ww7peDK4lqmZj&index=23

[Pályakezdő fullstack tutorial csomag](https://www.skillversum.com/note/view/c256d513dd9e6f970aa3daa5ded7496b38d01e78)

A sanfranciscoboljottem tananyag sorrendje:  
Programozási alapismeretek  
Git Alapismeretek  
Java alapismeretek  
SQL alapismeretek  
JavaFX alapismeretek  
JavaFX Középhaladó  
Java Középhaladó (Vagy esetleg a szerver után.)  
JDBC - Adatbázis kapcsolatok  
Java szerver  
Spring Boot Ismeretek  
Spring Boot Ismeretek II.

📌 Klasszikus full-stack webalkalmazás felépítés.

React ↔ Spring (REST, JSON),

Frontend: React (JavaScript)
Backend: Spring Boot (Java)

# Általános infók

A java egy általános célű objektum orientált nyelv. Több operációs rendszeren is lehet futattni, pl.: windows, mac, linux.
A Sun Microsystem alkotta meg a javat. Később az Oracle vette meg a céget.
JVM, miatt lehet futattni elég sok oprendszeren a javas programot.
A .jar fájlokat futattja a JVM, a windows pedig futtatja a JVM-t.

## Fordítási folyamat

A javac fordító a Java forráskódot (.java) platformfüggetlen bytecode-ra (.class fájlok) alakítja, amit .jar fájlba csomagolnak.​
Ezt követően a JVM tölti be és hajtja végre a bytecode-ot: kezdetben értelmezi, de gyakran használt részeket JIT kompilerrel optimalizált gépi kóddá fordít a jobb teljesítmény érdekében.​
Ez biztosítja a "write once, run anywhere" elvet, mivel minden platformra külön JVM-et fejlesztenek.​

JAVAC: Java compiler, fordító.

JRE: Java Runtime Environment, könyvtárakat tartalmaz pl.: JVM.

JDK: Java Development Kit, tartalmazza a JRE-t.

Amikor egy Java fejlesztő megírja a forráskódot, azt először a Java fordító (javac) bájtóddá (bytecode) alakítja. Ez a bájtód egy architektúra-semleges, platformfüggetlen utasításkészlet, amelyet a JVM értelmez. Ez a folyamat a kulcsa a Java híres „write once, run anywhere” (írjuk meg egyszer, futtassuk bárhol) filozófiájának. A JVM lényegében egy virtuális CPU-ként működik, amely képes ezt a bájtódot natív gépi kóddá alakítani az adott hardver és operációs rendszer számára, anélkül, hogy a fejlesztőnek minden egyes platformra külön kellene fordítania az alkalmazást.

A JVM szerepe messze túlmutat a puszta kódfuttatáson. Felelős a programok életciklusának kezeléséért, az osztályok betöltésétől kezdve a memóriaallokáción át a „szemétgyűjtésig” (Garbage Collection). Ez az automatikus memóriakezelés az egyik legfontosabb előnye, mivel jelentősen csökkenti a fejlesztők terheit, akiknek így nem kell kézzel foglalkozniuk a memória felszabadításával, ami gyakori forrása a hibáknak más programozási nyelvekben. A JVM tehát egy rétegként funkcionál a Java alkalmazás és az alatta lévő hardver/operációs rendszer között, elrejtve a platformspecifikus részleteket a fejlesztő elől.

# Netbeans fejlesztői környezet

netbeans+java-t töltsd le. -> Java EE változat kell. Tomcat-t rakd fel, a glasfish-t ne.

Java SE (Standard Edition): asztali alkalmazásokat lehet benne készíteni.

Java EE (Enterprise Edition): Céges környezet. Szerverek készítésehez jó.

Java FX: Segít szép grafikus környezetet létrehozni. Java Swing (régebbi) és Effect alkalmazások.

A netbeans telepítés végén a jobb alsó sarokban felajánl pár plugin-t, azokat telepítsd.

# Adattípusok

## Primitív adattípusok

8 féle primitív adattípus létezik, mindent kis betűvel kell írni programozáskor.
A megadott memóriát fogja lefoglalni a változó, hiába nincsen benne semmi.
A java egy típusos nyelv, meg kell adni, hogy a változó szám, vagy szöveg stb formátumú.

**byte**

Egész szám.
Tartomány: -128 - 127
Foglalt memória: 1 Byte=8 Bit
Alapértéke: 0

**short**

Egész szám.
Tartomány: -32 768 - 32 767
Foglalt memória: 2 Byte
Alapértéke: 0

**int**

Egész szám.
Tartomány: -2 milliárd - 2 milliárd
Foglalt memória: 4 Byte
Alapértéke: 0

**long**

Egész szám.
Tartomány: −9 223 372 036 854 775 808 – 9 223 372 036 854 775 807
Pontos magyar elnevezés:
9 kvintillió 223 kvadrillió 372 trillió 36 billió 854 milliárd 775 millió 808
Foglalt memória: 8 Byte
Alapértéke: 0

**float**

Lebegőpontos szám (egyszeres pontosság).
Tartomány: ≈ 1.175494 × 10⁻³⁸ - ≈ 3.402823 × 10³⁸
Foglalt memória: 4 Byte
Alapértéke: 0.0f

**double**

Törtszám szám (kétszeres pontosság).
Tartomány: 2.2250738585072014 × 10⁻³⁰⁸ - 1.7976931348623157 × 10³⁰⁸
Foglalt memória: 8 Byte
Alapértéke: 0.0d

**char**

Szöveg.
Tartomány: 1 karakter (0–65 535)
Foglalt memória: 2 Byte
Alapértéke: '\u0000'

**boolean**

Logikai.
Tartomány: true/false
Foglalt memória: a JVMre bízza (technikai okokból nem fix).
Alapértéke: false

Röviden:
byte = 1 byte
short = 2 byte
char = 2 byte
int = 4 byte
float = 4 byte
double = 8 byte
long = 8 byte
boolean = A JVMre bízza.

## Összetett adattípusok (referencia típusok)

Ezek objektumok, a heap memórián tárolódnak, és nagy kezdőbetűvel íródnak:
String
Array (pl. int[])
List, Map, Set
saját osztályok

Az alapértelmezett értékük: **null**
Sok függvény megvan hozzájuk írva. pl.: .Lenght()

## Pontosan hogyan tárolódnak a változók a memóriában

(Decimal to Binary Converter)[https://www.binaryhexconverter.com/decimal-to-binary-converter]

2 decimális = 10 bináris

1 byte = 8 bit, tehát 0–255 közötti egész számot lehet vele ábrázolni előjel nélküli (unsigned) formában.

Ha a byte előjeles (signed), akkor a tartománya –128…+127.

A lentiképen látszik, hogy a felső fekete hátterű értékeket kell megszorozni az alattuk lévőkkel.

![alt text](Assets/Binary_Converter.png)

# Objektum orientált programozás

Távoli példa: Két nyelv. Az angol 8 betűvel, a magyar 5 betűvel fejezi ki ugyanazt.

You `drink`. | Isz`ol`.

Következő példa:
Készítünk egy játékot, melyben van fű is. Leprogramozzuk a fűszálat és valahányszor szükségünk van rá elég a fűszál osztályt meghívni. Minden tulajdonsága benne lesz, pl a mozgása, felszíne.

Harmadik példa:
Kocsmát építünk egy játékban.
Leprogramozzuk a padlót, a pultot, ezeket bármikor meghívhatjuk újra. Mindegyik entitás, a java-ban objektum.

Osztály (tervrajz) -> Objektum (A belőle készült példány.) Még egy objektum.

Utána készítsük el az Firstproject nevű package-t.

A NetBeans-ben alapvetően megtalálható a java compiler a program fordításához.

## Metódusok

void= Nincs visszatérési értéke.

String Fuggveny() {return null;} = Van visszatérési értéke.

Ökölszabály: Osztályon belül statikus metódusból nem hívhatunk meg nem statikus metódust.

## NetBeans

Jobb egér gomb a kódban és Insert code -> Getter és Setter.
Encapsulate Fields-t, ha bepipálod és elfelejtetted privátra állítani a változót, akkor ezt kijavítja.

## VS Code

A változon nyomsz egy jobb klikket és source action-n belül lesz a konstruktor létrehozása opció.

## This

Miért nem másolódnak a metódusok minden objektumba?

Ha minden objektum saját példányban tartalmazná az összes metódusát, az valóban pazarló lenne memóriában. Ehelyett a legtöbb objektumorientált nyelv ezt csinálja:

- Az **adatok (mezők, attribútumok)** objektumonként külön vannak.

- A **metódusok** közösek (osztályhoz vagy prototípushoz tartoznak).

Így egy metódusból egyetlen példány létezik, amit sok objektum használ.

De akkor honnan tudja a metódus, melyik objektummal dolgozzon?

👉 A **this** referencia miatt.

Amikor egy metódust egy objektumon keresztül hívsz meg, a rendszer automatikusan átadja azt az objektumot, amelyen a hívás történt.

Ez történik a háttérben:

    obj.metodus(param1, param2)
    ↓
    metodus(obj, param1, param2)   // a this = obj

Ez az általad említett „titkos paraméter”.

## Példák

### Első és második példa:

package firstproject;

//Az osztálynevet mindig nagy betűvel kezd.
public class FirstProject {

//Ökölszabály: Osztályon belül statikus metódusból nem hívhatunk meg nem statikus metódust.
public static void main(String[] args) {
//String result = censor("A kutya nagyon aranyos kutya.", "kutya", "macska");
// System.out.println(result);

        //Új sablont hozok létre, példányosítom.
        Human first = new Human();

        first.setName("J"); //Beállítjuk a konstruktorral.
        System.out.println(first.getName()); //Lehívjuk a konstruktoral.
        first.writeMyName();

        Human second = new Human();
        System.out.println(second.getName());
    }

    //Metódus.
    //Ha nem írod oda, hogy public, akkor automatikusan public lesz a metódus típusa.
    // void= Nincs visszatérési értéke.
    // String Fuggveny() {return null;} = Van visszatérési értéke.
    //A zárójelben vannak az atributumok, vagy argumentumok.
    public static String censor(String text, String toChange, String newWord) {
        if (text.contains(toChange)) {
        }
        text = text.replaceAll(toChange, newWord); //(keresett érték, új szavak)

        return text;
    }

}

---

package firstproject;

//Sablon. Blueprint.
public class Human {

    //Oszály változó, nem tartozik konkrét függvényhez.
    //Privátra kell állítani, hogy a Main-ből ne lehessen elérni.
    private String name = "Gy";
    private int age;

    //Metódus, aminek nincs visszatérési értéke, de kiírja az értéket.
    void writeMyName() {
        System.out.println(name);
    }

    /*A getter és setter konstruktorok lényege, hogy ne tudjuk közvetlenül megváltoztatni a változó értékét. */
    public String getName() {
        return this.name; //this = Ez az osztály változó, amit fent privátként deklaráltál. Most épp a Human.
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

---

## Háromoperandusú Operátor

//Új sablont hozok létre, példányosítom.
Human first = new Human();
first.setName("Gy");
first.setAge(20);

        //Háromoperandusú Operátor (Ternary Operator)
        //Igaz ez ? Igen : Nem
        System.out.println(first.getName() == null ? "Nincs név" : "Van név.\n" + first.getName());
        /*
        if (first.getName() == null) {
            System.out.println("Nincs név.");
            System.out.println(first.getName());
        } else {
            System.out.println("Van. név.");
            System.out.println(first.getName()); //Lehívjuk a konstruktoral.
        }
         */

## Javadoc

Ezzel a jelöléssel meg fog jelenni a crtl+space-el a kommented a metódus meghívásakor.

/\*_ A getter és setter konstruktorok lényege, hogy ne tudjuk közvetlenül megváltoztatni a változó értékét. _/
public String getName() {
return this.name; //this = Ez az osztály változó, amit fent privátként deklaráltál. Most épp a Human.
}

## Logika

        Human valami = new Human();
        String thing = "Alma";
        String thing2 = new String("Alma");
        System.out.println(thing + "\n" + thing2);
        System.out.println(thing.charAt(0)); //Az első karaktert adja vissza.
        thing.length(); //mérete, output: 4

## Polimorfizmus (Többalakúság)

A megírt kód újrafelhasználása, pl.: ha már létre van hozva az állat osztály, akkor azt lehet többször is használni.
Mindegyik osztály ősosztálya az Object.

package firstproject;

//Öröklés. Így tudod használni az Animal osztály getter és setterjét.
//Nincsen többszörös öröklődés a java-ban, ebben a formában, csak hosszú többszörös örökléssel. pl.: Gerincesek -> NAgy macska -> Macska.
public class Cat extends Animal {

    public void meow() {
        System.out.println("MEOW!");
    }

}

Másik osztály-ban:

    public static void main(String[] args) {
        Cat macska = new Cat();
        Cat macska2 = new Cat();

        //Azért false az értéke, mert nem az értéket, hanem a referenciákat hasonlítja össze, macska és macska2 két külön objektum a memóriában.
        System.out.println(macska.equals(macska2));
        macska.meow();

    }

## Öröklés és Override

Annotáció (annotation) egy metaadat, amivel osztályokat, metódusokat, változókat stb. jelölünk meg, és amit a fordító vagy futásidőben a program fel tud dolgozni.

    @Override //Felülírás.
    public void makeSound() {
        System.out.println("MEOW!");
    }

}

Elérési módosítók:  
4 féle láthatóság van, amiből 3-hoz kapcsolódik kulcsszó (private, protected, public), az utolsó pedig az alapértelmezett eset, amire szokás package private-ként hivatkozni.

**Public:**
Nyilvános, bárhonnan el lehet érni.

**Protected:**  
A protected metódusokat, csak az örökléssel létrehozott osztályok használhatják.

**Abstract:**  
Az asbsztrakt osztályok nem példányosíthatók.  
Ezt nem lehet csinálni:

        abstract class Animal {}

        Animal állat =new Animal();

## Interfész

Minden interface alapból public abstract, ezért ez a kettő ugyanazt jelenti:

    interface Pet {
        void play();
    }

és

    interface Pet {
        public abstract void play();
    }

---

Ez egy nyilvántartás, hogy a háziállatoknak mi a képességük.

        abstract interface Pet {

            public void cuddle();

            public void sit();

            public void layDown();
        }

---

Implementáljuk a Pet interfészt, után kötelező felülírni a metódusokat.  
Jobb klikk a Cat szón és Source Action -> Override/Implement Methods... -> Válaszd ki a metódusokat.  
Fontos infó, hogy bármennyi infészt lehet implementálni, nincs megkötés mint az öröklésnél.

    public class Cat extends Animal implements Pet {

        @Override //Felülírás.
        public void makeSound() {
            System.out.println("MEOW!");
        }

        @Override
        public void cuddle() {
            // TODO Auto-generated method stub

        }

        @Override
        public void layDown() {
            // TODO Auto-generated method stub

        }

        @Override
        public void sit() {
            // TODO Auto-generated method stub

        }
    }

## Konstruktor

A konstruktor, csak egyszer hívható meg, amikor az objektum létrejön. Nincs meghatározva, hogy van-e visszatérési értéke, avagy nincs.  
A konstruktor neve megegyezik az osztályéval, ha nem hozod létre, akkor az IDE automatikusan létrehozza.  
Amikor létre jön az objektum, akkor automatikusan lefut.

### Első módszer a név megváltoztatására:

Main-ben:

    Cat macska = new Cat();
    macska.setName("G");

    System.out.println(macska.getName()); //output: G

### Második módszer a név megváltoztatására:

A privát változót nem éri el az öröklőtt osztály, ezért kell a protected.

    abstract class Animal {
        protected String name;
    }

---

    // Ez a konstruktor:
    public Cat() {
         this.name = "Cirmi";
    }

---

Main-ben:  
 //new Cat(); -> Rész a konstruktor.

        Cat macska = new Cat();
        System.out.println(macska.getName()); //output: Cirmi

### Harmadik módszer a név megváltoztatására:

Maradt privát a name változó és a setName metódus meghívásával módosítjuk a name értékét.

    public Cat() {
            this.setName("Dörmi");
        }

Main-ben:

        //new Cat(); -> Konstruktor.
        Cat macska = new Cat();

        System.out.println(macska.getName());

### Negyedik módszer a név megváltoztatására:

Többféle konstruktort is létre lehet hozni, de az alap üres konstruktort ebben az esetben neked kell külön létrehoznod.

    public Cat(String name) {
            this.setName(name);
        }

Main-ben:

        //new Cat(); -> Konstruktor.
        Cat macska = new Cat("Cirmos");

        System.out.println(macska.getName());

Másik konstruktor:

    public class Cat(){
        public Cat(String name,
                    int weight
            ) {
                this.setName(name);
                this.setWeight(weight);

            }
     }

Main-ben:

    Cat macska = new Cat("J", 5);

    System.out.println(macska.getName() + " " + macska.getWeight() + " kg");

### Overloading (túlterhelés)

Overloading akkor történik, amikor azonos nevű konstruktorok vagy metódusok vannak egy osztályban, de a paraméterlistájuk különbözik. Ugyanez igaz a metódusokra is.

**Mit jelent, hogy különbözik a paraméterlista?**

Legalább az egyiknek igaznak kell lennie:

- más paraméterszám, vagy

- más paramétertípus, vagy

- más sorrendű paramétertípus.

⚠️ A paraméternevek NEM számítanak, csak a típus és a sorrend!

## Super

Az első parancsnak kell lennie. A super mindig arra utal akitől öröklök.

    public class Cat extends Animal {

        public Cat() {
            //Az Animal konstruktorát hívja meg.
            super();

            //Az Animal osztály implementációját is meg lehet hívni. Ősosztály metódusát hívjuk meg.
            super.makeSound();
        }
    }

# Ismétlés és könnyű állásinterjús kérdések

## Konkatenáció

    //Az ln csinál utána egy sortörést.
    System.out.println(1 + 1 + " a " + 1 + 1); //output: 2 a 11

Miért?

- Balról jobbra értékel.
- Amíg szám + szám → összeadás.
- Amint megjelenik a String, onnantól konkatenáció.

### Becsapós kérdés

    char first = 'a';
    int second = 2;
    String third = first; //❌ NEM fut le. A Java nem konvertál automatikusan primitív típust String-gé.
    String fourst = "" + first; //✅ Lefut.

    fourst = "" + second; //✅ Lefut.

Mi történik itt?

- "" → String
- +first → String konkatenáció
- A char automatikusan String - gé alakul.

A kasztolás külön fejezetben lesz szó a további módszerekről.

### 2. Becsapós kérdés

    char first = 'a';
    int second = 2;
    System.out.println(first + second); //output: 99

👉 first = 'a' → ASCII/Unicode érték: 97

## Sortörések

    //Az ln csinál utána egy sortörést.
    System.out.println("Ah"); //output: Ah és sortörés.

    System.out.print("a"); //Nincs sortörés.
    System.out.print("\n"); //Manuális sortörés.

## Lefut-e?

    int x = 22;
    byte b = x;

❌ Nem fut le. Mi a probléma?

int → 32 bites
byte → 8 bites (−128 … 127)

A Java nem engedi az automatikus (implicit) szűkítést, mert adatvesztés történhetne.

    byte b = 22;
    int x = b; //Így működik, mert az int sokkal nagyobb.

## Explicit cast (szűkítés)

    int x = 22;
    byte b = (byte) x;

✅ Lefordul
⚠️ A programozó felelőssége az adatvesztés.

## Overflow (Túlcsordulás)

    int x = 130;
    byte b = (byte) x;
    System.out.println(b); //output: -126

A byte tartománya túllépésre kerül → körbefordul.

## Típuskonverzió szabály

Szélesítés (widening) → automatikus

byte → short → int → long → float → double

Szűkítés

❌ nem automatikus
✅ csak cast-tal

### double → int szűkítő (narrowing) konverzió

    double d = 3.5;
    int i = d; //❌ Fordítási hiba.

    int i = (int) d;
    System.out.println(i); // Mindig a tizedespont jobb oldalát eldobja. output: 3

## Változónevek szabályai

📌 Változónév:

- nem kezdődhet számmal;
- kezdődhet betűvel, \_-al vagy $-al;
- camelCase ajánlott Java-ban, mert a változó és a függvényneveket kisbetűvel kezdjük.

Számmal soha nem kezdünk változó deklarálást.

    int 1stVariable; //❌ Nem jó!
    int st1Variable; //✅ Jó.

# Kasztolás

Az Object osztálytól örököli a metódusokat az osztályunk. pl.: .equals()

A primitívek speciálisak, az objektumok nem, azok minding ugyanúgy működnek.

### Helyes megoldások char → String konvertálásra

✅ 1. Konkatenáció (gyakori, egyszerű, inkább NE használd intrejún)

    String s = "" + first;

✅ 2. String.valueOf() (legbiztonságosabb)

    String s = String.valueOf(first);

✅ 3. Character.toString() (szabályos OOP megoldás)

    String s = Character.toString(first);

    //A Character örököl az Object osztálytól, de itt nem az Object toString() metódusa hívódik meg.
    //Hanem a Character.toString(char) statikus metódus.

# Wrapper (burkoló) osztályok

Java-ban a wrapper (burkoló) osztályok a primitív adattípusok objektum megfelelői.

Primitív típus → Wrapper osztály

boolean → Boolean  
byte → Byte  
short → Short  
int → Integer  
long → Long  
float → Float  
double → Double  
char → Character

Mire jók a wrapper osztályok?

- Objektumként kezelhetők (pl. kollekciókban: List, Map).
- Tartalmaznak hasznos metódusokat (pl. parseInt, valueOf).
- Lehetővé teszik az autoboxing / unboxing használatát.
- Könyebb velük bonyolultabb dolgokat elvégezni.

Példa (autoboxing)

    int x = 5;
    Integer y = x;      // autoboxing
    int z = y;          // unboxing

Példa az automatikus becsomagolásra.

    public static void main(String[] args) {
        int second = 2;

        test(second);
    }

    //A java automatikusan becsomagolja az int-et egy Integer objektumba, így lehet váltogatni, működik ugyanez fordítva is.
    public static void test(Integer c) {
        System.out.println(c);
    }

Példa a primitív és objektum másolásra:

Lemásolja az első értékét. **Primitív típus → érték másolódik.**

        int a = 1;
        int b = a; //
        b++;
        System.out.println(" a: " + a + " ; b: " + b);

Mindkét változó ugyanarra az objektumra mutat.  
setName("Fluffy") az egyetlen közös objektumot módosítja.

**Objektumoknál nem az objektum másolódik, csak a memóriacím(referencia).**

        Cat macska = new Cat(); //macska létrehoz egy Cat objektumot

        Cat macska2 = macska; //→ referencia másolása
        macska.setName("Fluffy");
        System.out.println(macska.getName() + " " + macska2.getName()); //output: Fluffy Fluffy

### Fordítási hiba ≠ futási hiba

❌ Fordítási hiba (compile-time error): A fordító (javac) nem tudja lefordítani a kódot. Pl.: hiányzik a pontosvessző, szintaktikai hiba.  
👉 A program el sem indul.

Példa:
double → int szűkítő (narrowing) konverzió  
Java nem engedi automatikusan az adatvesztéssel járó konverziót.

    double d = 3.5;
    int i = d; //❌ Fordítási hiba.

💥 Futási hiba (runtime error)  
👉 A program elindul, de futás közben elszáll.

Mikor történik?

- A kód szintaktikailag helyes.
- Logikai vagy környezeti probléma futás közben. pl.: 0-val való osztás.

Explicit kasztolás (cast)

    double d = 3.5;
    int i = (int) d;
    System.out.println(i); // Mindig a tizedespont jobb oldalát eldobja. output: 3

    System.out.println((int) 3.9);   // 3
    System.out.println((int) -3.9);  // -3

# Stack, Heap és Garbage Collector

A FIFO és LIFO adatszervezési elvek azt írják le, milyen sorrendben kerülnek ki az elemek egy tárolóból.

FIFO – First In, First Out „Aki először jött, először megy.”

LIFO – First In, Last Out „Aki először jött, utoljára megy.”  
Mint a nyomtatópapíroknál, ha eggyesével rakod be a papírokat a tárolóba. Íhy működik a verem, vagyis stack.

![alt text](/Assets/Stacks_and_Queues.png)

Példa:

    public class ElsoProject {
        public static void main(String[] args) {
            int i = 2;
            Object obj = new Object();
            ElsoProject ep = new ElsoProject(); //Osztály példányosítása.
            ep.proba(obj);

        }

        //Azért nem kell ide a static, mert példányosítottuk az osztályt.
        private void proba(Object param) {
            String str = param.toString();
            System.out.println(str); //Ennél a sornál már kikerült a lenti képen lévő proba, param és str a Stack-ből.
        }
    }

## Stack

Verem. Gyorsabb memória terület.

A Stack egy memóriaterület, ahol a program lokális változóit (int, double, boolean, stb.) és függvényhívások adatait tárolják.  
LIFO (Last In, First Out) elven működik – az utolsó elem, amit betettünk, az első, amit kiveszünk.

## Heap

Kupac.
A Heap a dinamikusan foglalt memória helye, ahová a program futás közben hoz létre objektumokat.

Maga az Objektum a Heapben tárolódik, a stack-ban, csak hivatkozunk rá.  
Minden, ami benne van egy osztályban az az objektum része, vagyis a Heap-ben tárolódik, az osztályváltozók (int, String) is.

![alt text](Assets/Stack_and_Heap.png)

Példa:

    public static void main(String[] args) {
        Object o1 = new Object();
        o1 = null;
        o1 = new Object(); //Ne ugyanaz, mint a két sorral feljebb lévő.

    }

    private void proba(Object param) {
    }

Mi történik?

- new Object()  
  → objektum létrejön a heapben

- o1  
  → hivatkozás, ami a stackben van (o1 = null;)  
  → a heapben lévő objektum címére mutat

## Garbage Collector (Szemétgyűjtő)

A Garbage Collector (GC) egy automatikus memória-kezelő mechanizmus, ami a Heap-en lévő, már nem használt objektumokat felszabadítja. Figyeli, hogy mely objektumokra már nincs hivatkozás (pl. minden változó, ami mutat rá, megszűnt). Eltávolítja ezeket a memória felszabadításához. Nem garantált azonnali felszabadítás.

# Környezet változók és a manuális fordítás

Új JDK letöltése: https://jdk.java.net/25/?utm_source

Win + S → "environment variables" → Edit the system environment variables.  
Itt láthatók a környezeti változók, amiket a géped használ.  
Kattints a Environment Variables… gombra.  
System variables alatt: kattints a New… gombra (vagy keresd a meglévőt, ha PATH-ról van szó).

Nyomj ráa Path-ra és add hozzá újként.

Például JDK beállításához:

- Variable name: JAVA_HOME
- Variable value: C:\Program Files\Java\jdk-25 (a te telepítési útvonalad szerint)

PATH módosítása (hogy a CMD felismerje a java és javac parancsokat):

Alatta lesz:

1. Keresd meg a Path változót → Edit → New → add:

    %JAVA_HOME%\bin

2. OK → OK → OK

3. CMD ellenőrzés

Nyisd meg a Command Prompt-ot (Win + R → cmd → Enter).

Írd be:

    java -version
    javac -version

Ha mindkettő verziót visszaad, sikeres a beállítás.

4. Java fájl futtatása

Navigálj a mappába:

    cd C:\útvonal\a\projektedhez

Futtasd:

    javac FajlNeve.java
    java FajlNeve

# Véletlen mondat generátor készítés

    public class SentenceGenerator {

        public static void main(String[] args) {
            Game game = new Game();
            System.out.println(game.generator());
        }
    }

    public class Game {

        public String generator() {
            String[] firstWord = {"Nagyon jó", "Megbízható", "Érdeklődő", "Szorgalmas", "Türelmes", "Tökéletes"};
            String[] secondWord = {"megoldás", "lehetőség", "kivitelezés"};
            String[] thirdWord = {"neked!", "nekünk!", "mindenkinek!", "az egész világnak!"};

            int oneLenght = firstWord.length;
            int secondLenght = secondWord.length;
            int thirdLenght = thirdWord.length;

            //Math.random() 0 0.999999 közötti számod ad vissza.
            int random1 = (int) (Math.random() * oneLenght);
            int random2 = (int) (Math.random() * secondLenght);
            int random3 = (int) (Math.random() * thirdLenght);

            //0.1 - generátor X 5 = 0.5
            //0.9 - generátor X 5 = 4.5
            //Mivel az (int) kasztolás leveszi a tizedes utáni értéket.
            //0-4 köz9tt értéket kapunk visza.
            String sentence = firstWord[(int) (Math.random() * firstWord.length)] + " " + secondWord[random2] + " " + thirdWord[random3];

            return sentence;

        }
    }

# Tömb vs. ArrayList

## Tömb (Array)

A tömb statikus, ha törölsz belőle egy elemet, akkor sem megy össze és meg kell adni az elején, hogy mekkora lesz.

Példák:

    String[] simpleArray0;  //Deklaráció.
    simpleArray0 = new String[]{"alma", "körte"};  //Nem kötelező egyből inicializálni. alma= 0. elem, körte= 1. elem
    System.out.println(simpleArray0[2]); //Ilyenkor még nem jelez hibát, hanem majd futási időben fog.

A tömb nem univerzálisan a leggyorsabb megoldás – a hatékonyság mindig attól függ, milyen műveleteket kell végrehajtani és milyen gyakran.

Röviden:

- Olvasás index alapján → tömb nagyon gyors
- Beszúrás / törlés → tömb gyakran lassú
- Keresés kulcs alapján → hash alapú struktúra gyorsabb
- Dinamikusan változó adatmennyiség → lista vagy más adatszerkezet előnyösebb

👉 A jó megoldás kiválasztása mindig a feladat jellegétől, az adatmérettől és a használati mintától függ, nem önmagában az adatszerkezettől.

A tömb tud tárolni primitíveket.

### Tömb értékadása

#### Deklarálás + értékadás egy sorban

    String[] simpleArray0 = new String[]{"alma", "körte"};

#### Deklarálás külön, értékadás később

    String[] simpleArray0 = new String[2];
    simpleArray0 = new String[]{"alma", "körte"};

#### Méret megadása, majd elemenkénti értékadás

    String[] simpleArray0 = new String[2];
        simpleArray0[0] = "alma";
        simpleArray0[1] = "körte";

#### Tömb újraértékadása (felülírás)

    simpleArray0 = new String[] {"banán", "barack"};

#### Értékadás ciklussal

    for (int i = 0; i < tomb.length; i++) {
        simpleArray0[i] = "elem " + i;
    }

## ArrayList

Az arraylist tudja változtatni a méretét és, csak objektumokat lehet bele rakni.
Fontos, hogy be kell importálni felül.

    import java.util.ArrayList;

    ArrayList<String> list = new ArrayList<>();
        //Az array tudja változtatni a méretét.
        list.add("alma");
        list.add("körte");

        list.remove(0);
        System.out.println("0. elem: " + list.get(0));
        list.size(); //output: 1

Nem tud tárolni primitíveket, csak wrapper osztályokat.

Például:

    ArrayList<Integer> list = new ArrayList<>();
    list.add(2); //int-t át tud konvertálni Integerré.

Az Array, vagyis a tömb tud multi dimenziós lenni, az ArrayList viszont nem.

    tomb[3][3];

# Az ArrayListek és a szülők kapcsolata

    public static void main(String[] args) {

        //Nem primitíveket, hanem objektumokat tárol.
        //Cat egy osztály → referencia típus.
        ArrayList<Cat> cats = new ArrayList<>();
        //Java 7+ verzióban elég a jobb oldalon az üres <>, a típus öröklődik a bal oldalról.

        //Régebben be kellett írni a jobb oldalra a Cat-et.
        //ArrayList<Cat> cats = new ArrayList<Cat>();

        Cat sziamiau = new Cat("Sziamiau");
        cats.add(sziamiau); //Ha ezt nem adjuk meg, akkor üres lesz az ArrayList.

        //Elkerüljük az IndexOutOfBoundsException-t hibát.
        if (!cats.isEmpty()) { //Ha nem üres.
            //cats.get(0) → visszaadja az első Cat referenciát. output: firstproject.Cat@1f32e575
            System.out.println("Neve: " + cats.get(0).getName()); //output: Sziamiau
        } else {
            System.out.println("Üres az ArrayList.");
        }

    }

## ArrayList használata az örökléssel

Ez a kód jól illusztrálja a polimorfizmust:

- Az ArrayList típusát az ősosztály adja.
- A konkrét objektum lehet leszármazott (Cat).
- A Cat osztály metódusai nem lesznek elérhetőek.

    public static void main(String[] args) {

                    //ArrayList létrehozása az ősosztály típusával.
                    //Animal az ősosztály, a Cat pedig egy leszármazott.
                    //Tárol objektumokat, nem primitíveket.
                    ArrayList<Animal> cats = new ArrayList<>();

                    //Ez lehetséges, mert minden Cat egy Animal, az öröklés miatt.
                    Cat sziamiau = new Cat("Sziamiau");
                    cats.add(sziamiau);

                    if (!cats.isEmpty()) { //Ha nem üres.
                        //cats.get(0) → visszaad egy Animal referenciát, ami valójában Cat típusú objektumra mutat.
                        System.out.println("Neve: " + cats.get(0).getName());
                    } else {
                        System.out.println("Üres az ArrayList.");
                    }

    }

## Osztály kasztolása

Cat osztályban:

public void purr() {
System.out.println("Dorombolok.");
}

    public static void main(String[] args) {
        //Polimorfizmus
        //cats listája Animal típusú referenciákat tárol.
        //Cat egy leszármazott osztály, ezért hozzáadható.
        //Az ArrayList viszont csak Animal referenciákat ismer,
        //így a Cat-hez speciális metódus (purr()) nem érhető el közvetlenül.

        ArrayList<Animal> cats = new ArrayList<>();
        Cat sziamiau = new Cat("Sziamiau");
        cats.add(sziamiau);

        //cats.get(0) visszaad egy Animal referenciát, ami valójában egy Cat objektum.
        //A kasztolás (Cat) lehetővé teszi, hogy a Cat-specifikus metódusokat meghívd.

        Cat cat = (Cat) cats.get(0);

        //Most már elérhető a Cat osztály saját metódusa (purr()), mert a referenciát Cat típusúvá alakítottuk.
        cat.purr(); //Dorombolok.
    }

## Object ősosztály használata

    public static void main(String[] args) {
        ArrayList<Object> cats = new ArrayList<>();
        Cat sziamiau = new Cat("Sziamiau");
        cats.add(sziamiau);

        Cat cat = (Cat) cats.get(0);
        cat.purr(); //Dorombolok.
    }

## Hibás kód és futásidőben kivételt fog dobni

    public static void main(String[] args) {
        ArrayList<Object> cats = new ArrayList<>();
        Dog morzsa = new Dog();
        Cat sziamiau = new Cat("Sziamiau");
        cats.add(sziamiau);
        cats.add(morzsa);

        Cat cat = (Cat) cats.get(0);

        //cats.get(1) egy Dog, nem lehet Cat típusra kasztolni.
        Cat cat2 = (Cat) cats.get(1);

        cat2.purr();
    }

# Mit hagyott ránk az Object?

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat sziamiau = new Cat("Sziamiau");

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        //Amikor összehasonlítunk két objektumot,
        //akkor gyakorlatilag a háttérben a két hashcode-t hasonlítjuk össze.
        System.out.println(o1.hashCode() + " " + o2.hashCode() + " " + o3.hashCode());
        //Egyedi azonosítószáma. output: 523429237 664740647 523429237

        System.out.println(o1.equals(o3)); // output: true

        System.out.println(sziamiau.getClass()); // output: class firstproject.Cat
    }

## instanceof

    //Akkor fut le, ha az első elem példánya a Cat osztálnak.
        if (cats.get(1) instanceof Cat) {
            Cat cat = (Cat) cats.get(1);
            cat.purr();
        }

## toString()

    public static void main(String[] args) {
        ArrayList<Animal> cats = new ArrayList<>();
        Cat sziamiau = new Cat("Sziamiau");
        cats.add(sziamiau);
        Dog morzsi = new Dog();

        Integer a = 2;

        String something = a.toString();
        System.out.println(a); // output: 2
        System.out.println(sziamiau.toString()); // output: firstproject.Cat@279f2327
    }

A fenti példa módosítása:
A Cat osztályban:

    @Override
    public String toString() {
        return "Macska vagyok, a nevem: " + this.getName();
    }

A Mainben:

    System.out.println(sziamiau.toString()); // output: Macska vagyok, a nevem: Sziamiau

# Immutable, Final és Static

## Immutable

Megváltoztathatatlan.

String: A String egy immutable class, vagyis megváltoztathatatlan és a Heap-en belül a String Poolban van tárolva.

Mi a különbség a lenti két inicializáció között?

Röviden: memóriahasználatban, objektumok számában és referencia-azonosságban különböznek.

    String a = "Hello!"; // String Poolban lévő String objektumra mutat.
    /*
    ✔️ Mit történik itt?
    A "Hello!" egy String literál.
    A Java a literálokat a String Constant Poolban (String Pool) tárolja.
    A String Pool a Heap memórián belül található (Java 7 óta).
    Ha már létezne "Hello!" a poolban, akkor a arra a meglévő objektumra mutatna.
    */

    String c = new String("Hello"); // Heapben van.

    /*✔️ Mit történik itt?
    A "Hello" literál először bekerül a String Poolba (ha még nem volt ott).
    A new String("Hello") mindig létrehoz egy új String objektumot a Heapben, a poolon kívül.
    c erre az új objektumra mutat, nem a poolban lévőre.
    👉 Tehát:
    String Pool: "Hello"
    Heap (külön objektum): new String("Hello")
    */

    System.out.println(a == c); //== referenciát hasonlít; output: false

### Mikre figyelj egy immutable class létrehozásakor!

//Final kulcszó legyen ott az osztály deklarálásakor.
public final class Dog extends Animal {

        //Legyen egy final változója.
        final private int size;

        //Konstruktor.
        public Dog() {
            size = 0;
        }

        //Konstruktor, amivel lehet a változó értékét beállítani és nem kell neki setter.
        public Dog(int size) {
            this.size = size;
        }
    }

## final

Ez egy immutable class. =Megváltoztathatatlan.
final: A Dog osztály nem terjeszthető ki. Nem lehet a kutyának alfaja.
A metódusait nem lehet felülírni, mert final az osztály.

    public final class Dog extends Animal {

        //A final változó értékét nem lehet megváltoztatni.
        final private int size;

        public void bark() {
        }

        public Dog() {
            size = 0;
        }

        public Dog(int size) {
            this.size = size;
        }

        public void getSize() {
            System.out.println(size);
        }
    }

Main-ben:
Dog dog1 = new Dog();
dog1.getSize(); // output: 0

        Dog dog2 = new Dog(5);
        dog2.getSize(); // output: 5

Ha kiterjeszthető lenne a Dog osztály, nem lenne final és írunk bele egy final metódust, akkor azt nem lehetne felülírni.

# static

## static metódus

Ha egy osztálynak van statikus metódusa, akkor az példányosítás nélkül meghívható, mert az osztályhoz tartozik, nem az objektumhoz.

pl.: Math.random();

Másik példa:
A Dog osztályos belül van:
public static void bark() {
System.out.println("Bark");
}

Main-ben:

    public static void main(String[] args) {
        Dog.bark(); // Nem kellett példányosítani az osztályt, mert a metódus statikus.
    }

### static osztály

Egy top-level osztályt nem lehet static-ként deklarálni, csak belső (inner / nested) osztály lehet static.

### static változó

A statikus változó: az osztályhoz tartozik minden példány közösen használja egyetlen példányban létezik.

Main-ben:

public static void main(String[] args) {
Cat cat1 = new Cat();
Cat cat2 = new Cat();

        //Az objectCount az osztályhoz tartozik, nem az objektumhoz.
        //Ezért statikus változót mindig az osztály nevével érünk el.
        System.out.println(Cat.objectCount); //output: 2
    }

Cat osztály:

    public class Cat extends Animal {

        //Ezzel megtudjuk számolni, hogy hány objektum készült el.
        // //Mindegyik példány osztozik ezen a statikus változón.
        public static int objectCount;

        //Konstruktor, ha nem hozod létre, akkor az IDE automatikusan létrehozza.
        //Amikor létre jön az objektum, akkor automatikusan lefut.
        public Cat() {
            objectCount++;

        }
    }

# Diagramok és Kapcsolatok

**Public:**  
Mindenhonnan elérhető (bármely package-ből, bármely osztályból).

**Protected:**  
 Elérhető azonos package-en belül (mint a default), más package-ből csak leszármazott (subclass) osztályból érhető el.

**Private:**  
 Csak az adott osztályon belül elérhető. Még a leszármazott osztály sem éri el.

**Abstact:**  
 Nem access modifier, hanem osztály/metódus jellemző. Nem lehet példányosítani, de kiterjeszteni lehet (extends).

**Default / package-private:**  
 Ha nincs kiírva. Csak az adott package-en belül elérhető, még subclass esetén sem. NEM protected.

![alt text](Assets/class_types.png)

## Diagramok

Létre lehet hozni UML, vagy osztály diagramot. Hasonlít egy adatbázis kapcsolati ábrára, de nem ugyanaz (viselkedést is mutat).

Has it. Vagy Is it. Nem mindegyik, hogy mi-miből van leszármaztatva.

### „Is-a” kapcsolat (öröklés – inheritance)

👉 Leszármazás.

Szabály:
A leszármazott osztály „egy fajta” a szülőből.

### Has-a” kapcsolat (összetétel / tartalmazás)

👉 Egy osztály tartalmaz egy másikat.

Szabály:
Az egyik objektumnak van egy másik objektuma.

# Kivételek kezelése - Try Catch Finally

## Throwable (Előfordulható hibák/Elkapható problémák)

A Throwable az összes eldobható objektum alapja a Java-ban.

Két fő típusa van:

### Error (Hiba)

Példa: OutOfMemoryError, StackOverflowError

Jellemzők:

- Súlyos problémák a JVM működésében.
- Nem kell kezelni, általában nem tudod helyrehozni a programból.
- Rendszer-szintű súlyos hibák, amiket az alkalmazás szinten általában nem kezelünk.
- Unchecked, runtime hiba.

### Exception (Kivétel)

- Példa: IOException, SQLException, NullPointerException

Két fő kategória:

#### Exception-n belül: Checked Exceptions (ellenőrzött kivételek)

Példa: IOException, FileNotFoundException

Jellemzők:

- Compile-time ellenőrzés → a fordító figyelmeztet, ha nem kezeled.
- Meg kell oldani: try-catch blokkal, vagy throws kulcsszóval tovább dobni.

Használati eset: amikor a hiba előre látható, pl. fájl olvasása, hálózati kommunikáció.

#### Exception-n belül: Unchecked Exceptions (ellenőrzés nélküli kivételek)

Példa: NullPointerException, ArrayIndexOutOfBoundsException

Jellemzők:

- Runtime exceptions → futásidőben jelentkeznek.
- Nem kötelező kezelni, a fordító nem kéri.

Használati eset: programhibák, logikai hibák, pl. nem inicializált változó használata.

## Példák

### Checked Exceptions

Első példa:

    try {
        byte a = 300;
        //Ha nem sikerül ezt lefutattni, akkor az exception részre ugrik a program.
    } catch (Exception e) {
        System.out.println("Kivétel: " + e); //Kiíratjuk a hibaüzenetet.
    }

Második példa:

    public static void main(String[] args) {
        File file = new File("C://file.txt");
        try (//A try-catch-t automatikusan hoztam létre az IDE segítségével.
                // A FileReader sora eljén kattints a villanykörtére -> surround try-catch.
                FileReader fr = new FileReader(file)) {
        } catch (IOException e) {
            System.out.println(e);
        } finally { //A finally-t nem kötelező megadni.
            // Ez mindenképpen le fut, akár lefutott a try, vagy nem, akár lefutott a catch, vagy nem.
            // Ez mindenkéépen lefut.
            System.out.println("Mindenképpen ez ki lesz írva.");
        }
    }

### Unchecked Exceptions

ArrayIndexOutOfBoundsException

    int num[] = {1, 2, 3, 4, 5};
    System.out.println(num[6]);

NullPointerException

    Cat cat = new Cat();
    if (cat.getName().equals("Aladár")) {
    }

Ezzel is le lehet ellenőrizni, hogy egyenlőe nullával.

    if (cat != null && cat.getName() != null) {
        }

InputMismatchException

pl.: Számot kérünk be, de a felhasználó szöveget ad meg.

    if (sc.hasNextInt()) {
        grade = sc.nextInt();
    } else {
        System.out.println("Nem számot adtál meg!");
        sc.next();
    }

Vagy

    try{

    } catch (InputMismatchException e) {
        System.out.println("Nem számot adtál meg!");
        sc.next(); // hibás input eldobása
    }

### Eldobjuk a hibát

Ha egy kis rész programban nem szeretnéd lekezelni a hibát, akkor megteheted azt, hogy dobod.

Példa:

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileReader;

    public class ElsoProject {

        //Ökölszabály: Osztályon belül statikus metódusból nem hívhatunk meg nem statikus metódust.
        public static void main(String[] args) {
            try {
                test();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        private static void test() throws FileNotFoundException {
            File file = new File("C://file.txt"); //FileNotFoundException
            FileReader fr = new FileReader(file);
            //A FileReader sora eljén kattints a villanykörtére -> Add throws declaration

        }

# Inner és Anonim Class

# Adatbekérés a felhasználótól

import java.util.Scanner; //Import az osztály létrehozása előtt.

Scanner scanner = new Scanner(System.in); //Szkenner osztály példányosítása a használathoz.

String data=scanner.nextLine(); //Egy sor beolvasása.

scanner.nextDouble()
scanner.nextBoolean()
scanner.nextInt()

# Példák

## Elágazások

    System.out.println("Adj meg egy életkort, és írd kiírom, hogy kiskorú, felnőtt vagy nyugdíjas-e!");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if (18 <= age && age < 65) {
        System.out.println("Felnőtt");
    } else if (age < 18) {
        System.out.println("Kiskorú");
    } else {
        System.out.println("Nyugdíjas");
    }

## For ciklus és tömbök, valamint kasztolás

    System.out.println("Adj meg három számot vesszővel elválasztva, és kiírom, melyik a legnagyobb!");
    Scanner sc = new Scanner(System.in);
    String numbers = sc.nextLine();

    String[] numbers2 = numbers.split(",");

    int max = Integer.parseInt(numbers2[0]); //Negatív számok esetén, nem jó a 0.

    for (int i = 0; i < numbers2.length; i++) {
        //Integer.parseInt() -> Kasztolás.
        //trim() -> Leszedi a szóközöket.
        max = Math.max(Integer.parseInt(numbers2[i].trim()), max);
     }

    System.out.println("A legnagyobb szám: " + max);

## Switch-case

A switch nem feltételeket, hanem konkrét értékeket vizsgál; tartományok ellenőrzésére if–else szerkezetet használunk.

    //Csak egyszer fut le.
    Scanner sc = new Scanner(System.in);
    System.out.println("Adj meg egy érdemjegyet (1-5-ig), \n és kiírom szövegesen az eredményt (elégtelen, jeles, stb).");

    //Leellenőrizzük, hogy tuti számot adott-e meg a felhasználó.
    if (sc.hasNextInt()) {
        int grade = sc.nextInt();

        switch (grade) {
            case 1:
                System.out.println("Elégtelen.");
                break;
            case 2:
                System.out.println("Elégséges.");
                break;
            case 3:
                System.out.println("Közepes.");
                break;
            case 4:
                System.out.println("Jó.");
                break;
            case 5:
                System.out.println("Jeles.");
                break;
            default:
                System.out.println("1 és 5 között adj meg egy számot.");
        }
        sc.close();

    } else {
        System.out.println("Nem számot adtál meg.");
    }

### Másik megoldás (Java 14+ switch expression és do-while)

    Scanner sc = new Scanner(System.in);
    int grade;

    do {
        System.out.print("Adj meg egy érdemjegyet (1–5): ");

        if (!sc.hasNextInt()) { //Nem számot adott meg a felhasználó.
            System.out.println("Nem számot adtál meg!");
            sc.next(); // hibás input eldobása
            grade = 0; // biztosan rossz érték
            continue; //Hagyd abba a ciklus aktuális körét, és ugorj a következőre.
        }

        grade = sc.nextInt();

        if (grade < 1 || grade > 5) {
            System.out.println("Hibás érték! 1 és 5 között add meg.");
        }

    } while (grade < 1 || grade > 5);

    // Java 14+ switch expression
    switch (grade) {
        case 1 ->
            System.out.println("Elégtelen."); //A break-t sem kell kiírni.
        case 2 ->
            System.out.println("Elégséges.");
        case 3 ->
            System.out.println("Közepes.");
        case 4 ->
            System.out.println("Jó.");
        case 5 ->
            System.out.println("Jeles.");
    }

    sc.close();

## Do-while és if elágazás

    Scanner sc = new Scanner(System.in);

        int number;

        do {
            System.out.println("Adj meg egy számot, ami 1 és 10 között van.");

            if (!sc.hasNextInt()) {
                System.out.println("Hibás érték, próbáld újra!");
                sc.next(); // hibás input eldobása
                number = 0; // A do-while végén a number értékét vizsgálom, ezért a fordító kötelezően
                            // inicializáltnak akarja látni.
                continue;// Ezzel nem csak egyszer dobja vissza a felhasználónak az újra beírás
                         // lehetőségét. Kiírja újra a do-while második sorát is.
            }
            // A vizsgálat után adjuk meg a változónak az értéket.
            number = sc.nextInt();

            // Logikai vizsgálat.
            if (number < 1 || number > 10) {
                System.out.println("Túl nagy vagy túl kicsi az érték. \n Újra!");
            }
        } while (number < 1 || number > 10);
        System.out.println("Jó a szám, 1 és 10 között van!");

# Java Dinamikus weboldal létrehozása

[Első projekt létrehozásához](https://www.youtube.com/watch?v=RAJI9GfPs2g)

Eclipse IDE for Enterprise Java and Web Developers
Ha, csak Java Developer van az, se gond, akkor be kell állítani ezt:
Servlet API hozzáadása a projekthez manuálisan

Menj a Tomcat mappádba, pl. C:\apache-tomcat-9.0.80\lib

Ott találod: servlet-api.jar (és esetleg jsp-api.jar)

Eclipse-ben:

Jobb klikk a projektre → Properties → Java Build Path → Libraries → Add External JARs…

Tallózd be a servlet-api.jar-t → OK

Most már a import javax.servlet.\*; működni fog

Tomcat szerver:
[Tomcat Server](https://tomcat.apache.org/download-10.cgi)
Binary -> Core verzió

Ha hiányzik a .class fájl a build mappából, akkor Eclipse -> Project → Clean

_Ha nem működik a servlet:_
Window → Show View → Servers
Alul megjelenik a szerver panel.
Tomcat v10.1 Server at localhost
→ Right click -> Clean ->Aztán Publish -> Aztán Restart.

Render.com-on Dockerrel kell deployolnod, mert Render nem tud közvetlenül WAR fájlokat futtatni Tomcat nélkül.

# Gyakorlás gyakorlás gyakorlás

[Gyakorló feladatok / Programozás részen](https://infojegyzet.hu/vizsgafeladatok/)

[Interaktív tesztek a programozáshoz](https://infojegyzet.hu/vizsgafeladatok/szoftverfejleszto-interaktiv/teszt/?tesztkod=K31G-MZYR)

# Map

## Főbb különbségek összefoglalva

```bash
| Tulajdonság         | HashMap                             | LinkedHashMap                                  | TreeMap                                               |
| ------------------- | ----------------------------------- | ---------------------------------------------- | ----------------------------------------------------- |
| **Sorrend**         | Nincs garantált sorrend.            | A hozzáadás sorrendjét követi.                 | Természetes sorrend (pl. ABC) vagy egyedi Comparator. |
| **Belső felépítés** | Hash tábla (Hashtable).             | Hash tábla + Duplán láncolt lista.             | Piros-fekete fa (Red-Black Tree).                     |
| **Gyorsaság**       | A leggyorsabb (O(1)).               | Kicsit lassabb a lista miatt, de gyors (O(1)). | Lassabb (O(log n)).                                   |
| **Null kulcs**      | Egy darab `null` kulcs megengedett. | Egy darab `null` kulcs megengedett.            | **Nem enged meg** `null` kulcsot (hibát dob).         |
```

---

## 1. HashMap

Ez a leggyakrabban használt Map. Akkor használd, ha a **teljesítmény a legfontosabb**, és egyáltalán nem számít, hogy az elemek milyen sorrendben jönnek ki belőle.

- **Működése:** Hashing technikát használ.
- **Előnye:** Nagyon gyors keresés, beszúrás és törlés.

## 2. LinkedHashMap

Olyan, mint a HashMap, de "emlékszik" arra, hogy milyen sorrendben adtad hozzá az elemeket.

- **Működése:** Fenntart egy duplán láncolt listát az elemek között.
- **Előnye:** Ha végigiterálsz rajta, pontosan abban a sorrendben kapod vissza az elemeket, ahogy betetted őket. Kiváló gyorsítótárak (cache) készítéséhez.

## 3. TreeMap

Ez a Map **mindig rendezve van**.

- **Működése:** Egy fa struktúrát épít fel.
- **Előnye:** Az elemeket automatikusan sorba rendezi a kulcsok alapján (például számoknál növekvő sorrend, szövegeknél ABC). Ha szükséged van arra, hogy a kulcsaid mindig rendezettek legyenek, ez a jó választás.

---

### Melyiket válaszd?

> - **HashMap:** Ha csak gyorsan akarsz tárolni és lekérdezni, és nem érdekel a sorrend.
> - **LinkedHashMap:** Ha fontos, hogy "ki volt az első", vagyis a hozzáadási sorrend számít.
> - **TreeMap:** Ha azt akarod, hogy a Map-ed mindig ABC vagy számszerinti sorrendben legyen.

**Egy fontos megjegyzés:** Mivel a `TreeMap` folyamatosan rendezi magát minden beszúrásnál, ez a leginkább erőforrás-igényes a három közül.

# Java Stream API Gyorssegéd

```bash
| Szint         | Művelet                  | Leírás |
| :---          | :---                     | :---   |
| **1. FORRÁS** | `.stream()`              | Elindítja a folyamatot. (**KÖTELEZŐ**) |
| **2. KÖZTES** | `.filter(x -> ...)`      | Szűrés (csak az marad, ami TRUE). |
| (Bármennyi    | `.map(x -> x.get...)`    | Átalakítás (pl. objektumból csak egy String). |
| lehet)        | `.sorted()`              | Sorba rendezés. |
|               | `.distinct()`            | Ismétlődések törlése. |
|               | `.limit(n)`              | Csak az első *n* darab elemet hagyja meg. |
| **3. LEZÁRÓ** | `.count()`               | Megszámolja az elemeket. (Eredmény: `long`) |
| (Csak EGY     | `.forEach(x -> ...)`     | Művelet minden elemen (pl. kiírás). (Eredmény: `void`) |
| lehet a végén!) | `.toList()`             | Új listába gyűjt. (Eredmény: `List<T>`) |
|               | `.anyMatch(x -> ...)`    | Van-e legalább egy ilyen? (Eredmény: `boolean`) |
|               | `.findFirst()`           | Visszaadja a legelsőt. (Eredmény: `Optional<T>`) |
```

---

## Példák a használatra

### 1. Megszámolás

_Hány meccs volt Madridban?_

```java
long db = lista.stream()
               .filter(x -> x.getHelyszin().equals("Madrid"))
               .count();
```
