package by.alexmayuri.weather_producer.weather_report;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import by.alexmayuri.weather_producer.kafka.KafkaSender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class WeatherReportGenerator { 

    private final KafkaSender kafkaSender;

    @Scheduled(fixedRate = 5000)
    public void generateReport() {
        kafkaSender.sendWeatherReportMessage(WeatherReport.random());
    }
}
