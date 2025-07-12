package by.alexmayuri.weather_producer.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import by.alexmayuri.weather_producer.weather_report.WeatherReport;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaSender {

    @Value("${spring.kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, WeatherReport> kafkaTemplate;

    public void sendWeatherReportMessage(WeatherReport weatherReport) {
        log.info("Sending weather report: {}", weatherReport);
        kafkaTemplate.send(topic, weatherReport)
        .whenComplete((result, exception) -> {
            if (exception != null) {
                log.info(exception.getMessage());
            }
        });
    }
}
