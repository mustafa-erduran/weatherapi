package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Data
public class ForecastDay {

    private BigDecimal maxtemp_c;
    private BigDecimal maxtemp_f;
    private BigDecimal mintemp_c;
    private BigDecimal mintemp_f;
    private BigDecimal avgtemp_c;
    private BigDecimal avgtemp_f;
    private BigDecimal maxwind_mph;
    private BigDecimal maxwind_kph;
    private Integer totalprecip_mm;
    private Integer totalprecip_in;
    private Integer avgvis_km;
    private Integer avgvis_miles;
    private Integer avghumidity;
    private Integer daily_will_it_rain;
    private Integer daily_chance_of_rain;
    private Integer daily_will_it_snow;
    private Integer daily_chance_of_snow;
    private ForecastDayCondition condition;
    private Integer uv;
}
