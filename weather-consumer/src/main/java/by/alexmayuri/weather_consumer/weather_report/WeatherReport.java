package by.alexmayuri.weather_consumer.weather_report;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherReport {
    private Date data;
    private byte temperatureCelcium;
    private WeatherState weatherState;
    private String city;
}
