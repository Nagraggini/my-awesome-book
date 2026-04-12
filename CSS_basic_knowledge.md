# CSS stílusok a weboldalakhoz

# Tartalomjegyzék
- [CSS stílusok a weboldalakhoz](#css-stílusok-a-weboldalakhoz)
- [Tartalomjegyzék](#tartalomjegyzék)
- [Forrásaim](#forrásaim)
- [Alapok](#alapok)
- [Futtatás](#futtatás)
- [F12](#f12)
- [Modern CSS](#modern-css)
- [Media Query helyett if](#media-query-helyett-if)
  - [Pszeudó (pseudeo)](#pszeudó-pseudeo)
- [Régebbi böngészők](#régebbi-böngészők)
- [Tailwind telepítése:](#tailwind-telepítése)

# Forrásaim
https://www.w3schools.com/css/default.asp
https://www.w3schools.com/htmlcss/default.asp
[100+ Web Development Things you Should Know](https://youtu.be/erEgovG9WBs?si=vEFXO3P_WufyaR-C)



# Alapok

A tartalmakhoz adunk stílust a css-el. Bizonyos korlátokon belül lehet némi interaktivitást is csinálni css-el pl.: egérműveleteknél, színváltoztatás. Interaktivitás fokozásához javascriptre van szükség.


Ezekkel játékosan meg lehet tanulni a CSS használatát: 
https://flexboxfroggy.com/#hu
https://cssgridgarden.com/#hu

[Itt](https://codepen.io/) tudsz gyakorolni.
CSS magyarázatok és interaktív példákat [itt](https://www.w3schools.com/css/default.asp) találsz, valamint [itt](https://www.w3schools.com/htmlcss/default.asp).

![CSS szintaktika](/assets/CSS/css-sytax.png)

```css
body {
  background-color: lightblue;
}

h1 {
  color: white;
  text-align: center;
}

p {
  font-family: verdana;
  font-size: 20px;
}

/*Univerzális szelektor.*/
*{

}
```

Ezeket együtt érdemes használni:
```css
    display: flex;
    flex-direction: column;
    align-items: center; /*Ezt együtt kell használni pl.: flex/grid-el*/
```

# Futtatás

VC Code-ban töltsd le a Live Servert. Bal oldalt az Explorerben kattints jobb klikkel az adott html fájlodra -> Open with Live Server. Rögtön elindul a böngésződben a http://127.0.0.1:5500/ -on a weboldalad.

Ctrl+F5 csodákra képes, ha épp valami nem töltene be, pedig már lekódoltad.

# F12

Futtatáskor az F12-t nyomd meg a böngészőben, válaszd a kis nyíl ikont (kijelölő), és kattints egy adott részre amit ellenőrizni szeretnél. A böngésző narancssárgával jelzi a margót (margin) és zölddel a párnázást (padding). Így pontosan látni fogod, melyik elem "tolja" el a másikat!

Felül a kis nyíl mellett van az eszköz váltó, vagyis meg tudod nézni, hogy telón hogyan néz ki. Akár fel is tudod venni a telefonodat is: Bal felül Dimension melletti nyílra katt -> Edit -> Add custom device -> Add meg a telefonod nevét és pixelben a magasságát és szélességét (Ha nem tudod kérdezd meg az AI-t.) Device pixel ratio:3 -> Save.

Application -> Storare bal oldalt -> Local storage -> Itt látod az elmentett adatokat (JS-ben localStorage-el tudsz menteni.), ha vannak.

#Extra szelektor (Selector)

html

```html
<h2>Continents 🗺️</h2>
<ul>
  <li>Africa</li>
  <li>Antarctica</li>
  <li>Asia</li>
  <li>Australia</li>
  <li>Europe</li>
  <li>North America</li>
  <li>South America</li>
</ul>

<h2>Oceans By Size 🌊</h2>
<ol>
  <li>Pacific</li>
  <li>Atlantic</li>
  <li>Indian</li>
  <li>Antarctic/Southern</li>
  <li>Arctic</li>
</ol>
```
css
```css
ul > li { 
    /* Csak azokra az elemekre érvényes, amelyek közvetlenül az ul alatt vannak, nem mélyebben, vagyis jeleneseben, csak az elsőre.   */
  border: 1px solid;
  width: 50px;
}
```

[Ez](https://specifishity.com/specifishity.pdf) az egyik legjobb magyarázat a css szelektorokra.


# Modern CSS

# Media Query helyett if

https://www.youtube.com/watch?v=THvg9DQPs94&list=WL&index=18

max-width:767px

max-width: 1024px


## Pszeudó (pseudeo)

Modern verzió a pszeudóra:
1. ::before és ::after

Többit [itt](https://www.codedex.io/css/bonus/pseudo-elements-in-css) találod. 

Modern 

```css
/*A :has() segítségével megváltoztathatod egy eleme stílusát attól függően, hogy mi van benne. De ez, csak akkor működik, ha nem a js-ben van a módosítás. :( */
h2:has(.Andi) {
    background-color: rgba(255, 255, 255, 0.716);
    color: white;
}
```

---

# Régebbi böngészők

Sok régi böngésző nem támogatja a modern css-t. Emiatt érdemes a css-auto-prefix vs code kiegészítőt letölteni.

# Tailwind telepítése: 

Terminálban: 

//Ellenőrizd Node.js és npm verziót. node 16+ az ajánlott.
node -v
npm -v

//Ha nincs, akkor.
npm install

//Projekt gyökerében hozd létre a package.json-t (ha még nincs)
npm init -y

//Telepítsd Tailwind-et fejlesztői függőségként
npm install -D tailwindcss@3

//Ha már van telepítve, vagy problémák vannak, érdemes törölni a node_modules-t és a lock fájlt:
rm -rf node_modules package-lock.json
npm install

//Tailwind konfiguráció létrehozása. Ez létrehozza a tailwind.config.js fájlt.
npx tailwindcss init

//Ha akarod, a -p kapcsolóval rögtön létrehozza a PostCSS configot is:
npx tailwindcss init -p

CSS fájl elkészítése

CSS:
A src/main/resources/static/css/input.css legyen így:
@tailwind base;
@tailwind components;
@tailwind utilities;

HTML:
<link rel="stylesheet" href="/css/output.css">

Le kell buildelni a css fájlt:
npx tailwindcss -i ./src/main/resources/static/css/input.css -o ./src/main/resources/static/css/output.css --watch

---
