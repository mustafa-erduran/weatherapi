package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
public class Forecast {
    private List<ForecastForecastday> forecastday = null;
}
