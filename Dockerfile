FROM adoptopenjdk/maven-openjdk11

WORKDIR /app

COPY . .
#COPY pom.xml .
#COPY src /src

#RUN mvn clean test
