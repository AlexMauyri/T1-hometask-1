package by.alexmayuri.weather_report_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.alexmayuri.weather_report_api.dao.WeatherReportDAO;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
@RequiredArgsConstructor
public class CityController {
    private final WeatherReportDAO weatherReportDAO;

    @GetMapping("/v1/cities")
    public List<String> getCities() {
        return weatherReportDAO.findDistinctCity();
    }
    
}
