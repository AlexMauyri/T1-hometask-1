FROM openjdk:17
WORKDIR /app
COPY target/weather-producer-0.0.1-SNAPSHOT.jar weather-producer.jar
ENTRYPOINT [ "java", "-jar", "weather-producer.jar" ]