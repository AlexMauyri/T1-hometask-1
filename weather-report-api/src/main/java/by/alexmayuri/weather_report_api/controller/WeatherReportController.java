package by.alexmayuri.weather_report_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.alexmayuri.weather_report_api.dao.WeatherReportDAO;
import by.alexmayuri.weather_report_api.entity.WeatherReport;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping
@RequiredArgsConstructor
public class WeatherReportController {

    private final WeatherReportDAO weatherReportDAO;

    @GetMapping("/v1/cities/{city}")
    public List<WeatherReport> getWeatherReportsForCity(@PathVariable String city) {
        return weatherReportDAO.findByCityEquals(city);
    }
    
}
