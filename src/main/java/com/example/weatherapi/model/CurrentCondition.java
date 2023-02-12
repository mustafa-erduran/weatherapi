package com.example.weatherapi.model;

import lombok.*;

@Data
@Getter
@Setter
public class CurrentCondition {

    private String text;
    private String icon;
    private Integer code;
}
