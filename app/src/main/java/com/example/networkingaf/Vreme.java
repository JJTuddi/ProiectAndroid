package com.example.networkingaf;

import com.google.gson.annotations.SerializedName;

public class Vreme {
    @SerializedName("clouds")
    private int clouds;

    @SerializedName("solar_rad")
    private double solarRad;

    @SerializedName("wind_spd")
    private double windSpeed;

    @SerializedName("snow")
    private double snow;

    @SerializedName("uv")
    private double uv;

    @SerializedName("precip")
    private double precip;

    @SerializedName("temp")
    private double temp;

    /*@SerializedName("description")
    private String description;*/

    public int getClouds() {
        return clouds;
    }

    public double getSolarRad() {
        return solarRad;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getSnow() {
        return snow;
    }

    public double getUv() {
        return uv;
    }

    public double getPrecip() {
        return precip;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return String.format("clouds: %d, solarRad: %f, windSpeed: %f, snow: %f, uv: %f, precip: %f, temp: %f", clouds, solarRad, windSpeed, snow, uv, precip, temp);
    }
}
