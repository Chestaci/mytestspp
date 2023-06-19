FROM avalonlab/maven-openjdk14

WORKDIR /app

COPY . .
#COPY pom.xml .
#COPY src /src

#RUN mvn clean test
