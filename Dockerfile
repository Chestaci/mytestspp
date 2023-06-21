FROM avalonlab/maven-openjdk14

WORKDIR /app

COPY . .
#RUN chmod -R 777 /app/target/allure-results/
#COPY pom.xml .
#COPY src /src

#RUN mvn clean test
RUN -u $(id -u):$(id -g)
