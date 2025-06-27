# ------------ BUILD STAGE ------------ #
FROM eclipse-temurin:21-jdk AS builder

# Set working directory
WORKDIR /app

# Copy everything into the container
COPY . .

# Ensure Maven wrapper is executable (important on Linux-based CI like Render)
RUN chmod +x mvnw

# Pre-fetch dependencies (for cache optimization)
RUN ./mvnw dependency:go-offline

# Build the application (without tests for faster CI)
RUN ./mvnw clean package -DskipTests

# ------------ RUNTIME STAGE ------------ #
FROM eclipse-temurin:21-jre AS runner

# Set working directory
WORKDIR /app

# Copy the JAR file from the builder image
COPY --from=builder /app/target/*.jar app.jar

# Expose the internal app port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
