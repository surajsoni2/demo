# Start with a base image that includes JDK 17 (or your desired version)
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application's JAR file into the container
COPY target/demo.jar /app/application.jar

# Expose the port that your Spring Boot application runs on (default is 8080)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "application.jar"]
