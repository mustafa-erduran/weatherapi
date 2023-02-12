package com.example.weatherapi.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
public class Daily  {

    private Location location;
    private Current current;

}
