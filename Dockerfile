FROM adoptopenjdk/maven-openjdk11 AS build

WORKDIR /app

COPY pom.xml .
COPY src /src

#RUN mvn clean test
