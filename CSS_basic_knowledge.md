# CSS stílusok a weboldalakhoz

# Tartalomjegyzék
- [CSS stílusok a weboldalakhoz](#css-stílusok-a-weboldalakhoz)
- [Tartalomjegyzék](#tartalomjegyzék)
- [Forrásaim](#forrásaim)
- [Alapok](#alapok)
- [Szelektor (Selector)](#szelektor-selector)
- [Modern CSS](#modern-css)
- [Media Query helyett if](#media-query-helyett-if)
  - [Pszeudó (pseudeo)](#pszeudó-pseudeo)
- [Tailwind telepítése:](#tailwind-telepítése)

# Forrásaim
https://www.w3schools.com/css/default.asp
https://www.w3schools.com/htmlcss/default.asp
[100+ Web Development Things you Should Know](https://youtu.be/erEgovG9WBs?si=vEFXO3P_WufyaR-C)



# Alapok

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

# Szelektor (Selector)

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
