package by.alexmayuri.weather_producer.weather_report;

import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

import lombok.Data;

@Data
public class WeatherReport {
    private final Date data;
    private final byte temperatureCelcium;
    private final WeatherState weatherState;
    private final String city;

    public static WeatherReport random() {
        Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
        Date randomDate = faker.date().future(100, TimeUnit.SECONDS);
        byte randomTemperature = (byte) faker.number().numberBetween(0, 35);
        WeatherState randomWeatherState = faker.options().option(WeatherState.class);
        String randomCity = faker.address().city();

        return new WeatherReport(randomDate, randomTemperature, randomWeatherState, randomCity);
    }
}
