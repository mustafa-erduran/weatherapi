package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class WeeklyAndMonthly {

    private Location location;
    private Current current;
    private Forecast forecast;
}
