package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ForecastAstro {

    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moon_phase;
    private String moon_illumination;

}
