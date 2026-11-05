# Stage 1: Build the Java application
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package

# Stage 2: Create runtime image
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/classes ./classes

CMD ["java", "-cp", "classes", "com.example.even_odd_new.EvenOdd"]