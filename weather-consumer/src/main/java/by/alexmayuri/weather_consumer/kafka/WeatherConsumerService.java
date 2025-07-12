package by.alexmayuri.weather_consumer.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import by.alexmayuri.weather_consumer.weather_report.WeatherReport;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WeatherConsumerService {

    @KafkaListener(topics = "weather", groupId = "weather-consumers")
    public void onMessage(ConsumerRecord<String, WeatherReport> consumerRecord) {
        log.info("Consumer record: {}", consumerRecord);
    }
}
