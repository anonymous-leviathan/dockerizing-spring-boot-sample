# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the project’s jar file into the container at /app
# add your jar name in to the pom.xml file like this
# <finalName>spring-boot-docker-demo-0.0.1-SNAPSHOT</finalName>
COPY target/spring-boot-docker-demo-0.0.1-SNAPSHOT.jar /app/spring-boot-docker-demo.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "spring-boot-docker-demo.jar"]