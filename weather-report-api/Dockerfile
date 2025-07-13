FROM openjdk:17
WORKDIR /app
COPY target/weather_report_api-0.0.1-SNAPSHOT.jar weather_report_api.jar
ENTRYPOINT [ "java", "-jar", "weather_report_api.jar" ]