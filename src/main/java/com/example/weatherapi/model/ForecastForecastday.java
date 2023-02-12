package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
public class ForecastForecastday {

    private LocalDate date;
    private Integer date_epoch;
    private ForecastDay day;
    private ForecastAstro astro;

    private List<ForecastHour> hour = new ArrayList<>();
}
