# Use an official Maven image to build the app
FROM maven:3.8.6-openjdk-21 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven configuration files
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline -B

# Copy the rest of the project files
COPY src ./src

# Package the Spring Boot application
RUN mvn package -DskipTests

# Use an OpenJDK runtime image to run the app
FROM openjdk:21-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]