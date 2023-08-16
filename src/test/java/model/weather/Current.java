package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JacksonAnnotation;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Current {
    private long dt;
    private long sunrise;
    private long sunset;
    private double temp;

    @JsonProperty("feels_like")
    private double feelsLike;

    private int pressure;
    private int humidity;

    @JsonProperty ("dew_point")
    private double dewPoint;

    private int uvi;
    private int clouds;
    private long visibility;

    @JsonProperty ("wind_speed")
    private double windSpeed;

    @JsonProperty ("wind_deg")
    private double windDeg;

    @JsonProperty ("wind_gust")
    private double windGust;

    @JsonProperty("weather")
    private List<Weather> weathers;

    @JsonProperty("minutely")
    private List<Minutely> minutelies;

    @JsonProperty("hourly")
    private List<Hourly> hourlies;

    @JsonProperty("daily")
    private List<Daily> dailies;

    @JsonProperty("alerts")
    private List<Alerts> alerts;





}
