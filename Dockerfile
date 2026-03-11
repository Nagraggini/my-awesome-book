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