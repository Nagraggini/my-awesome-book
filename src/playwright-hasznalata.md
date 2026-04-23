# Playwright

**Mi az a Playwright?**

Playwright egy nyílt forráskódú (open-source) eszköz, amely:
- automatizálja a webes alkalmazások tesztelését,
- támogatja a több böngészőt (Chromium, Firefox, WebKit),
- több nyelven is használható: JavaScript, TypeScript, Python, Java, C#.

Fő előnye a Seleniumhoz képest:
 Gyorsabb, stabilabb és könnyebb párhuzamosan futtatni a teszteket.

# Telepítés + workflow beállítása

Példa:
https://github.com/Streptopelia-risoria/restful_booker_platform_demo

Terminálba: npm init playwright@latest
JavaScript -> tests -> GitHub Actions yes -> Install Playwright browsers? yes

Egy test mappád legyen, akár kicsi akár nagy betűs. 
Ezután a playwright.config.js-ben csekold le ezt: testDir: './tests',


**Így indítsd el a "Kattintgatós" módot**

Live Server-en indítsd el az oldalt.

Kattints a bal oldali sávban a Testing (lombik) ikonra.

Az alsó részen keresd meg a "Record new" gombot.

Ekkor a Playwright megnyit egy üres böngészőt és egy "Playwright Inspector" ablakot.

