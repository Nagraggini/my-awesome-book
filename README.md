# Könyv létrehozása

## Előkészületek

A book.toml fájl elején definiálod a legfontosabb metaadatokat. Ez a fájl a projekt gyökerében található. A tartalmát a projektemben lévő book.toml fájlomban láthatod.

## Telepítés

Terminálban: sudo snap install mdbook
mdbook build
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh


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




# Futtatás
Tesztelés: mdbook serve
Leállítás: Terminálban nyomj egy ctrl+c-t.