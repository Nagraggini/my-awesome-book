const input = document.getElementById("number");
const userNumber = Number(input.value);

console.log(userNumber); // "6"
console.log(typeof userNumber); // number

/*Ez a JavaScript kód dinamikusan frissíti egy HTML oldalon az aktuális évet egy elemben,
     jellemzően lábjegyzetekben vagy copyright szövegekben, így nem kell kézzel módosítani minden év elején.*/

document.addEventListener("DOMContentLoaded", function () {
  const yearEl = document.getElementById("year");
  if (yearEl) yearEl.textContent = new Date().getFullYear();
});