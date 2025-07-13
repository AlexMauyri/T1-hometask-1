package by.alexmayuri.weather_report_api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import by.alexmayuri.weather_report_api.entity.WeatherReport;


@Repository
public interface WeatherReportDAO extends JpaRepository<WeatherReport, Long>  {
    List<WeatherReport> findByCityEquals(String city);

    @Query("SELECT DISTINCT wr.city FROM WeatherReport wr")
    List<String> findDistinctCity();
}
