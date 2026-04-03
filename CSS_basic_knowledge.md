html


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

css

ul > li { 
    /* Csak azokra az elemekre érvényes, amelyek közvetlenül az ul alatt vannak, nem mélyebben, vagyis jeleneseben, csak az elsőre.   */
  border: 1px solid;
  width: 50px;
}

# CSS

moder verzió a pszeudóra:
1. ::before és ::after

Többi: https://www.codedex.io/css/bonus/pseudo-elements-in-css


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
```css
/*A :has() segítségével megváltoztathatod egy eleme stílusát attól függően, hogy mi van benne. De ez, csak akkor működik, ha nem a js-ben van a módosítás. :( */
h2:has(.Andi) {
    background-color: rgba(255, 255, 255, 0.716);
    color: white;
}
```