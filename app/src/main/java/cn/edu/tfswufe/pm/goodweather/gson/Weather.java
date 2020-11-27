package cn.edu.tfswufe.pm.goodweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Author pangmin
 * @Date 2020/11/27 14:42
 **/
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
