package com.example.weatherapi.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class Location {

    private String name;
    private String region;
    private String country;
    private BigDecimal lat;
    private BigDecimal lon;
    private String tz_id;
    private Integer localtime_epoch;
    private String localtime;
}
