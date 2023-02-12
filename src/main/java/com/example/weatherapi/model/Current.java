package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class Current {

    private Integer last_updated_epoch;
    private String last_updated;
    private BigDecimal temp_c;
    private BigDecimal temp_f;
    private Integer is_day;
    private CurrentCondition condition;
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
    private Integer feelslike_c;
    private BigDecimal feelslike_f;
    private Integer vis_km;
    private Integer vis_miles;
    private Integer uv;
    private BigDecimal gust_mph;
    private BigDecimal gust_kph;
}
