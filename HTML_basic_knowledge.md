# HTML csontváz a weboldalakhoz

# Tartalomjegyzék
- [HTML csontváz a weboldalakhoz](#html-csontváz-a-weboldalakhoz)
- [Tartalomjegyzék](#tartalomjegyzék)
- [Források](#források)
- [Alapok](#alapok)
- [Struktúra](#struktúra)
- [Táblázat](#táblázat)

# Források

https://www.udemy.com/course/the-complete-javascript-course/
https://www.youtube.com/playlist?list=PLP9IO4UYNF0VdAajP_5pYG-jG2JRrG72s
https://www.w3schools.com/html/default.asp
[100+ Web Development Things you Should Know](https://youtu.be/erEgovG9WBs?si=vEFXO3P_WufyaR-C)

# Alapok

[Itt](https://codepen.io/) tudsz gyakorolni.
HTML magyarázatok és interaktív példákat [itt](https://www.w3schools.com/html/default.asp) találsz.


# Struktúra

```html
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="style.css" />
        <title>Questlog</title>
    </head>
    <body>
        <header>
            <h1>Gamer/geek teendő lista</h1>
            <!--A bekért nevet írjuk ki.-->
            <h2>Szia!</h2>
            <section class="inputSection">
                <form id="nameForm">
                    <label>Your name: </label>
                    <input
                        type="text"
                        id="name"
                        placeholder="Pls write your name"
                        required
                    />
                    <button type="sumbit">Submit</button>
                </form>

                <form id="newquestForm">
                    <!--Megnevezés, Dátum, Fontosság {nem fontos, normál, fontos}  -->
                    <label>Quest name: </label>
                    <input
                        type="text"
                        id="description"
                        placeholder="Pls describe"
                        required
                    />
                    <input type="date" required />
                    <select name="priority" id="priority" required>
                        <option value="">Choose priority</option>
                        <option value="Not important">Not important</option>
                        <option value="Normal">Normal</option>
                        <option value="Important">Important</option>
                    </select>
                    <button type="sumbit">Submit</button>
                </form>
            </section>
        </header>
        <main>
            <section class="mainSection">
                <!--Nem minden esetben kell.-->
                <!--<article></article>-->
                <h3>Active quests</h3>
                <ul id="quest-list">
                    <li>Check my mail box.</li>
                </ul>
            </section>
        </main>
    </body>
    <script src="script.js" defer></script>
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