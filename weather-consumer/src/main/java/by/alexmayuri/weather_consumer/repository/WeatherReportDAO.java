package by.alexmayuri.weather_consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.alexmayuri.weather_consumer.weather_report.WeatherReport;

@Repository
public interface WeatherReportDAO extends JpaRepository<WeatherReport, Long>  {

}
