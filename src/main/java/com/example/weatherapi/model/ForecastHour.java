package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class ForecastHour {

    private Integer time_epoch;
    private String time;
    private BigDecimal temp_c;
    private BigDecimal temp_f;
    private Integer is_day;
    private ForecastCondition condition;
    private BigDecimal wind_mph;
    private BigDecimal wind_kph;
    private Integer wind_degree;
    private String wind_dir;
    private Integer pressure_mb;
    private BigDecimal pressure_in;
    private Integer precip_mm;
    private Integer precip_in;
    private Integer humidity;
    private Integer cloud;
    private BigDecimal feelslike_c;
    private BigDecimal feelslike_f;
    private BigDecimal windchill_c;
    private BigDecimal windchill_f;
    private BigDecimal heatindex_c;
    private BigDecimal heatindex_f;
    private BigDecimal dewpoint_c;
    private BigDecimal dewpoint_f;
    private Integer will_it_rain;
    private Integer chance_of_rain;
    private Integer will_it_snow;
    private Integer chance_of_snow;
    private Integer vis_km;
    private Integer vis_miles;
    private Integer gust_mph;
    private BigDecimal gust_kph;
    private Integer uv;
}
