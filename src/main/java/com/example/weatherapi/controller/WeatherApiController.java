package com.example.weatherapi.controller;

import com.example.weatherapi.model.Current;
import com.example.weatherapi.model.Daily;
import com.example.weatherapi.model.Forecast;
import com.example.weatherapi.model.WeeklyAndMonthly;
import com.example.weatherapi.service.WeatherApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
public class WeatherApiController {

    @Autowired
    private WeatherApiService weatherApiService;

    @GetMapping("/current")
    public ResponseEntity<Daily> getWeatherReportByCity(@RequestParam String city){
        return ResponseEntity.ok(weatherApiService.getCurrentWeather(city));
    }

    @GetMapping("/forecast")
    public ResponseEntity<WeeklyAndMonthly> getWeatherReportForeCast(@RequestParam String city, @RequestParam Integer days){
        if(days < 0 || days == null){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(weatherApiService.getForecastWeatherReport(city,days));
    }
}
