FROM amazoncorretto:17.0.12 AS build
WORKDIR /app
COPY . .
RUN ./gradlew build

# Runtime stage
FROM amazoncorretto:17.0.12 AS runtime
WORKDIR /app
COPY --from=build /app/build/libs/*.jar /app/server.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/server.jar"]