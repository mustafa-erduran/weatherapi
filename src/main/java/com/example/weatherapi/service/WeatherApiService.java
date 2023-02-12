package com.example.weatherapi.service;

import com.example.weatherapi.model.Current;
import com.example.weatherapi.model.Daily;
import com.example.weatherapi.model.WeeklyAndMonthly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

    @Value("${api.key}")
    private String apiKey;
    private static final String currentWeatherUrl = "http://api.weatherapi.com/v1/current.json?key=";
    private static final String forecastWeatherUrl = "http://api.weatherapi.com/v1/forecast.json?key=";

    @Autowired
    private RestTemplate restTemplate;

    //private Response prepareResponse();

    public Daily getCurrentWeather(String city){
        String url = currentWeatherUrl+apiKey+"&q="+city;
        Daily daily =  restTemplate.getForObject(url, Daily.class);
        return daily;
    }

    public WeeklyAndMonthly getForecastWeatherReport(String city, Integer days){
        String url = forecastWeatherUrl+apiKey+"&q="+city+"&days="+days;
        WeeklyAndMonthly weeklyAndMonthly = restTemplate.getForObject(url,WeeklyAndMonthly.class);
        return weeklyAndMonthly;
    }
}
