# Teszt automatizálás

## Ezeket használják manapság

Playwright (nagyon modern, Udemy-n jó kurzusok vannak)
Cypress (frontend fókuszú)
Ranorex  -Az oldala kifejetezzen segít: support.ranorex.com + (Udemy)
Automatizált Teszt Keretrendszer (ATF)

## Selenium

A Selenium-ot érdemes először kezdőként használni és után tovább menni a bonyolultabbak felé.

### Selenium alapfogalmak

**Selenium WebDriver**

- Programozható tesztautomatizálási eszköz.
- Támogatja a legtöbb böngészőt (Chrome, Firefox, Edge stb.).
- Több nyelven is használható: Java, Python, C#, JavaScript stb.
- Fejlesztők és tesztelők írhatnak benne automatizált funkcionális/regressziós teszteket.


**Selenium Grid**

- Lehetővé teszi a párhuzamos tesztfuttatást több gépen és böngészőn.
- Hasznos, ha sok tesztet kell rövid idő alatt lefuttatni.
- Két fő része van:
    Hub: Központ, ami elosztja a feladatokat.
    Node-ok: A gépek, ahol a tesztek ténylegesen futnak.


Selenium tesztek típusai
1. Rögzítés és visszajátszás (Record & Playback)
   
- Ezt a funkciót a Selenium IDE biztosítja.
- A felhasználói műveleteket automatikusan rögzíti (kattintás, beírás, navigáció stb.).
- Utána visszajátszható, így gyorsan lehet egyszerű teszteket készíteni.
- Nem igényel programozási tudást, de kevésbé rugalmas.


2. Programozott tesztelés (WebDriver)
   
- Itt kódban írjuk meg a teszteket.
- Rugalmas, skálázható, integrálható CI/CD folyamatokba (pl. Jenkins).

Assert -> Ha a feltétel nem teljesül, a teszt megáll. -> Kritikus ellenőrzésekhez
Verify -> Ha a feltétel nem teljesül, a teszt tovább fut, de jelzi a hibát. -> Nem kritikus hibákhoz

**Selenese**

A Selenium IDE saját nyelve/parancskészlete.
Egyszerű parancsokat használ, pl.: open, click, type, verifyText
Támogat kommenteket is (pl. // jellel).

