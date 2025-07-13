FROM openjdk:17
WORKDIR /app
COPY target/weather-consumer-0.0.1-SNAPSHOT.jar weather-consumer.jar
ENTRYPOINT [ "java", "-jar", "weather-consumer.jar" ]