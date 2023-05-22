FROM eclipse-temurin:17-jammy

# Install dependencies
RUN apt-get update && apt-get install -y maven

# Set the working directory
WORKDIR /app

# Copy the application code
COPY . .

# Build the application
RUN mvn clean install -Dmaven.test.skip

# Expose the port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/todolist-1.0.0.jar"]

