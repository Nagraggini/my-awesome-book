# Tartalomjegyzék

- [Tartalomjegyzék](#tartalomjegyzék)
- [Playwright](#playwright)
- [Videós kurzusok](#videós-kurzusok)
- [Telepítés](#telepítés)
  - [Projekt létrehozása + workflow nélkül](#projekt-létrehozása--workflow-nélkül)
    - [Workflow](#workflow)
- [ESLint beállítása](#eslint-beállítása)
- [Saját weboldal tesztelése](#saját-weboldal-tesztelése)
  - [playwright.config.js](#playwrightconfigjs)
  - [package.json](#packagejson)
- [Első teszt](#első-teszt)
  - [Record and play](#record-and-play)
  - [Részletesebben elmagyarázva az első teszt](#részletesebben-elmagyarázva-az-első-teszt)
- [Futtatás](#futtatás)
- [Jelszó beállítása környezeti változóként](#jelszó-beállítása-környezeti-változóként)
  - [Minta](#minta)
- [Jelszó beállítása JSON-ként](#jelszó-beállítása-json-ként)
- [Tracer View](#tracer-view)
  - [Fail esetén készít egy trace.zip-et](#fail-esetén-készít-egy-tracezip-et)
  - [Egy konkrét teszt esetén készít egy trace.zip-et](#egy-konkrét-teszt-esetén-készít-egy-tracezip-et)
- [Inspector használata](#inspector-használata)
- [Névnélküli függvény lambda kifejezéssel](#névnélküli-függvény-lambda-kifejezéssel)
- [3 db egyszerűbb Login Test](#3-db-egyszerűbb-login-test)
- [Lokátorok](#lokátorok)
- [1. Felhasználó-központú lokátorok (Ajánlott kezdetnek!)](#1-felhasználó-központú-lokátorok-ajánlott-kezdetnek)
    - [`getByText()`](#getbytext)
    - [`getByRole()`](#getbyrole)
    - [`getByLabel()`](#getbylabel)
    - [`getByPlaceholder()`](#getbyplaceholder)
- [2. Hagyományos lokátorok](#2-hagyományos-lokátorok)
  - [CSS Selector](#css-selector)
    - [XPath](#xpath)
    - [Abszolút XPath](#abszolút-xpath)
    - [Relatív XPath](#relatív-xpath)
    - [XPath Tengelyek (Axes)](#xpath-tengelyek-axes)
    - [Gyakorló oldal](#gyakorló-oldal)
  - [3. A lokátorok szűkítése és láncolása (Chaining \& Filtering)](#3-a-lokátorok-szűkítése-és-láncolása-chaining--filtering)
    - [Alapvető láncolás (Chaining)](#alapvető-láncolás-chaining)
    - [Lista elemeinek kiválasztása index alapján](#lista-elemeinek-kiválasztása-index-alapján)
      - [`.first()`](#first)
      - [`.last()`](#last)
      - [`.nth(index)`](#nthindex)
    - [Haladó szűrés: `.filter()`](#haladó-szűrés-filter)
      - [Szűrés szöveg alapján (`hasText`)](#szűrés-szöveg-alapján-hastext)
      - [Szűrés belső elem alapján (`has`)](#szűrés-belső-elem-alapján-has)
- [4. Példa a gyakorlatban (Kódminta)](#4-példa-a-gyakorlatban-kódminta)
- [Billentyűzet események](#billentyűzet-események)
- [Egér események](#egér-események)
- [Assertions + soft (Ellenőrzések)](#assertions--soft-ellenőrzések)
- [Videó rögzítés (lassított felvétel) és képernyőkép](#videó-rögzítés-lassított-felvétel-és-képernyőkép)
  - [Konkrét tesztnél készít csak videót](#konkrét-tesztnél-készít-csak-videót)
- [Step](#step)
- [Hooks and Groups](#hooks-and-groups)
- [Annotation \& Tags](#annotation--tags)
  - [Annotációk](#annotációk)
  - [Saját annotációk](#saját-annotációk)
  - [Tagek](#tagek)
- [POM (Új projekt)](#pom-új-projekt)
- [Fixtures és oldalváltás](#fixtures-és-oldalváltás)
  - [Egy konkrét tesztben így kell váltogatni a lapfülek között](#egy-konkrét-tesztben-így-kell-váltogatni-a-lapfülek-között)
- [Canvas](#canvas)
- [Page Chaining (Oldal láncolás)](#page-chaining-oldal-láncolás)
- [Report feltöltésének automatizálása Azure DevOps-al](#report-feltöltésének-automatizálása-azure-devops-al)
- [Best practices](#best-practices)
- [Valós skálázható projekt (Real World Scalable Project)](#valós-skálázható-projekt-real-world-scalable-project)
  - [JSON fájl használata](#json-fájl-használata)
  - [CSV fájl használata](#csv-fájl-használata)
  - [XLSX fájl használata](#xlsx-fájl-használata)
  - [Multi funkcionális adatbeolvasás (json, csv,excel) - Ezt használd!](#multi-funkcionális-adatbeolvasás-json-csvexcel---ezt-használd)

# Playwright

**Mi az a Playwright?**

Playwright egy nyílt forráskódú (open-source) eszköz, amely:

- automatizálja a webes alkalmazások tesztelését,
- támogatja a több böngészőt (Chromium, Firefox, WebKit),
- több nyelven is használható: JavaScript, TypeScript, Python, Java, C#.

Fő előnye a Seleniumhoz képest:
Gyorsabb, stabilabb és könnyebb párhuzamosan futtatni a teszteket.

# Videós kurzusok

[Playwright Beginner Tutorials](https://www.youtube.com/playlist?list=PLhW3qG5bs-L9sJKoT1LC5grGT77sfW0Z8)

[Playwright TypeScript Tutorial for Beginners](https://www.youtube.com/playlist?list=PLhW3qG5bs-L_Zb8perf54eF_W1_W2-WZQ)

[Playwright Javascript Tutorial](https://www.youtube.com/playlist?app=desktop&list=PLYDwWPRvXB89caN5PHWDLrXJuyugu5Mg_)

# Telepítés

[Visual Studio Code](https://code.visualstudio.com/)

[Playwright Test for VSCode](https://marketplace.visualstudio.com/items?itemName=ms-playwright.playwright)

[Node.js](https://nodejs.org/en)

[Git](https://git-scm.com/install/)

[Verziókezelő program - Git Fork](https://git-fork.com/)

Engedélyezni kell, hogy a rendszer ne tiltsa le a szkriptek futtatását ezzel:
Powershellben rendszergazdaként: Set-ExecutionPolicy RemoteSigned -Scope CurrentUser

Terminálba:
npx playwright install

Ellenőrzés terminálban:
node -v
npm -v

Ha kiírja mindkettő után a verzió számokat, akkor sikeres volt a telepítés.

## Projekt létrehozása + workflow nélkül

Lépj bele a terminálban a mappába ahova a tesztet szeretnéd.

A mappa egyben a projekt neve lesz. pl.: for-test
A verzió követést, úgy tudod beállítani, hogy beírod a terminálba, miután beléptél a mappába,hogy "git init".

Playwright projekt létrehozása:
Terminálba: `npm init playwright@latest`

A zárójelben lévőket válaszold a terminál kérdéseire.
Do you want to use TypeScript or JavaScript? Typescript (enter),
Where to put your end-to-end tests? Marad a test mappa az alap értelmezett (tab és enter). Fontos, hogy csak egy test mappád legyen.
Add a GitHub Actions workflow? (n) // Ha szeretéd, hogy automatikusan lefussanak a tesztek, amikor commitolsz, akkor y-t válaszd.
Install Playwright browsers? (y)

Példa:
https://github.com/Streptopelia-risoria/restful_booker_platform_demo

Ha nyilvános projekt, akkor ezt érdemes beállítani:
https://app.codacy.com/ -n adjuk hozzá a repot, hogy elemezze a kódot, amit írunk. Figyelmeztet és kb tutorként segít, hogy ne legyen spagetti kód.

### Workflow

Ha kéne workflow, hogy a GitHub Actions automatikusan elindítsa a teszteket, amikor commitolsz, akkor a lentieket állítsd be.

**GitHub Actions**

Ennek meg kell lennie:
.github/workflows/playwright.yml

A szóközöre és tabokra nagyon figyelj.

```yml
name: Playwright Tests
on:
  push:
    branches: [main, master] # Ha más a branch neve, akkor írd át.
  pull_request:
    branches: [main, master] # Ha más a branch neve, akkor írd át.
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

Amikor a terminálban telepítetted a playwright-ot (`npm init playwright@latest`), akkor yes-t kellett nyomni a GitHub Action-s kérdésre, de a fenti workflow-al ezt tudod bepótolni.

A workflow eredményét, hogy passed/failed megtudod jeleníteni a README-dben. Felülre ezt másold be és persze írd át a felhasználónevet és a reponevét.

```bash
![Workflow neve](https://github.com/FELHASZNALONEV/REPO_NEVE/actions/workflows/playwright.yml/badge.svg)
```

# ESLint beállítása

Terminálban futtasd ezt:
`npm install -D eslint-plugin-playwright`
`npm install -D typescript-eslint`

Konfigurációs fájl létrehozása:eslint.config.js.

Hozz létre egy eslint.config.js nevű fájlt a projekt gyökérmappájában, és illeszd bele ezt a kódot:

```js
import playwright from "eslint-plugin-playwright";
import tseslint from "typescript-eslint";

export default [
  ...tseslint.configs.recommended,
  {
    files: ["tests/**/*.ts", "tests/**/*.js"],
    ...playwright.configs["flat/recommended"],
    rules: {
      "playwright/no-wait-for-timeout": "warn",
    },
  },
];
```

Bővítmény letöltése. Ctrl+Shift+X és keress rá az ESLint-re.
[ESLint bővítmény letöltése](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint)

settings.json megnyitása:
A szerkesztő beállításai.Nyomd meg a Ctrl + Shift + P gombkombinációt a parancssor megnyitásához.
Kezd el gépelni: Preferences: Open User Settings (JSON) (vagy ha csak a projektre szeretnéd alkalmazni, akkor Open Workspace Settings (JSON)).Nyomd meg az Enter-t

Automatikus javítás beállítása:
Fájlmentési szabályok.Lásd el a megnyílt settings.json fájlt az alábbi beállításokkal (vagy illeszd be őket a meglévő JSON objektumon belülre):

```json
{
  // Mentéskor automatikusan lefutnak az ESLint auto-fix szabályai
  "editor.codeActionsOnSave": {
    "source.fixAll.eslint": "always"
  },
  // Jelzi az ESLint-nek, hogy a TypeScript és JavaScript fájlokat is ellenőrizze
  "eslint.validate": [
    "javascript",
    "javascriptreact",
    "typescript",
    "typescriptreact"
  ]
}
```

Futtatás: `npx eslint tests/`

# Saját weboldal tesztelése

A lenti beállításokat, akkor kell megcsinálnod, ha a saját weboldaladat hostolod és azt akarod tesztelni.

## playwright.config.js

A GitHub Actions egy üres szerveren fut, ahol nincs elindítva a Live Server, ezért a playwright.config.js fájlba a lentit írd bele, amivel megmondjuk a Playwright-nak, hogy indítsa el a webszervert a tesztek előtt.

```javascript
export default defineConfig({
  use: {
    //Fontos, hogy ne duplikáld a use részt!
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
    stdout: "ignore",
    stderr: "pipe",
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

Terminálba: `npm install --save-dev servor`

Ezek után még csekkold le, hogy tuti nem a live servert akarja használni playwright.
Terminálba írd be ezt: `npx playwright test`

Ha hiba van írd be ezt: `npx playwright show-report`
Meg tudod nézni részletesen a hibát.

Ezután jöhet a commitolás a master/main-be. "Add GitHub Actions workflow" címmel.

Ezután a GitHub-on az adott reponál az Actions lapfülön láthatod, hogy sikerült-e a teszt.

**Teljes teszthez**

Terminálban:
Ezzel csak a chromium típusú böngészőben futtatod a tesztet.
`npx playwright test --project=chromium`

`npm run start`

Miután elindult minden a leállításhoz a terminálban nyomd meg a ctrl+C-t.
`npx playwright test`

Többi hasznos terminál parancs a teszteléshez:
`npx playwright test --ui`
`npx playwright test --debug`

# Első teszt

## Record and play

Bal oldalt válaszd ki a lombik ikont.

TOOLS (Eszközök)

Pick locator: Ez a legpraktikusabb. Kattints rá, menj át a böngészőbe, és mutass rá az egérrel egy elemre (pl. a gombra vagy combo boxra). A VS Code-ban azonnal megjelenik a kód, amivel az adott elemet eléred.  
Record new: Elindít egy üres tesztet és egy böngészőt. Amit a böngészőben csinálsz, azt élőben kódként rögzíti egy új fájlba. Látni fogod, hogy az Inspector ablakban automatikusan generálódik a kód.  
Ha végeztél, csak zárd be a böngészőt, és a VS Code-ban ott lesz az új tesztfájl a kész kóddal!
Bal oldalt frissítsd a test explorert és nyisd le a test részt ott láthatod az imént felvitt tesztedet.

Record at cursor: Ugyanaz, mint az előző, de nem új fájlt nyit, hanem a meglévő kódodba, a kurzor pozíciójához szúrja be az új lépéseket.

A fájlnevének mindig , így kell kinéznie: valami.spec.ts

Terminálba: `npx playwright codegen`

## Részletesebben elmagyarázva az első teszt

my_first_test.spec.ts:

```ts
import { test, expect } from "@playwright/test";

/*
import { hello, helloworld } from './demo/hello';


console.log(hello());
console.log(helloworld());

// Futtatás terminálban:
// npx playwright test tests/my_first_test.spec.ts   

*/

/* async hozzáadása:
A Playwright tesztekben a böngésző automatizálásához (pl. kattintások, gépelés, oldalak betöltése) elengedhetetlen, hogy a tesztfüggvény aszinkron legyen.
*/
//Ha egy függvény elé odateszed az async szót, azzal jelzed a programnak, hogy ez a függvény "időigényes" feladatot fog végezni (pl. letölt egy weboldalt, vár a böngészőre). Az await-et, csak async metódusban lehet használni.
test("My First Test", async ({ page }) => {
  // Egy függvény (vagy művelet) elé írt await kulcsszó arra kényszeríti a kódot, hogy megvárja a Promise (ígéret) teljesülését.
  await page.goto("https://google.com");

  await expect(page).toHaveTitle("Google");
});
```

hello.js:

```js
exports.hello = function f1() {
  return "hello";
};

exports.helloworld = function f2() {
  return "hello word";
};
```

# Futtatás

Bal oldalt lombik ikon, aztán Play vagy Debug Test.

Vagy

Utána megjelenik a report automatikusan:
`npx playwright test`

`npx playwright test --ui`
`npx playwright test --debug`
`npx playwright test --project=galaxy-tab --headed`

Pl.: galaxy-tab -on, csak akkor tudsz tesztelni, ha be van állítva az eszköz a playwright.config.ts fájlban.

Ezzel csak a chromium típusú böngészőben futtatod a tesztet.
`npx playwright test --project=chromium`

Ez a parancs pontosan 3 párhuzamos worker folyamatot (Node.js processzt) indít el a Playwright tesztek futtatásához, felülbírálva a konfigurációs fájlban megadott alapértelmezett értéket:

`npx playwright test --workers 3`

Így látszik a böngésző is:
`npx playwright test --headed`

Ezzel megjelenik a Playwright Inspector ablak is:
`npx playwright test --debug`

Egy teszt futtatása (Nem kell végig írni a fájlt nevet elég a tabot és a jobbra nyilat nyomni.):
`npx playwright test tests/my_first_test.spec.ts --headed`

`npx playwright test tests/my_first_test.spec.ts`

Record and playhez (ellenőrzéseket is könyebb vele létrehoz az 'ab' gombbal):
`npx playwright codegen`
Utána másold ki és mentesd el egy fájlba.

Ezzel már rögtön meg is tudsz nyitni konkrét weboldalt:
`npx playwright codegen google.com`

Előre létre kell hozni a fájlt:
`npx playwright codegen --target typescript -o .\test\new_test.ts`

A fentieket egy sorban is lehet használni pl.:
`npx playwright test tests/my_first_test.spec.ts --headed --debug --project=chromium`

# Jelszó beállítása környezeti változóként

.env fájlbe írd be e felhasználónevet és jelszót.

A gitignore-ba meg, hogy ".env" be kell írni, hogy ezt nem kell verziókezelés alávonni. GitHub esetén érdemes a GitHub-on secret-et létrehozni és nem feltölteni a .env fájlt.

A .env fájlt a package.json mellé rakd.

.env fájlt tartalma

```.env
BASE_URL=https://example.com/
USERNAME=Admin
PASSWORD=admin
```

Gitignore fájl tartalma:

```.gitignore
# Playwright
node_modules/
/test-results/
/playwright-report/
/blob-report/
/playwright/.cache/
/playwright/.auth/
.env
```

Terminálba:
npm install dotenv --save-dev

playwright.config.ts fájlba:

```ts
// Felülre.
// Env fájl használatához kellenek.
import dotenv from "dotenv";
import path from "path";


// .env fájl betöltése
dotenv.config({ path: path.resolve(__dirname, ".env") });

// A use részre másold be ezt:

// Használhatod a BASE_URL-t közvetlenül a configban:
        baseURL: process.env.BASE_URL,

```

## Minta

```ts
import { test, expect } from "../fixtures/BaseTest";

test("Successful login test", async ({ page, loginPage, dashBoardPage }) => {
  await loginPage.gotoLoginPage();
  await loginPage.login(process.env.USERNAME!, process.env.PASSWORD!);
  await expect(dashBoardPage.fullNameLabel).toBeVisible();
  await dashBoardPage.logout();
});
```

# Jelszó beállítása JSON-ként

A gyökér könyvtárban hozz létre egy data mappát benne egy loginData.json fájllal.

data/loginData.json fájl tartalma:

```json
{
  "valid_user": {
    "username": "standard_user",
    "password": "secret_sauce"
  },
  "invalid_user": {
    "username": "locked_out_user",
    "password": "secret_sauce"
  }
}
```

A tesztekben így használt a felhasználónevet és a jelszót:

```ts
import { expect, test } from "@playwright/test";
import { LoginPage } from "../pages/LoginPage";
import loginData from "../data/loginData.json";

test("valid login test", async ({ page }) => {
  const loginPage = new LoginPage(page);

  await loginPage.gotoLoginPage();
  await loginPage.login(
    loginData.valid_user.username,
    loginData.valid_user.password,
  );

  await expect(page).toHaveURL("https://www.saucedemo.com/inventory.html");
});

test("invalid login test", async ({ page }) => {
  const loginPage = new LoginPage(page);

  await loginPage.gotoLoginPage();
  await loginPage.login(
    loginData.invalid_user.username,
    loginData.invalid_user.password,
  );

  await expect(loginPage.errorMessage).toBeVisible();
});
```

# Tracer View

## Fail esetén készít egy trace.zip-et

A `playwright.config.ts`-ben írd át a `trace: on-first-retry,` -t `trace: retain-on-failure,` -ra és így a test-results mappában lesznek trace.zip-ek.

Az automatikusan megnyitott report alján is láthatod a trace.zip-edet, katt rá.
A lap füleken meg nézheted az előtte és az utána képet és a forráskódot is láthatod.

Később így is megnyithatod a tracer view-t:
`npx playwright show-trace ./test-results/my_first_test-My-First-Test-chromium/trace.zip`

## Egy konkrét teszt esetén készít egy trace.zip-et

A `playwright.config.ts`-ben alapértelmezés szerint legyen beállítva a trace, vagyis `trace: 'on-first-retry',`.

```ts
import { test, expect } from "@playwright/test";

// 1. Csak a 'context' fixture-t kérjük el
test("SauceDemo", async ({ context }) => {
  // 2. Elindítjuk a tracinget a kontextuson
  await context.tracing.start({
    snapshots: true, // Pillanatképek rögzítése az akciókhoz
    screenshots: true, // Képernyőképek készítése
  });

  // 3. A kontextusból hozzuk létre a page objektumot
  const page = await context.newPage();

  await page.goto("https://www.saucedemo.com/");

  await page.locator('[data-test="username"]').click();
  await page.locator('[data-test="username"]').fill("standard_user");

  await page.locator('[data-test="password"]').click();
  await page.locator('[data-test="password"]').fill("secret_sauce");

  await page.locator('[data-test="login-button"]').click();

  await page.getByRole("button", { name: "Open Menu" }).click();

  await page.locator('[data-test="logout-sidebar-link"]').click();

  await expect(page).toHaveURL("https://www.saucedemo.com/");

  // 4. Trace leállítás
  await context.tracing.stop({ path: "test-trace.zip" });
});
```

Így tudod megnézni a Tracer`npx playwright show-trace ./test-trace.zip`

Általában ezeket egy közös `BaseTest.ts`-be szokták rakni, így:

```ts
let context;
let page;

test.beforeAll(async ({ browser }) => {
  context = await browser.newContext();

  await context.tracing.start({
    snapshots: true, // Pillanatképek rögzítése az akciókhoz
    screenshots: true, // Képernyőképek készítése
  });
  page = await context.newPage();
});

test.afterAll(async ({ browser }) => {
  await context.tracing.stop({ path: "test-trace.zip" });
});
```

# Inspector használata

Így lehet szüneteltetni a tesztet.

```ts
await page.pause();
```

Terminálba:

npx playwright test ./tests/login_demo.spec.ts --project chromium --headed

Assert-t, vagyis ellenőrzéseket is létre lehet hozni, valamint a 'Pick locator'-al lehet lokátort is keresni.

'Record' gombbal lehet a felvételt elindítani és utána ki kell másolni a generált kódot a testbe.

selectors.spec.ts:

```ts
import { test, expect } from "@playwright/test";

test("Selectors Demo", async ({ page }) => {
  await page.goto("https://www.saucedemo.com/");
  await page.pause();
  // npx playwright test ./tests/selectors.spec.ts --project chromium --headed

  // Jobb klikk az adott komponensen és Inspect
  // F12-n jobb klikk az adott kompenensen és copy -> Copy selector

  // using any object property
  await page.click("id=user-name");
  await page.locator("id=user-name").fill("Edison");
  await page.locator("[id=user-name]").fill("E");

  // using CSS Selector
  await page.locator("#login-button").click();

  //using Xpath
  await page.locator('xpath=//input[@name="password"]').fill("Freddy");
  await page.locator('//input[@name="password"]').fill("Raman");

  // using Text
  await page.locator("text=LOGIN").click();
  await page.locator('input:has-text("Login")').click();
});
```

# Névnélküli függvény lambda kifejezéssel

A lambda kifejezés (más néven nyíl függvény vagy arrow function) nem más, mint egy gyorsítósáv a függvények írásához.

Ahelyett, hogy hosszan gépelnél, egy () => szimbólummal azonnal létrehozhatsz egy függvényt.

1. Mit jelent az, hogy „Névnélküli”?

A hagyományos függvényeknek szokott lenni neve, hogy később újra elő tudjuk őket hívni (mint egy receptet a szakácskönyvből):

```js
// Hagyományos, nevesített függvény:
function udvozles() {
  console.log("Szia!");
}
```

A névnélküli (anonim) függvénynek nincs neve. Azért nincs rá szükség, mert ott helyben, azonnal felhasználjuk, és soha többé nem akarunk rá hivatkozni máshol. Olyan, mint egy eldobható papírpohár.

2. Hogyan jön ide a nyíl => (lambda)?

A modern JavaScriptben a function szócska helyett bevezették a nyíl (=>) jelölést, mert sokkal rövidebb.Nézzük meg ugyanazt a névnélküli függvényt a régi és az új (lambda) módszerrel:

Régi módszer (név nélkül):

```js
function() { ... kód ... }
```

Új, lambdás módszer (név nélkül):

```js
javascript() => { ... kód ... }
```

3. Hogyan működik ez a tesztünkben?

A Playwright teszted valójában így néz ki:

```js
test("Demo Login Test 1", async ({ page }) => { ... });
```

Ez a sor azt mondja a Playwrightnak: „Szia! Kérlek futtasd el ezt a tesztet 'Demo Login Test 1' néven. És hogy mit csináljon a teszt? Itt van ez a névnélküli függvény (a nyíllal), ebbe csomagoltam bele a lépéseket, ezt hajtsd végre!”

- A () zárójelbe mennek a bemeneti adatok (esetedben a { page }).

- A => nyíl mutatja, hogy „ebből az adatból ez a kód fog lefutni”.

- A { } kapcsos zárójelek közé pedig magát a tesztet írod.

# 3 db egyszerűbb Login Test

login_demo.spec.ts:

```ts
import { test, expect } from "@playwright/test";

test("Demo Login Test 1", async ({ page }) => {
  await page.goto("https://demo.applitools.com/");

  await page.pause();

  /* Terminálba:
     npx playwright test ./tests/login_demo.spec.ts --project chromium --headed
     */

  await page.getByRole("textbox", { name: "Enter your username" }).fill("Jane");
  await page
    .getByRole("textbox", { name: "Enter your password" })
    .fill("Secret password");

  // 5 másodpercet várunk a gombra.
  await page.waitForSelector("text=Sign in", { timeout: 5000 });

  // Pontosan egy darab ilyen gombnak kell lennie.
  await expect(page.locator("text=Sign in")).toHaveCount(1);
});

test("Demo Login Test 2", async ({ page }) => {
  await page.goto(
    "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",
  );

  await page.pause();

  await page.getByRole("textbox", { name: "Username" }).fill("Admin");

  await page.getByRole("textbox", { name: "Password" }).fill("admin123");
  await page.getByRole("button", { name: "Login" }).click();

  await page.locator("span").filter({ hasText: "John Doe" }).click();
  await page.getByRole("menuitem", { name: "Logout" }).click();
});

// only: Csak ez a teszt fog lefutni.
test.only("Demo Login Test 3", async ({ page }) => {
  await page.goto("https://admin-demo.nopcommerce.com/admin/");

  await page.pause();

  await page
    .getByRole("textbox", { name: "Email:" })
    .fill("admin@yourstore.com");

  await page.getByRole("textbox", { name: "Password:" }).fill("admin");
  await page.getByRole("button", { name: "Log in" }).click();

  // Utána Cloudflare botvédelem jelenik meg.
  await page.close();
});
```

# Lokátorok

A Playwright lokátorok (locators) olyan objektumok, amelyek megmondják a Playwrightnak, hogy pontosan melyik HTML elemmel (gomb, beviteli mező, szöveg stb.) szeretne interakcióba lépni a weboldalon.

A Playwright lokátorok egyik legnagyobb előnye, hogy automatikusan bevárják (auto-wait) az elemet. Ez azt jelenti, hogy a Playwright ellenőrzi, hogy az elem látható és kattintható-e, mielőtt bármit is csinálna vele.

Íme a legfontosabb lokátortípusok és azok magyarázata a könnyebb megértéshez.

Stabilitási sorrend: id > cssSelector > xpath

---

# 1. Felhasználó-központú lokátorok (Ajánlott kezdetnek!)

A Playwright arra ösztönöz, hogy úgy keressünk elemeket, ahogyan egy ember látja azokat a képernyőn, nem pedig bonyolult technikai leírások alapján.

### `getByText()`

Szöveg alapján keresi az elemeket a képernyőn.

- **Példa:** `await page.getByText('Bejelentkezés')`

### `getByRole()`

Szerepkör (gomb, jelölőnégyzet, űrlap, fejléc) és a hozzá tartozó felirat alapján keres. Ez a legbiztonságosabb és leginkább hozzáférhető (accessibility) módszer.

- **Példa:** `await page.getByRole('button', { name: 'Mentés' })`

### `getByLabel()`

Címke (label) alapján keres beviteli mezőket.

- **Példa:** `await page.getByLabel('Jelszó')`

### `getByPlaceholder()`

A beviteli mezőkben halványan látható, kitöltést segítő szöveg alapján keres.

- **Példa:** `await page.getByPlaceholder('Email cím')`

---

# 2. Hagyományos lokátorok

Ha a fenti, felhasználó-központú módszerekkel nem boldogulunk (pl. mert az elemnek nincs felirata), használhatjuk a webfejlesztésben megszokott hagyományos módszereket.

## CSS Selector

Szelekciós nyelvet alkalmazó lokátorok. A `page.locator('css-szelektor')` metódussal használjuk (osztálynév `.`, vagy azonosító `#`). Ha egy elemnek több osztálya van és a HTML-ben szóköz választja el őket, a szelektorban pontot kell tenni a szóközök helyére (pl. `class="btn primary"` -> `.btn.primary`).

- **Példa:** `await page.locator('.high-light-text')`

Ugyanazt a nyelvet használja, mint a CSS az elemek formázására:

- `#` $\rightarrow$ ID alapján
- `.` $\rightarrow$ osztály (class) alapján
- `[attribútum='érték']` $\rightarrow$ attribútum alapján
- `tag.class` $\rightarrow$ tag + osztály kombinációja
- `<szóköz>` $\rightarrow$ leszármazott (bármilyen mélységben)
- `>` $\rightarrow$ közvetlen leszármazott (gyermek elem)
- `*='<érték>'` $\rightarrow$ attribútumot tartalmazza (részleges egyezés)
- `^=` $\rightarrow$ az attribútum értéke ezzel kezdődik
- `$=` $\rightarrow$ az attribútum értéke ezzel végződik

**Hátránya:** Nem tud a DOM struktúrában visszafelé (felfelé, a szülő irányába) l

### XPath

### Abszolút XPath

Egyetlen / -el kezdődik.

_Működése:_ A dokumentum legfelső gyökerétől (a gyökérelemtől) indul, és pontosan leköveti a teljes hierarchikus utat a célelemig.

_Hátránya:_ Nagyon törékeny. Ha a HTML/XML struktúrában bárhol beszúrnak vagy eltávolítanak egy köztes elemet (pl. egy új `<div>`-et), a teljes útvonal érvénytelen lesz, és a teszt vagy lekérdezés elromlik.

### Relatív XPath

A `page.locator('xpath=//...')` vagy egyszerűen `page.locator('//...')` kifejezésekkel használjuk. Ezt akkor érdemes alkalmazni, ha egyedi logikára van szükség, de a bonyolultsága miatt érdemes kerülni, ha van egyszerűbb megoldás.

- **Példa:** `await page.locator('//button[@id="submit-btn"]')`

Útvonal alapú lekérdező nyelv, segítségével a DOM-ban adhatunk meg logikai útvonalat a HTML hierarchikus szerkezetét kihasználva. A dokumentum bármely pontján képes keresni az elemet, függetlenül attól, hogy az hol helyezkedik a DOM fában. Közvetlenül megcélozhatjuk a keresett elemet attribútumok (pl. `id`, `class`) vagy szöveg alapján.

- **Erőssége:** Ha nincs egyedi azonosító, akkor is stabil útvonalat biztosít az elemek egymáshoz képesti kapcsolatain keresztül.
- Képes a dokumentum struktúrájában minden irányban mozogni (felfelé és lefelé is).

**Kulcsjelei:**

- `/` $\rightarrow$ közvetlen útvonal (gyermek)
- `//` $\rightarrow$ bárhol a dokumentumban (leszármazott)
- `@` $\rightarrow$ attribútum jelölése
- `[]` $\rightarrow$ feltételek, szűrések helye
- `.` $\rightarrow$ aktuális elem
- `..` $\rightarrow$ szülő elem
- `*` $\rightarrow$ bármely elem (wildcard)
- `text()` $\rightarrow$ csak a közvetlen szöveges tartalom. (Van, amikor a `.` jobb, mert az a teljes elem beágyazott szövegeire is keres).
- `contains()` $\rightarrow$ részleges egyezés vizsgálata
- `=` $\rightarrow$ pontos egyezés vizsgálata
- `starts-with()` $\rightarrow$ az érték valamilyen szöveggel kezdődik
- `normalize-space()` $\rightarrow$ eltávolítja a szöveg elejéről és végéről a felesleges szóközöket, tabulátorokat és újsorokat, a szövegen belüli halmozott szóközöket pedig egyetlen szóközzé alakítja. (Különösen hasznos rendezetlen forráskódú weboldalak kaparásánál a pontos egyezések vizsgálatához).
- _Megjegyzés:_ Az `ends-with()` az XPath 2.0+ része, a böngészők által használt.

### XPath Tengelyek (Axes)

| Tengely (Axis)        | Jelentés                      | Mire jó?                                  |
| :-------------------- | :---------------------------- | :---------------------------------------- |
| `parent::`            | szülő elem                    | egy szintet feljebb lép                   |
| `ancestor::`          | bármely ős elem               | pl.: egy nagyobb blokk keresése           |
| `child::`             | közvetlen leszármazott        | Lefelé történő navigáció egy szinttel     |
| `descendant::`        | bármely mélységű leszármazott | Lefelé történő bármely mélységű navigáció |
| `following-sibling::` | következő testvér elem        | formok                                    |
| `preceding-sibling::` | előző testvér elem            | formok                                    |

---

### Gyakorló oldal

https://testsmith-io.github.io/locator-game/

## 3. A lokátorok szűkítése és láncolása (Chaining & Filtering)

Gyakran előfordul, hogy egy weboldal több azonos tulajdonságú elemet is tartalmaz (például egy lista elemei vagy egy táblázat sorai). Ilyenkor a lokátorokat tovább lehet szűkíteni a megfelelő metódusok egymás után fűzésével.

### Alapvető láncolás (Chaining)

A lokátorokat egyszerűen egymás után kötheted, így a Playwright a második elemet már csak az első elemen **belül** fogja keresni.

- **Példa:** `await page.locator('#nav-bar').getByRole('button', { name: 'Kijelentkezés' }).click();`

### Lista elemeinek kiválasztása index alapján

#### `.first()`

Csak a találati lista legelső elemét választja ki.

- **Példa:** `await page.locator('.product-item').first().click();`

#### `.last()`

Csak a találati lista legutolsó elemét választja ki.

- **Példa:** `await page.locator('.product-item').last().click();`

#### `.nth(index)`

Sorszám alapján választja ki az elemet. **Fontos:** A számozás 0-tól indul, így a `.nth(0)` az első elemet, a `.nth(1)` a másodikat jelenti.

- **Példa:** `await page.locator('.product-item').nth(2).click();` _(A 3. termékre kattint)_

### Haladó szűrés: `.filter()`

A `.filter()` metódus segítségével egy meglévő lokátor-listát szűkíthetsz tovább a belső tulajdonságaik alapján.

#### Szűrés szöveg alapján (`hasText`)

Csak azokat az elemeket tartja meg, amelyek (vagy amelyek gyermekelemei) tartalmazzák a megadott szöveget.

- **Példa:** `await page.locator('.row').filter({ hasText: 'Aktív' }).click();`

#### Szűrés belső elem alapján (`has`)

Csak azokat az elemeket tartja meg, amelyek belsejében megtalálható egy másik, megadott lokátor (pl. egy gomb, ikon vagy jelölőnégyzet).

- **Példa:** `await page.locator('.card').filter({ has: page.getByRole('button', { name: 'Törlés' }) }).click();` _(Csak azt a kártyát választja ki, amin van Törlés gomb)_

# 4. Példa a gyakorlatban (Kódminta)

Így néz ki a lokátorok használata a tesztkódban, beágyazva a megfelelő műveletekkel:

```ts
javascriptimport { test, expect } from '@playwright/test';


test("Lokátorok használata", async ({ page }) => {
  await page.goto("https://pelda-oldal.hu");


  // 1. Kattintás a 'Regisztráció' szöveget tartalmazó linkre/gombra
  await page.getByText("Regisztráció").click();


  // 2. Beviteli mező kitöltése a placeholder alapján
  await page.getByPlaceholder("Felhasználónév").fill("Almafa12");


  // 3. Kattintás a 'Mentés' feliratú gombra
  await page.getByRole("button", { name: "Mentés" }).click();


  // 4. Ellenőrzés: A sikeres üzenet látható-e
  await expect(page.locator(".success-message")).toHaveText("Sikeres mentés!");
});
```

# Billentyűzet események

```ts
import { test, expect } from "@playwright/test";

test("Billentyűzet események és kombinációk tesztelése", async ({ page }) => {
  // 1. Oldal betöltése és fókuszálás egy beviteli mezőre
  await page.goto("https://example.com");
  const input = page.locator("#username");
  await input.focus();

  // 2. Egyszerű gombnyomás (Alfanumerikus gombok)
  await page.keyboard.press("a");
  await page.keyboard.press("1");

  // 3. Navigációs és Szerkesztő billentyűk
  await page.keyboard.press("Tab"); // Fókusz a következő elemre
  await page.keyboard.press("Backspace"); // Utolsó karakter törlése
  await page.keyboard.press("Enter"); // Űrlap elküldése / Nyugtázás
  await page.keyboard.press("Escape"); // Modális ablak bezárása

  // 4. Nyíl billentyűk (Pl. legördülő menükhöz vagy egyéni komponensekhez)
  await page.keyboard.press("ArrowDown");
  await page.keyboard.press("ArrowUp");

  // 5. Oldalnavigáció
  await page.keyboard.press("PageDown"); // Görgetés lefelé
  await page.keyboard.press("End"); // Oldal legaljára ugrás

  // 6. Módosító billentyűk és kombinációk (Ctrl + A, majd Ctrl + C)
  // macOS esetén a "Control" helyett a "Meta" (Command) billentyűt kell használni
  const modifier = process.platform === "darwin" ? "Meta" : "Control";

  await page.keyboard.down(modifier); // Lenyomva tartás
  await page.keyboard.press("a"); // Mindent kijelöl
  await page.keyboard.press("c"); // Másolás vágólapra
  await page.keyboard.up(modifier); // Felengedés

  // 7. Kombináció egyetlen lépésben (Rövidített Playwright szintaxis)
  // A Playwright támogatja a gombok plusszjellel (+) való összefűzését is
  await page.keyboard.press(`${modifier}+v`); // Beillesztés vágólapról

  // Shift+Tab példa (visszafelé navigálás)
  await page.keyboard.press("Shift+Tab");
});
```

# Egér események

```ts
import { test, expect } from "@playwright/test";

test("Egér események tesztelése", async ({ page }) => {
  await page.goto("https://example.com");
  const gomb = page.locator("#submit-btn");

  // 1. Alapvető kattintások (Locator alapon)
  await gomb.click(); // Sima bal klikk
  await gomb.dblclick(); // Dupla kattintás
  await gomb.click({ button: "right" }); // Jobb klikk (helyi menü)
  await gomb.click({ button: "middle" }); // Középső klikk (görgő)

  // 2. Billentyűvel kombinált kattintások
  await gomb.click({ modifiers: ["Control"] }); // Ctrl + Klikk (kijelöléshez)
  await gomb.click({ modifiers: ["Shift"] }); // Shift + Klikk

  // 3. Egér rámutatás (Hover) és elmozdítás
  await gomb.hover(); // Ráviszi az egeret (pl. lenyíló menükhöz)

  // 4. Vonszolás (Drag and Drop) - Egyszerű verzió
  // Forrás elem elhúzása a célelemre
  await page.locator("#source-item").dragTo(page.locator("#target-zone"));

  // 5. Precíz egérmozgások koordinátákkal (page.mouse)
  // Az egér mozgatása a képernyő egy adott X, Y pontjára
  await page.mouse.move(100, 200);

  // Manuális vonszolás koordinátákkal (Klikk -> Mozgatás -> Felengedés)
  await page.mouse.down(); // Bal egérgomb lenyomása és nyomva tartása
  await page.mouse.move(300, 400, { steps: 10 }); // Elmozdítás 10 lépésben (folyamatosabb)
  await page.mouse.up(); // Egérgomb felengedése

  // 6. Egérgörgő használata (Görgetés / Wheel)
  // deltaX: vízszintes, deltaY: függőleges görgetés képpontban (pixel)
  await page.mouse.wheel(0, 500); // 500 pixelt görget lefelé
});
```

# Assertions + soft (Ellenőrzések)

Ellenőrzések és hitelesítések. Az `expect` könyvtárat kell ehhez használni a a playwright-ból.

```ts
import { test, expect } from "@playwright/test";

test("Assertions Demo", async ({ page }) => {
  await page.goto("https://kitchen.applitools.com/");

  await page.pause();
  /*Terminálban:
    npx playwright test .\tests\assertions.spec.ts --project chromium --headed
    */

  // ASSERTIONS
  // Check element present or not

  await page.getByRole("heading", { name: "The Kitchen" });
  await expect(page.getByRole("heading", { name: "The Kitchen" })).toHaveCount(
    1,
  );

  // $ -> All page.
  if (await page.$("text=The Kitchen")) {
    await page.locator("text=The Kitchen").click();
  }

  // check element hidden or visible
  await expect(page.locator("text=The Kitchen")).toBeVisible();
  // soft assertion
  // await expect.soft(page.locator('text=The Kitchen')).toBeHidden();

  // check element enable or disabled
  await expect(page.locator("text=The Kitchen")).toBeEnabled();

  // soft assertion
  // Nem áll meg közben a teszt, hanem lefut az egész, a végén kiírja, hogy mi nem sikerült.
  //await expect.soft(page.locator('text=The Kitchen')).toBeDisabled();

  // text matches value or not
  await expect(page.locator("text=The Kitchen")).toHaveText("The Kitchen");
  await expect(page.locator("text=The Kitchen")).not.toHaveText("ABCD");

  // element attribute
  await expect(page.locator("text=The Kitchen")).toHaveAttribute(
    "class",
    "chakra-heading css-dpmy2a",
  );
  // Ezzel: /.* megmondjuk azt, hogy bármi lehet előtte.
  await expect(page.locator("text=The Kitchen")).toHaveAttribute(
    "class",
    /.*css-dpmy2a/,
  );

  await expect(page.locator("text=The Kitchen")).toHaveClass(/.*css-dpmy2a/);

  // check page url and title
  await expect(page).toHaveURL("https://kitchen.applitools.com/");
  await expect(page).toHaveTitle(/.*The Kitchen/);

  // visual validation with screenshot
  await expect(page).toHaveScreenshot();
  /*
    Első futtaáskor készít egy képet ide: test-results\assertions-Assertions-Demo-chromium\Assertions-Demo-1-actual.png
    */
  // Második futtatáskor már összehasonlítja ez előzőleg készített képet az újal.
});
```

# Videó rögzítés (lassított felvétel) és képernyőkép

Csak akkor érdemes felvételt készíteni, ha elbukik a teszt.

playwright.config.ts-ben a use részbe:

```ts
    browserName: "chromium",
    screenshot: "only-on-failure",
    video: "retain-on-failure",
    // Slow Motion and Video Recording
    video: 'on-first-retry',

    launchOptions: {
      slowMo: 300 // millisecond
    },
```

A test-results mappába menti a videót és az összes tesztnél készít felvételt.

## Konkrét tesztnél készít csak videót

```ts
import { test, expect, chromium } from "@playwright/test";

test("Slow motion and video recording demo", async () => {
  /*
    Terminálban: 
    npx playwright test ./tests/slow_motion_videorecording_demo.spec.ts --project chromium
    */
  /*
       Step 1 - Create a test and create browser context
       Step 2 - Add options for Slow Motion in browser
       Step 3 - Add options for video recording in new context
       Step 4 - Close context
       */

  // Launch browser
  // const browser = await chromium.launch();
  const browser = await chromium.launch({
    headless: false, // Látható a böngésző.
    slowMo: 1000,
  });

  // Create a new incognito browser context
  // const context = await browser.newContext();
  const context = await browser.newContext({
    recordVideo: {
      dir: "videos/", // Új mappa létrehozása.
      size: { width: 800, height: 600 },
    },
  });

  // Create a new page inside context.
  const page = await context.newPage();

  await page.goto("https://admin-demo.nopcommerce.com/admin/");

  await page.pause();

  await page
    .getByRole("textbox", { name: "Email:" })
    .fill("admin@yourstore.com");

  await page.getByRole("textbox", { name: "Password:" }).fill("admin");
  await page.getByRole("button", { name: "Log in" }).click();

  // Dispose context once it's no longer needed.
  await context.close();
});
```

# Step

Átláthatóbb lesz a teszt és a terminálban is jobban látszik, hogy hol tart épp.

```ts
// 1. Lépés: Navigáció és bejelentkezés
await test.step("Bejelentkezés az áruházba", async () => {
  await page.goto("https://example.com");
  await page.fill("#username", "teszt_felhasznalo");
  await page.fill("#password", "TitkosJelszo123");
  await page.click("#login-button");

  // Ellenőrzés a lépésen belül
  await expect(page).toHaveURL("https://example.com");
});
```

# Hooks and Groups

Tesztszervezési és csoportosítási funkciók.

beforeAll
A fájlban található összes teszt előtt lefut.
Ha egy describe blokkon belül használod, akkor a csoportban lévő összes teszt előtt fut le.
Ha több beforeAll függvényt adsz meg, a regisztrációjuk (létrehozásuk) sorrendjében fognak végrehajtódni.

beforeEach
A fájlban található minden egyes teszt előtt lefut.
Ha egy describe blokkon belül használod, akkor a csoportban lévő minden egyes teszt előtt lefut.
Ha több beforeEach függvényt adsz meg, a regisztrációjuk sorrendjében fognak végrehajtódni.

afterAll
A fájlban található összes teszt után lefut.
Ha egy describe blokkon belül használod, akkor a csoportban lévő összes teszt után fut le.
Ha több afterAll függvényt adsz meg, a regisztrációjuk sorrendjében fognak végrehajtódni.

afterEach
A fájlban található minden egyes teszt után lefut.
Ha egy describe blokkon belül használod, akkor a csoportban lévő minden egyes teszt után lefut.
Ha több afterEach függvényt adsz meg, a regisztrációjuk sorrendjében fognak végrehajtódni.

```ts
import { test, expect } from "@playwright/test";

/*
Terminálban:
 npx playwright test ./tests/hooks_and_groups.spec.ts --project chromium --headed
 */

test.describe("All My Tests", () => {
  test.beforeEach(async ({ page }) => {
    await page.goto("https://www.saucedemo.com/");

    await page.locator('[data-test="username"]').fill("standard_user");
    await page.locator('[data-test="password"]').fill("secret_sauce");

    await page.locator('[data-test="login-button"]').click();
  });

  test.afterAll(async ({ page }) => {
    // Nem is kell, mert a playwright automatikusan bezárja a böngészőt.
    //await page.close();
  });

  test("HomePage", async ({ page }) => {
    await page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();
    await page
      .locator('[data-test="add-to-cart-sauce-labs-bike-light"]')
      .click();
    await page.locator('[data-test="item-1-title-link"]').click();
    await page.locator('[data-test="add-to-cart"]').click();
  });

  test("Logout", async ({ page }) => {
    await page.getByRole("button", { name: "Open Menu" }).click();
    await page.locator('[data-test="logout-sidebar-link"]').click();
    await page.waitForURL("https://www.saucedemo.com/");
  });
});
```

# Annotation & Tags

## Annotációk

Az annotációk olyan kulcsszavak, amelyek logikai vagy feltételes funkciókat hordoznak.
Tesztblokkokkal együtt használhatók a tesztek végrehajtásának igény szerinti vezérlésére.
Például: only, fail, fix, slow.

```ts
import { test, expect } from "@playwright/test";

/*
Terminálban futtatáshoz:
npx playwright test ./tests/annotation_and_tags.spec.ts --project chromium --headed
*/

test.skip("Test One", async ({ page }) => {
  // Ez a teszt teljesen kimarad a futásból.
});

// Hibát fog dobni, ha a teszt nem bukik el (pl. ha nincs benne assert, ami elhasalna).
test("not yet ready", async ({ page }) => {
  test.fail();
  // Ide kell valami, ami elbukik, különösen ha éles tesztről van szó.
  expect(true).toBe(false);
});

test.fixme("test to be fixed", async ({ page }) => {
  // Ezt a tesztet a Playwright megjelöli, de meg sem próbálja lefuttatni.
});

test("slow test", async ({ page }) => {
  // Megháromszorozza az alapértelmezett timeout időt ehhez a teszthez.
  test.slow();
});

test.only("focus this test", async ({ page }) => {
  // Ha jelen van a .only, a Playwright KIZÁRÓLAG ezt a tesztet futtatja le a fájlban.
});
```

## Saját annotációk

```ts
import { test, expect, Locator } from "@playwright/test";

test.describe("Successful login test for saucedemo.com", () => {
    test("login test", async ({ page }) => {
        test.info().annotations.push({
            type: "test-case",
            description: "TC-LOGIN-01",
        });

        await page.goto("https://www.saucedemo.com/");

        const username: Locator = page.locator("#user-name");
        const password: Locator = page.locator("#password");
        const loginButton: Locator = page.locator("#login-button");

        await username.fill("standard_user");
        await password.fill("secret_sauce");
        await loginButton.click();

        await expect(page).toHaveURL(
            "https://www.saucedemo.com/inventory.html",
        );
    });
});
```

## Tagek

```ts
/*
A teszteket olyan címkékkel címkézheted meg, mint például:
@smoke
@sanity
@fast @slow 
és csak azokat a teszteket futtasd, amelyek rendelkeznek az adott címkével.
*/
test("Test full report @smoke", async ({ page }) => {
  // ...
});
/*
npx playwright test--grep “@smoke”

A grep ellentéte: Bizonyos címkékkel rendelkező tesztek kihagyása
npx playwright test--grep - invert “@smoke”
*/
```

# POM (Új projekt)

A POM az automata tesztelésben a Page Object Model (Oldalobjektum-modell) rövidítése. Ez a legnépszerűbb és legelterjedtebb tervezési minta (design pattern) a UI-tesztelésben (Playwright, Selenium, Cypress).

Lényege, hogy a weboldal egyes oldalait (vagy nagyobb komponenseit, pl. fejléc, menü) külön JavaScript/TypeScript osztályokként (Class) modellezzük le.

Előnyei:
✅ Egységbe zárás – Elkülöníti a tesztlogikát a felhasználói felülettel (UI) való interakcióktól.
✅ Újrafelhasználhatóság – Ugyanazon oldalobjektumok használata több tesztben is.
✅ Skálázhatóság – A tesztkészlet egyszerű, problémamentes bővítése.
✅ Karbantarthatóság – Ha változik a felhasználói felület, elég egyetlen fájlt frissíteni a tucatnyi helyett!

Hozzunk létre egy mappát az új projektünknek és nyissuk meg azt Visual Studio Code-ban.

Új Node.js projekt inicializálása, terminálba ezt írd be: `npm init -y`

Playwright projekt létrehozása:
Terminálba: `npm init playwright@latest`

A zárójelben lévőket válaszold a terminál kérdéseire.
Do you want to use TypeScript or JavaScript? Typescript (enter),
Where to put your end-to-end tests? Marad a test mappa az alap értelmezett (tab és enter). Fontos, hogy csak egy test mappád legyen.
Add a GitHub Actions workflow? (n) // Ha szeretéd, hogy automatikusan lefussanak a tesztek, amikor commitolsz, akkor y-t válaszd.
Install Playwright browsers? (y)

Hozz létre egy login.spec.ts fájlt a tests mappába. Utána ezt írd be a terminálba:
`npx playwright codegen`

Manuálisan be kell írni a webcímet és kattintgatni kell, eközben a playwrigth elkészíti a kódot.

login.spec.ts tartalma:

```ts
import { test, expect } from "@playwright/test";

test("test", async ({ page }) => {
  await page.goto("https://the-internet.herokuapp.com/login");
  await page.getByRole("textbox", { name: "Username" }).click();
  await page.getByRole("textbox", { name: "Username" }).fill("tomsmith");
  await page.getByRole("textbox", { name: "Password" }).click();
  await page
    .getByRole("textbox", { name: "Password" })
    .fill("SuperSecretPassword");
  await page.getByRole("button", { name: " Login" }).click();
});
```

Futtatáshoz írd be ezt `npx playwright test --project=chromium --headed` a terminálba.

Hozz létre egy pages nevű mappát ás abba mentsd el a LoginPage.ts-t, melynek ez a tartalma:

```ts
import { Page, Locator } from "@playwright/test";

// export kulcs szóva lehet a teszt fájlokba importálni.
export class LoginPage {
  // private: OOP egységbe zárás alapelv.
  // Típusok deklarálása a TypeScript számára.
  private readonly page: Page;
  private readonly usernameInput: Locator;
  private readonly passwordInput: Locator;
  private readonly loginButton: Locator;

  constructor(page: Page) {
    /*
        A sima page (a jobb oldalon) a konstruktornak kívülről átadott paraméter (azaz a lokális változó).
        A this.page (a bal oldalon) az osztály saját tulajdonsága (property), amit feljebb deklaráltál.
        A this mondja meg a fordítónak: "A kívülről kapott page értéket mentsd el az osztályom saját page változójába!"
        */
    this.page = page;
    this.usernameInput = page.getByRole("textbox", { name: "Username" });
    this.passwordInput = page.getByRole("textbox", { name: "Password" });
    this.loginButton = page.getByRole("button", { name: " Login" });
  }

  async gotoLoginPage() {
    await this.page.goto("https://the-internet.herokuapp.com/login");
  }

  /**
   * Bejelentkezési folyamat végrehajtása
   * @param username Felhasználónév
   * @param password Jelszó
   */
  async login(username: string, password: string): Promise<void> {
    await this.usernameInput.fill(username);
    await this.passwordInput.fill(password);
    await this.loginButton.click();
  }
}
```

A login.spec.ts tartalmát módosítsd erre:

```ts
import { test, expect } from "@playwright/test";
import { LoginPage } from "../../pages/LoginPage";

test("test", async ({ page }) => {
  // Példányosítás, jobb oldalon a konstruktort hívjuk meg.
  const loginPage = new LoginPage(page);

  await loginPage.gotoLoginPage();
  await loginPage.login("tomsmith", "SuperSecretPassword!");
});
```

Teszt futtatása, írd be azt a terminálba:
`npx playwright test --ui`

# Fixtures és oldalváltás

```ts
// Playwright Fixture mintát követve mindent kitakarít a háttérben!
// fixtures/BaseTest.ts
// Az "as" felülírást jelenti, az eredetit felülírjuk. 
import { test as base, devices, BrowserContext, Page } from "@playwright/test";
import { LoginPage as LoginPage } from "../pages/LoginPage";

// 1. Lépés: Definiáljuk a fixture-ök típusait (milyen Page Objectjeink lesznek)
type MyFixtures = {
  // Első felhasználó környezete:
  context: BrowserContext; // Oldalváltáshoz kell.
  page: Page;
  loginPage: LoginPage;

  // Második felhasználó környezete:
  page2: Page;
};

// 2. Lépés: Kiterjesztjük az alap 'test' objektumot
export const test = base.extend<MyFixtures>({
  // Minden fixture egy aszinkron függvény, ami megkapja a 'page' és a 'use' paramétert
  // Példányosítjuk az osztályt
  // Első lapfül
  loginPage: async ({ page }, use) => {
    // Átadjuk a tesztnek használatra
    await use(new LoginPage(page));
  },

  // Oldalváltáshoz kell.
  // Másik lapfül.
  page2: async ({ context }, use) => {
    // 1. Megkeressük az ELSŐ lapfület, ami a teszt indulásakor már létezik
    const firstTab = context.pages()[0];

    // 2. Megnyitjuk a MÁSODIK lapfület (ez ekkor előtérbe ugrik)
    const newTab = await context.newPage();

    // 3. Ha az első fül már létezik, AZONNAL visszaváltunk rá
    if (firstTab) {
      await firstTab.bringToFront();
    }

    // 4. Átadjuk a másodlagos lapot a tesztnek
    await use(newTab);

    // 5. A teszt végén automatikusan bezárjuk a második fület
    await newTab.close();
  },

  /*
  loginPage2: async ({ page2 }, use) => {
    await use(new LoginPage(page2));
  },
  */
});

// 3. Lépés: Újraexportáljuk az 'expect' funkciót is, a kényelmesebb importálásért
export { expect } from "@playwright/test";

// Minden teszt után lefut.
test.afterEach(async ({ context }) => {
  await context.close();
});
```

## Egy konkrét tesztben így kell váltogatni a lapfülek között

```ts
await context.pages()[1].bringToFront();

// Váltás/Interakció: Egyszerűen az adott változót használod
// Visszavált az első fülre (előtérbe hozza)
await page.bringToFront();
```

# Canvas

```ts
// Térképre történő kattintás.
await page.locator("canvas.ol-fixedoverlay").click({
  position: {
    x: 400,
    y: 180,
  },
});
```

# Page Chaining (Oldal láncolás)

A Page Chaining egy tervezési minta, amelyet általában a Page Object Model (POM) mellett használunk Playwright teszteknél.

A lényege:

Egy oldalon végrehajtott művelet után a metódus visszaadja a következő oldal objektumát, így a teszt folytatható a következő oldalon.

A teszt folyamatot oldalról oldalra lehet vezetni:

LoginPage
↓
DashboardPage
↓
ProfilePage

Ha nincsen oldalváltó művelet, akkor az adott oldal objektumát adja vissza.

# Report feltöltésének automatizálása Azure DevOps-al

Statikus html oldalként fog megjelenni.

Útmutatók a beállításához:
https://ultimateqa.com/playwright-reporters-how-to-integrate-with-azure-devops-pipelines/

https://bogdanbujdea.dev/publishing-playwright-report-as-an-artifact-in-azure-devops?source=more_series_bottom_blogs

# Best practices

- Adatalapú tesztelést (Data-driven test)
- Negatív tesztelés és összetett forgatókönyvek (Multiple scenarios)
- Újrafelhasználható POM
- Tiszta asszerciók (Clean Assertions):

  AAA (Arrange, Act, Assert) minta: Tagolja a teszteseteket három jól elkülöníthető részre. Az ellenőrzéseket mindig a teszt legvégén végezze el.

# Valós skálázható projekt (Real World Scalable Project)

A lényege, hogy a projekt valós problémát modellezzen, bővíthető legyen, és ne csak egy egyszerű demo legyen.

## JSON fájl használata

Ha JSON fájlban 10 felhasználó van akkor 10-szer futnak e a tesztek.
A tesztek futtatása egy logikai kapcsolóval (flag) szabályozható: a teszteset csak akkor indul el, ha a mező értéke 'yes'.

Példa program:
data/loginDataNew.json

```json
[
  {
    "username": "standard_user",
    "password": "secret_sauce",
    "expected": "success",
    "run": "yes"
  },
  {
    "username": "locked_out_user",
    "password": "secret_sauce",
    "expected": "error",
    "run": "no"
  },
  {
    "username": "problem_user",
    "password": "secret_sauce",
    "expected": "success",
    "run": "no"
  }
]
```

A POM fejezetben lévő LoginPage osztály használjuk a lenti tesztnél.
login.dynamicdata.spec.ts:

```ts
import { expect, test } from "@playwright/test";
import { LoginPage } from "../pages/LoginPage.ts";
import loginDataNew from "../data/loginDataNew.json";

loginDataNew.forEach((data) => {
  if (!data.run) return; // Ha false az értéke, akkor ne csináljon semmit.

  // Backtick (Visszafelé dőlő ékezet)-t használj!
  test(`Login Test - ${data.username}`, async ({ page }) => {
    const loginPage = new LoginPage(page);
    await loginPage.gotoLoginPage();
    await loginPage.login(data.username, data.password);

    if (data.expected === "success") {
      await expect(page).toHaveURL("https://www.saucedemo.com/inventory.html");
    } else {
      await expect(loginPage.errorMessage).toBeVisible();
    }
  });
});
```

## CSV fájl használata

A csv használatához kell egy külön csomag, írd be azt a terminálba a letöltéséhez:
`npm install csv-parse`

A POM fejezetben lévő LoginPage osztály használjuk a lenti tesztnél.

data/LoginData.csv:

```csv
username,password,expected,run
standard_user,secret_sauce,success,yes
locked_out_user,secret_sauce,error,no
problem_user,secret_sauce,success,yes
```

utils/csvReader.ts:

```ts
import fs from "fs";
import * as csvParseSync from "csv-parse/sync";

export function readCSV(filePath: string) {
  // Adj hozzá 'utf-8'-at, hogy biztosan szövegként olvassa be
  const fileContent = fs.readFileSync(filePath, "utf-8");

  const records = csvParseSync.parse(fileContent, {
    columns: true, // A fejlés a mezőneveket tartalmazza.
    skip_empty_lines: true,
  });
  return records;
}
```

login.csv.spec.ts

```ts
import { expect, test } from "@playwright/test";
import { LoginPage } from "../pages/LoginPage";
import { readCSV } from "../utils/csvReader";

// Jobb klikk a fájlon és Copy Relative Path. /-re figyelj!
const loginData = readCSV("data/LoginData.csv");

// Soronként haladunk, az any-val elfogadunk minden típust.
loginData.forEach((data: any) => {

   // Ha nem true az értéke, akkor ne csináljon semmit.
  if (data.run !== "true") return; 

  // Backtick (Visszafelé dőlő ékezet)-t használj!
  test(`Login Test - ${data.username}`, async ({ page }) => {
    const loginPage = new LoginPage(page);
    await loginPage.gotoLoginPage();
    await loginPage.login(data.username, data.password);

    if (data.expected === "success") {
      await expect(page).toHaveURL("https://www.saucedemo.com/inventory.html");
    } else {
      await expect(loginPage.errorMessage).toBeVisible();
    }
  });
});
```

## XLSX fájl használata

A csv használatához kell egy külön csomag, írd be azt a terminálba a letöltéséhez:
`npm install xlsx`
`npm install -D @types/xlsx`

A POM fejezetben lévő LoginPage osztály használjuk a lenti tesztnél.

LoginData.xlsx
```xlsx
username|password|expected|run
standard_user|secret_sauce|success|yes
locked_out_user|secret_sauce|error|no
problem_user|secret_sauce|success|yes
```

utils/excelReader.ts:
```ts
import * as XLSX from "xlsx";
import path from "path";

// Egyedi típus.
export type LoginData = {
    username: string;
    password: string;
    expected: string;
    run: string;
};

export function readExcel(filePath: string, sheetName: string): LoginData[] {
    const fullPath = path.resolve(filePath);
    console.log("Full Path is ", fullPath);

    const workbook = XLSX.readFile(fullPath);
    const sheet = workbook.Sheets[sheetName];
    const data = XLSX.utils.sheet_to_json(sheet);
    return data;
}
```

login.excel.spec.ts:
```ts
import { expect, test } from "@playwright/test";
import { LoginPage } from "../../pages/LoginPage";
import { readExcel } from "../../utils/excelReader";

// Jobb klikk a fájlon és Copy Relative Path. /-re figyelj!
//Típus biztonsággal, elkelhetjük a fordításkori futás esetén bekövetkező hibákat.
const testData: LoginData[] = readExcel("./data/LoginData.xlsx", "Sheet1");

test.describe("Login Tests", () => {
    // Soronként haladunk, az any-val elfogadunk minden típust.
    for (const data of testData) {
        // Backtick (Visszafelé dőlő ékezet)-t használj!
        test(`Login test for - ${data.username}`, async ({ page }) => {
            // A skippelt tesztek láthatóak a reportban is, felül a lapfülek között.
            test.skip(
                // Ha nem yes az értéke, akkor ne csináljon semmit.
                data.run !== "yes",
                "Run flag is not yes.",
            );

            const loginPage = new LoginPage(page);

            await test.step("Go to login page", async () => {
                await loginPage.gotoLoginPage();
            });

            await test.step("Perform Login", async () => {
                await loginPage.login(data.username, data.password);
            });

            await test.step("Validate Result", async () => {
                if (data.expected === "success") {
                    await expect(page).toHaveURL(
                        "https://www.saucedemo.com/inventory.html",
                    );
                } else {
                    await expect(loginPage.errorMessage).toBeVisible();
                }
            });
        });
    }
});
```

## Multi funkcionális adatbeolvasás (json, csv,excel) - Ezt használd!

Mindhárom típusú fájl be tudja olvasni.
A fentebb található három fejezetben lévő kódot használjuk megint.

utils/dataReader.ts:
```ts
import path from "path";
import { readCSV } from "../utils/csvReader";
import { readExcel } from "../utils/excelReader";
import fs, { readFileSync } from "fs";

// A ? azt jelenti, hogy nem kötelező megadni.
export function readData(filePath: string, sheetName?: string) {
    const ext = path.extname(filePath).toLowerCase();

    switch (ext) {
        case ".csv":
            return readCSV(filePath);
        case ".xlsx":
            return readExcel(filePath, sheetName || "Sheet1");
        case ".json":
            const JSONData = fs.readFileSync(filePath, "utf-8");
            return JSON.parse(JSONData);
        default:
            // Backtick (Visszafelé dőlő ékezet)-t használj!
            throw new Error(`Unsupported file type - ${ext}`);
    }
}
```

login.unifiedReader.spec.ts:
```ts
import { expect, test } from "@playwright/test";
import { LoginPage } from "../pages/LoginPage";
import { readData } from "../utils/dataReader";

// Jobb klikk a fájlon és Copy Relative Path. /-re figyelj!
//Típus biztonsággal, elkelhetjük a fordításkori futás esetén bekövetkező hibákat.
// const testData = readData('./data/loginDataNew.json');
// const testData = readData('./data/LoginData.csv');
const testData = readData("./data/LoginData.xlsx", "Sheet1");

test.describe("Login Tests", () => {
    // Soronként haladunk, az any-val elfogadunk minden típust.
    for (const data of testData) {
        // Backtick (Visszafelé dőlő ékezet)-t használj!
        test(`Login test for - ${data.username}`, async ({ page }) => {
            // A skippelt tesztek láthatóak a reportban is, felül a lapfülek között.
            test.skip(
                // Ha nem yes az értéke, akkor ne csináljon semmit.
                data.run !== "yes",
                "Run flag is not yes.",
            );

            const loginPage = new LoginPage(page);

            await test.step("Go to login page", async () => {
                await loginPage.gotoLoginPage();
            });

            await test.step("Perform Login", async () => {
                await loginPage.login(data.username, data.password);
            });

            await test.step("Validate Result", async () => {
                if (data.expected === "success") {
                    await expect(page).toHaveURL(
                        "https://www.saucedemo.com/inventory.html",
                    );
                } else {
                    await expect(loginPage.errorMessage).toBeVisible();
                }
            });
        });
    }
});
```