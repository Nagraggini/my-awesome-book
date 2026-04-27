# HTML csontváz a weboldalakhoz

# Tartalomjegyzék
- [HTML csontváz a weboldalakhoz](#html-csontváz-a-weboldalakhoz)
- [Tartalomjegyzék](#tartalomjegyzék)
- [Források](#források)
- [Alapok](#alapok)
- [Struktúra](#struktúra)
- [Táblázat](#táblázat)
- [Minta struktúra](#minta-struktúra)

# Források

https://www.udemy.com/course/the-complete-javascript-course/
https://www.youtube.com/playlist?list=PLP9IO4UYNF0VdAajP_5pYG-jG2JRrG72s
https://www.w3schools.com/html/default.asp
[100+ Web Development Things you Should Know](https://youtu.be/erEgovG9WBs?si=vEFXO3P_WufyaR-C)
[HTML & CSS for Absolute Beginners](https://www.youtube.com/playlist?list=PL4-IK0AVhVjOJs_UjdQeyEZ_cmEV3uJvx)

# Alapok

Érdemes előre megtervezni a weboldal kinézetét. Például itt: https://draw.io/
Elég egy sematikus ábra, hogy kb itt lesz ennyi gomb stb. Ezt fogja majd tudni.

[Itt](https://codepen.io/) tudsz gyakorolni.
HTML magyarázatok és interaktív példákat [itt](https://www.w3schools.com/html/default.asp) találsz.


# Struktúra

Sorrend: header, main, nav, footer

```html
<!doctype html>
<html lang="hu">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="Questlog - Gamer teendő lista" />

    <title>Questlog</title>

    <link rel="stylesheet" href="style.css" />
</head>

<body>
    <!-- HEADER -->
    <header class="site-header">
        <nav class="nav">
            <h1 class="logo">Questlog</h1>
        </nav>
    </header>

    <!-- MAIN -->
    <main class="container">

        <!-- USER SECTION -->
        <section aria-labelledby="user-title">
            <h2 id="user-title">Felhasználó</h2>

            <form id="nameForm" class="card">
                <label for="name">Neved</label>
                <input 
                    type="text" 
                    id="name" 
                    name="name"
                    placeholder="Írd be a neved"
                    autocomplete="name"
                    required 
                />
                <button type="submit">Mentés</button>
            </form>

            <p id="greeting" aria-live="polite"></p>
        </section>

        <!-- ADD QUEST -->
        <section aria-labelledby="quest-form-title">
            <h2 id="quest-form-title">Új küldetés</h2>

            <form id="questForm" class="card">
                <div class="form-group">
                    <label for="description">Megnevezés</label>
                    <input type="text" id="description" required />
                </div>

                <div class="form-group">
                    <label for="date">Határidő</label>
                    <input type="date" id="date" required />
                </div>

                <div class="form-group">
                    <label for="priority">Prioritás</label>
                    <select id="priority" required>
                        <option value="">Válassz</option>
                        <option value="low">Nem fontos</option>
                        <option value="normal">Normál</option>
                        <option value="high">Fontos</option>
                    </select>
                </div>

                <button type="submit">Hozzáadás</button>
            </form>
        </section>

        <!-- QUEST LIST -->
        <section aria-labelledby="quest-list-title">
            <h2 id="quest-list-title">Aktív küldetések</h2>

            <ul id="quest-list" class="quest-list">
                
                <li>
                    <article class="quest-card" data-priority="normal">
                        <header>
                            <h3>Check my mailbox</h3>
                        </header>

                        <p><strong>Határidő:</strong> 2026-04-20</p>
                        <p><strong>Prioritás:</strong> Normál</p>

                        <footer>
                            <button class="complete-btn">Kész</button>
                            <button class="delete-btn">Törlés</button>
                        </footer>
                    </article>
                </li>

            </ul>

            <a
                target="_blank"
                rel="noopener noreferrer"
                href="https://google.hu"
            ></a>
        </section>

    </main>

    <!-- FOOTER -->
    <footer class="site-footer">
        <small>&copy; 2026 Questlog</small>
    </footer>

    <script src="script.js" defer></script>
</body>
</html>

```


# Táblázat

```html
<table>
                    <thead>
                        <tr>
                            <th>Checkbox</th>
                            <th>Description</th>
                            <th>Date</th>
                            <th>Priority</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Done</td>
                            <td>Check my mail box.</td>
                            <td>2026/04/06</td>
                            <td>Important</td>
                        </tr>
                    </tbody>
                </table>
```

# Minta struktúra

```bash
my-website/
  index.html
  about.html
  css/
    styles.css
    utilities.css
  images/
    logo.svg
  components/
    header.html
    footer.html
```