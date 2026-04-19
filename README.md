Live demo: 

# Könyv létrehozása

## Előkészületek

A book.toml fájl elején definiálod a legfontosabb metaadatokat. Ez a fájl a projekt gyökerében található. A tartalmát a projektemben lévő book.toml fájlomban láthatod.

## Telepítés

Terminálban: sudo snap install mdbook
```bash
mdbook build

curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh

source $HOME/.cargo/env
```

<!--TODO mdbook-admonition telepítése nem sikerült. mdbook-playpen, mdbook test, mdbook-toc, mdbook-mermaid használata -->
<!--TODO Link checker: Megnézi, hogy van-e halott link a könyvben.-->

Ez csak akkor kell, ha van nagy méretű fájlod is.
Terminálban: 
```bash
sudo apt update
sudo apt install git-lfs
git lfs install
```

## Mappa struktúra

```bash
my-awesome-book/
├── .github/                # GitHub Actions (automatikus publikálás pl. GitHub Pages-re)
│   └── workflows/
│       └── deploy.yml
├── .gitignore              # Hogy a /book mappa ne kerüljön be a gitbe
├── book.toml               # A projekt szíve (konfiguráció)
├── theme/                  # Egyedi design elemek (opcionális)
│   ├── favicon.png
│   ├── head.hbs            # HTML head kiegészítések (pl. analitika)
│   └── css/
│       └── custom.css      # Saját stílusok (pl. céges színek)
└── src/                    # A tényleges tartalom
    ├── SUMMARY.md          # A könyv tartalomjegyzéke
    ├── introduction.md     # Bevezető
    ├── chapter_1/          # Fejezetek külön mappában
    │   ├── section_1.md
    │   └── section_2.md
    ├── assets/             # Statikus fájlok gyűjtőhelye
    │   ├── images/         # Képek
    │   │   ├── architecture.png
    │   │   └── logo.svg
    │   └── snippets/       # Beágyazható kódpéldák (rust/js/stb.)
    └── draft/              # Pisztolatok (amiket még nem veszel fel a SUMMARY-ba)
```

Kommitolj egyet.

# A publikálás automatizálása (GitHub Actions)

Ez a legprofibb módszer: minden alkalommal, amikor feltöltöd a kódot, a GitHub automatikusan "megépíti" és frissíti a könyv linkjét.

A VS Code-ban hozz létre egy ilyen mappaszerkezetet: .github/workflows/ (ponttal az elején!).

Ebbe a mappába hozz létre egy fájlt: deploy.yml.
A sablon szöveget a deploy.yml fájlomban láthatod.

Github-on a könyvet repojába lépj be. -> Settings -> Pages -> Branch-nél válaszd ki a gp-pages-t, vagy ahogy elnevezted a workflow-ban. -> Save

Pár perc múlva meg fog jelenni felül a linked.

# Futtatás

Tesztelés: mdbook serve
Leállítás: Terminálban nyomj egy ctrl+c-t.

## Commitoláshoz

Kijelölés: git add .
Mentés: git commit -m "Fixed: "
Feltöltés: git push

Csekkolás:
git status