Írd be a címsorba a helyi weboldalad címét (pl. http://127.0.0.1:5500).

Kezdj el kattintgatni: vegyél fel egy új questet, pipáld ki, töröld le stb.

Látni fogod, hogy az Inspector ablakban automatikusan generálódik a kód.

Ha végeztél, csak zárd be a böngészőt, és a VS Code-ban ott lesz az új tesztfájl a kész kóddal!
Bal oldalt frissítsd a test explorert és nyisd le a test részt ott láthatod az imént felvitt tesztedet. 

**Tesztek futtatása**

Live Server-en indítsd el az oldalt.

Kattints a bal oldali sávban a Testing (lombik) ikonra.
A test melletti play ikonra kattints.

**GitHub Actions**

Ennek meg kell lennie:
.github/workflows/playwright.yml

A szóközöre és tabokra nagyon figyelj.

```yml
name: Playwright Tests
on:
  push:
    branches: [ main, master ] # Ha más a branch neve, akkor írd át.
  pull_request:
    branches: [ main, master ] # Ha más a branch neve, akkor írd át.
jobs:
  test:
    timeout-minutes: 60
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v4
    - uses: actions/setup-node@v4
      with:
        node-version: lts/*
    - name: Install dependencies
      run: npm ci
    - name: Install Playwright Browsers
      run: npx playwright install --with-deps
    - name: Run Playwright tests
      run: npx playwright test
    - uses: actions/upload-artifact@v4
      if: ${{ !cancelled() }}
      with:
        name: playwright-report
        path: playwright-report/
        retention-days: 30
```

Ez az útmutató, hogy mi alapján futtassa a GitHub a teszteket. 

Amikor a terminálban telepítetted a playwright-ot (npm init playwright@latest), akkor yes-t kellett nyomni a GitHub Action-s kérdésre.

A README-dbe felülre ezt másold be és persze írd be a felhasználónevet és a reponevét.
```bash
![Workflow neve](https://github.com/FELHASZNALONEV/REPO_NEVE/actions/workflows/playwright.yml/badge.svg)
```

## playwright.config.js

A GitHub Actions egy üres szerveren fut, ahol nincs elindítva a Live Server, ezért a playwright.config.js fájlba a lentit írd bele, amivel megmondjuk a Playwright-nak, hogy indítsa el a webszervert a tesztek előtt.

```javascript
export default defineConfig({

    use: { //Fontos, hogy ne duplikáld a use részt!
     //... korábbi sorok
        baseURL: "http://127.0.0.1:8080", // Így nem kell mindig beírni.
        actionTimeout: 10000, // 10 másodperc minden kattintásra/gépelésre
        navigationTimeout: 15000,

    // ... többi sorok
        trace: "on-first-retry",
    },

//... korábbi sorok
    /* Run your local dev server before starting the tests */
    webServer: {
        command: "npm run start",
        url: "http://127.0.0.1:8080",
        reuseExistingServer: !process.env.CI,
        stdout: 'ignore',
        stderr: 'pipe',
    },
// ... többi sor
});
```
A "projects: [..]" részen kommenteld ki a safarit és a firefox-ot, ha nem akarod a gépedre is telepíteni azokat.

## package.json

A gyökér könyvtárban lévő package.json-t ki kell egészíteni a playwright függőséggel:
```js
{
{
  }
 //... korábbi sorok 
  ,
  "devDependencies": {
    "@playwright/test": "^1.44.0"
  }
// ... többi sor
}
```

Valamint ennél:
```js
  "scripts": {},
```

Javítsd ki erre:
```js
"scripts": {
  "test": "npx playwright test",
  "start": "servor . 8080 --reload" 
} //Duplikálni nem szabad.
```

Fontos , hogy a port számnak mindenhol egyeznie kell.

Terminálba: npm install --save-dev servor

Ezek után még csekkold le, hogy tuti nem a live servert akarja használni playwright.
Terminálba írd be ezt: npx playwright test

Ha hiba van írd be ezt: npx playwright show-report
Meg tudod nézni részletesen a hibát.

Ezután jöhet a commitolás a master/main-be. "Add GitHub Actions workflow" címmel.

Ezután a GitHub-on az adott reponál az Actions lapfülön láthatod, hogy sikerült-e a teszt.

**Teljes teszthez**

Terminálban: 
Ezzel csak a chromium típusú böngészőben futtatod a tesztet.
npx playwright test --project=chromium

npm run start

Miután elindult minden a leállításhoz a terminálban nyomd meg a ctrl+C-t.
npx playwright test

Többi hasznos terminál parancs a teszteléshez:
npx playwright test --ui
npx playwright test --debug

# Telepítés + workflow nélkül

Lépj bele a terminálban a mappába ahova a tesztet szeretnéd.

Írd be a projekt nevét. pl.: for-test
Framework: vanilla aztán javascript

Terminálba:
npm init playwright@latest

A zárójelben lévőket válaszold a terminál kérdéseire.
js (egyet le és enter), marad a test mappa (tab és enter), no github workflow (n), yes extension (y)

Egy test mappád legyen, akár kicsi akár nagy betűs.
Ezután a playwright.config.js-ben csekold le ezt: testDir: './tests',

# Hasznos linkek a gyakorláshoz

https://playwright.dev/docs/intro
https://the-internet.herokuapp.com/     
http://uitestingplayground.com/

# Első teszt felvételéhez

Bal oldalt válaszd ki a lombik ikont.

TOOLS (Eszközök)
Pick locator: Ez a legpraktikusabb. Kattints rá, menj át a böngészőbe, és mutass rá az egérrel egy elemre (pl. a gombra vagy combo boxra). A VS Code-ban azonnal megjelenik a kód, amivel az adott elemet eléred.
Record new: Elindít egy üres tesztet és egy böngészőt. Amit a böngészőben csinálsz, azt élőben kódként rögzíti egy új fájlba.
Record at cursor: Ugyanaz, mint az előző, de nem új fájlt nyit, hanem a meglévő kódodba, a kurzor pozíciójához szúrja be az új lépéseket.

A fájlnevének mindig , így kell kinéznie: valami.spec.ts

Terminálba: npx playwright codegen


# Futtatás

Bal oldalt üvegcse ikon és Debug Test

Vagy

npx playwright test --ui
npx playwright test --debug


# Jelszó beállítás

.env fájlbe írd be e felhasználónevet és jelszet.

A gitignore-ba meg, hogy ".env" ezt nem kell verziókezelés alávonni. A package.json mellé rakd.

Terminálba:
npm install dotenv --save-dev


# Minta


```ts
import { test, expect } from "@playwright/test";
import * as dotenv from "dotenv";
dotenv.config(); // Betölti a .env fájl tartalmát


test("Google.hu", async ({ browser }) => {
  const context = await browser.newContext({
    httpCredentials: {
      username: process.env.SITE_USER || "", // A .env-ből olvassa
      password: process.env.SITE_PASS || "", // A .env-ből olvassa
    },
  });
  const page = await context.newPage();
  await page.goto("google.hu");
});
```


