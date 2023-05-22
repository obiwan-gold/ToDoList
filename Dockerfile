FROM openjdk:17.0.6

WORKDIR /app

# Copy the application code and pom.xml file
COPY . .

# Install Maven and build the application
RUN apt-get update && \
    apt-get install -y maven && \
    mvn clean package -DskipTests

# Exclude Lombok during the build
RUN mvn clean install -Dmaven.test.skip=true

EXPOSE 8080

# Healthcheck to ensure container is healthy
HEALTHCHECK --interval=30s --timeout=5s \
  CMD wget -qO- http://localhost:8080/actuator/health || exit 1

CMD ["java", "-jar", "target/todolist.jar"]
