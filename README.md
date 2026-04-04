![Top Language](https://img.shields.io/github/languages/top/Nagraggini/blog)
![License](https://img.shields.io/badge/license-MIT-green)

Hungarian version - Magyar verzió

# Blog webalkalmazás

[Látogasd meg az oldalam!](https://nagraggini-blog.onrender.com/)

# Amit használtam:

## Backend (Szerveroldal)

- Spring Boot alkalmazás (BlogApplication.java)

## Frontend (Felhasználói felület)

- HTML sablonok (.html fájlok a resources/templates mappában)
- Thymeleaf attribútumok, pl. th:text, th:case, az adatok dinamikus megjelenítéséhez a backendből
- CSS / Tailwind a megjelenés formázásához
- JavaScript az interaktivitáshoz

# Kezdőknek

[Saját webfejlesztői alapismeretekről szóló blogom](https://nagraggini-blog.onrender.com/)

# Spring Boot

[Ez alapján csináltam.](https://www.youtube.com/watch?v=RK6aAjUMcl0&list=PLg7lel5LdVjyO7jk-4biyr0fqPVygTLOk)

[A fenti youtube videóhoz tartozó repo.](https://github.com/bobbychansfu/springboot-render/tree/7d38d0343465661adceb6372591a8353717dfd5e)

További link:
[Spring MVC Beginner](https://www.youtube.com/watch?v=VqptK6_icjk&list=PL82C6-O4XrHejlASdecIsroNEbZFYo_X1)

[Fejlesztői környezet és kiegészítők letöltése](https://code.visualstudio.com/docs/java/java-spring-boot)

A vs code extension részen ezeket töltsd le:

- Java Development Kit (JDK)
- Extension Pack for Java
- Spring Boot Extension Pack
- Spring Boot Tools
- Spring Initializr

# Új projekt létrehozása

Előre konfigurált Spring Boot projektet lehet generáltatni, hogy ne kelljen kézzel megírni az összes kezdő fájlt és beállítást: [Spring Initializr](https://start.spring.io/)

Project: Maven
Language: Java
Spring Boot: 4.0.2
Artifact és Name: projektneve, amit az elején megadtál.
Packaging: Jar
Conf: Properties
Java: 17

Dependenciák:
Spring Boot DevTools (Fejlesztéshez kell, éles appba nem, gyorsabb újraindítás és nem kell kézzel leállítani és újrainsítani a szervert.)
Spring Web (Webalkalmazáshoz kell, hogy legyen @Controller osztály, HTTP kérések kezelés.)
Spring Session for JDBC (Arra való, hogy a session adatokat adatbázisban tárolja. Egyszerű CRUD-nál nem szükséges.)
Thymeleaf (Java változók megjelenítésében HTML-ben.)

# Dockerfile

Az alkalmazás győkér könyvtárába hozd létre egyből a Dockerfile, ne adj neki kiterjesztést, txt-t sem.

Ez a Dockerfile a Spring Boot alkalmazás konténerizálására szolgál.

A célja, hogy az alkalmazásodat lefordítsa és futtassa egy Docker konténerben, így bárhol ugyanúgy működjön (Render, saját gép, stb.).

Ez az egész Dockerfile arra kell, hogy:

- lefordítsa a Spring Boot projektet
- JAR fájlt készítsen
- elindítsa egy konténerben

## Dockerfile tartalma

```bash
# Build stage: a projekt lefordítása és JAR csomagolása Maven segítségével.
# Java verzió a pom.xml-ben van beállítva (Java 17).

# A from sor létrehoz egy ideiglenes konténert. 
FROM maven:3.8.5-openjdk-17 AS build 
# Fordításra szolgál.
WORKDIR /app
COPY . .

# Lefordítja a Java kódot és létrehozza a JAR fájlt. Ezt a jar fájlt használjuk lentebb a copy sorban.
RUN mvn clean package -DskipTests

# Run stage: ez a konténer fogja futtatni az alkalmazást.
# Java verzió a pom.xml-ben van beállítva (Java 17).
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app

# Ez átmásolja a fentebb létrehozott JAR fájlt a build stage-ből a run stage-be (/app/blog.jar).
COPY --from=build /app/target/*.jar blog.jar

# A Spring Boot alkalmazás a 8080-as porton fut.
EXPOSE 8080 

# Alkalmazás futtatása. ENTRYPOINT: a konténer indításakor a JAR futtatása.
ENTRYPOINT ["java","-jar","blog.jar"]
```

https://github.com/-ra regisztrálj be.

Github Desktop-t töltsd le. Utána File -> Add local repository-> keresd meg a mappát, ahova az új projektet hoztad létre. -> Add repository -> Create a repoditory -> Töltsd ki az űrlapot. -> Create repository

render.com regisztrálj -> Kösd össze a github fiókoddal.

New -> Web Service -> Válaszd ki a listából a progjekt nevét (blog)
Language: Docker
-> Deploy web service Kb 15 percig eltart a deploy.

## SSH key

Ez alapján hozd létre: https://github.com/settings/ssh/new

## Build failed

Ha valamit elrontottál is kijavítod, utána a render.com-on -> Manual Deploy -> Deploy latest commit

# Projekt futtatása

Ha elindítod a java fájlt (BlogApplication.java), akkor a böngészőbe írd be ezt: http://localhost:8080/actuator

A dependenciák közt fel vettek az actuatort, ezzel le tudod csekkolni magad.
Az actuator információt ad az alkalmazás állapotáról és működéséről.

Alapból csak a /actuator endpoint lesz elérhető.

Ha több információt akarsz, a application.properties-ben beállíthatod, pl.:
management.endpoints.web.exposure.include=\*

A static mappába hozz létre egy index.html fájlt.

A static mappában lévő html fájlt, itt meg tudod nézni:
http://localhost:8080/index.html

# Tailwind stílus használata

Node.js-t telepítsd. Linux-on írd be a terminálba, hogy: sudo apt update
Utána: sudo apt install nodejs

npm-et is telepítsd -> sudo apt install npm

Így csekkold, hogy le van-e töltve:
node -v
npm -v

[Tailwind](https://tailwindcss.com/docs/animation)

A HTML-ben a head tagbe másold be ezt:

    <script src="https://cdn.tailwindcss.com"></script>

A Tailwind CSS IntelliSense kiegészítőt ajánlott telepíteni a vs code-on.

# CI/CD (Continuous Integration / Continuous Deployment) folyamat:

Új build indítása – Ez lehet manuális push a GitHub/GitLab branchre, vagy egy automatikus trigger.

Dockerfile feldolgozása – A rendszer végigmegy a Dockerfile-on: letölti a base image-et, telepíti a függőségeket, lefordítja a projektet (pl. mvn package), és létrehozza a végső Docker image-et.

Image létrehozása – Ez a “build” lépés, ahol a kész alkalmazás becsomagolódik egy konténerbe.

Image deployolása – Render.com feltölti az image-et a saját konténer registry-jébe és elindítja az új konténert.

Új konténer futtatása – Az új image futtatása a szerveren, a régi konténer lecserélődik (rolling update).

A folyamat 10 perc körüli időt vesz igénybe, mert a Maven build és a Docker image létrehozása időigényes lehet, főleg ha a projekt nagy vagy sok függőséget használ (Ez 8 db-ot használ).

# Debug

[A videó végén szerepel, hogyan kell debuggolni.](https://www.youtube.com/watch?v=p3AIecyvok4&list=PLg7lel5LdVjyO7jk-4biyr0fqPVygTLOk&index=7)

1. Telepítsd a Docker-t.

2. Projekt buildelése Dockerrel:
   Terminálba írd be: sudo docker build -t renderapp .

- A . a build context, azaz a Docker a projekt gyökérkönyvtárából veszi a Dockerfile-t és a forrásfájlokat.
- A parancs létrehoz egy Docker image-et, ami tartalmazza a Maven build-et és az alkalmazást.

3. Mi történik a háttérben:

- A Docker először letölti a base image-et (pl. Maven + JDK).
- Lefuttatja a mvn clean package parancsot, ami:
  Kitisztítja a korábbi build fájlokat
  Létrehozza a target mappát
  Becsomagolja az alkalmazást futtatható .jar fájlba
- A .jar fájl bekerül a Docker image-be, így az image futásra kész lesz.

Felhasználót hozzáadni a docker csoporthoz (jobb hosszú távon):
Terminálba:
sudo usermod -aG docker $USER
newgrp docker

Ez a parancs elindít egy Docker konténert az általad készített renderapp image-ből, és biztosítja, hogy a konténeren belüli 8080-as portot elérd a saját gépedről a localhost:8080 címen:
docker run -p 8080:8080 renderapp

# Portok használata

Ezzel kilistázod, hogy melyik app használja a portot.

Terminálban:
sudo lsof -i :8080

A 58608-at írd át arra, amit fentebb kiír.
sudo kill 58608

# application.properties fájl

```bash
spring.application.name=blog

# Debughoz engedélyezzük a Tomcat access logot
server.tomcat.accesslog.enabled=true

#Miután a fentieket beállítottad, újra kell indítani a szervert.
```

# Templating with Spring and Thymeleaf

Spring és Thymeleaf használatakor a templatingre azért van szükség, hogy dinamikus funkciókat és adatokat jeleníthessünk meg az oldalon.

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html)

A resources/static mappában van az index.html, ezt fogja megjeleníteni egyből a böngésző, ha deployolod az appot a render.com-on.

## Futtatás localhost-on

A AnimalShelterApplication.java fájl legyen megnyitva aktuálisan.

Nyomd meg a start gombot, hogy localhost-on tesztelt az weboldalt. Vagy a Spring Boot Dashboard-on a start gombra menj, akár mi meg lehet nyitva jobb oldalt.

Ha az oldal elindult, a terminálban ezt kell látnod:  
Started AnimalShelterApplication in 9.588 seconds (process running for 10.541)

Ha nem indul el, keresd meg a terminálban az ERROR-t.

Böngészőbe írd be: http://localhost:8080/  
F12 (DevTools) → Network fülön könnyebb ellenőrizni.

Szerver leállítása: IDE-ben a Stop gomb, Linux-on a terminálban Ctrl+C.

# Online fejlesztéshez

[Github codenamespace](https://github.dev/)

Terminálban:
sdk install java 17.0.10-ms
mvn spring-boot:run 

