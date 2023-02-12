package com.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ForecastCondition {

    private String text;
    private String icon;
    private Integer code;

}
