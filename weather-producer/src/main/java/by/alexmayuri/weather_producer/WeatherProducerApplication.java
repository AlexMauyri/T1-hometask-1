package by.alexmayuri.weather_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherProducerApplication.class, args);
	}

}
