package by.alexmayuri.weather_producer.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import by.alexmayuri.weather_producer.weather_report.WeatherReport;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class KafkaSender {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendWeatherReportMessage(WeatherReport weatherReport) {
        log.info("Sending weather report: {}", weatherReport);
        kafkaTemplate.send("weather", weatherReport.toString());
    }
}
