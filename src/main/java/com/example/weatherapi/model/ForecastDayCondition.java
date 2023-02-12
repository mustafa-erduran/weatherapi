package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ForecastDayCondition {

    private String text;
    private String icon;
    private Integer code;
}
