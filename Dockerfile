FROM maven:3.9-eclipse-temurin-23 AS build

WORKDIR /main

COPY pom.xml .
COPY src ./src

RUN mvn clean package

FROM eclipse-temurin:23-jre

WORKDIR /main

COPY --from=build /main/target/*.jar main.jar

CMD ["java", "-jar", "main.jar"]