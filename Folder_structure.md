Webes projekt mappa struktúrája ilyen legyen:

```bash
projekt-neve/
├── index.html                  # A fooldal (belepesi pont)
├── pages/                      # Aloldalak
│   ├── contact-us.html
│   └── about-me.html
├── assets/                     # Statikus eroforrasok
│   ├── css/
│   │   ├── main-style.css
│   │   └── header-style.css
│   ├── js/
│   │   ├── load-components.js
│   │   └── theme-switch.js
│   ├── images/
│   │   └── hero-banner.jpg
│   ├── fonts/
│   │   └── roboto-regular.woff2
│   └── icons/
│       └── favorite-icon.svg
├── components/                 # Ujrafelhasznalhato HTML reszletek
│   ├── header-component.html
│   ├── footer-component.html
│   └── sidebar-navigation.html
├── docs/                       # Dokumentacio es segedanyagok
│   ├── syllabus/               # Tananyagok (pl. istqb-syllabus-hu.pdf)
│   ├── architecture-plan.md    # A projekt felepitesenek leirasa
│   └── guides/
│       └── testing-guide.md    # Utmutatok a teszteleshez
├── tests/                      # Tesztelesi mappa (Playwright/E2E)
│   ├── e2e/                    # End-to-end tesztek
│   │   └── user-login.spec.js
│   ├── components/             # Komponens-szintu tesztek
│   │   └── header-check.spec.js
│   ├── fixtures/               # Tesztadatok
│   │   └── test-users.json
│   └── utils/                  # Segedfuggvenyek
│       └── test-helpers.js
├── playwright.config.js        # Playwright konfiguracio
├── package.json                # Fuggosegek es scriptek
└── README.md                   # Fo leiras a projektirol
```

Mindegyik fájl ékezet nélküli és kötöjeles (Kebab-case) legyen, valamint átlátható és konzistens.