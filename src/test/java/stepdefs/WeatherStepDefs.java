package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.weather.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.HashMap;
import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response;

    @Given("city ID is {long}")
    public void set_city_id(long cityId) {
       this.cityId=cityId;
    }

    @When("we are requesting weather forecast")
    public  void requester_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);

    }

    @Then("latitude is {double}")
    public void latitude_check(double latitude) {
        Assertions.assertEquals(latitude, response.getLat(), "Incorrect Latitude!");
    }

    @Then("longitude is {double}")
    public void longitude_check(double longitude) {
        Assertions.assertEquals(longitude,response.getLon(), "Incorrect Longitude!");
    }

    @Then("timezone is {string}")
    public void timezone_check(String timezone) {
        Assertions.assertEquals(timezone, response.getTimezone(), "Incorrect timezone!");
    }

    @Then("timezone offset is {int}")
    public void timezone_offset_check(int offset) {
        Assertions.assertEquals(offset, response.getTimezoneOffset(), "Incorrect offset!");
    }
    @Then("current weather data is:")
    public void current_weather_check(Map<String, String> params) {
        Assertions.assertEquals(Long.parseLong(params.get("dt")),response.getCurrent().getDt(), "Incorrect Date and time!");
        Assertions.assertEquals(Long.parseLong(params.get("sunrise")),response.getCurrent().getSunrise(),"Incorrect sunrise!");
        Assertions.assertEquals(Long.parseLong(params.get("sunset")),response.getCurrent().getSunset(), "Incorrect sunset!");
        Assertions.assertEquals(Double.parseDouble(params.get("temp")),response.getCurrent().getTemp(),"Incorrect temp!");
        Assertions.assertEquals(Double.parseDouble(params.get("feelsLike")),response.getCurrent().getFeelsLike(),"Incorrect FeelLike!");
        Assertions.assertEquals(Long.parseLong(params.get("pressure")),response.getCurrent().getPressure(),"Incorrect pressure!");
        Assertions.assertEquals(Long.parseLong(params.get("humidity")),response.getCurrent().getHumidity(),"Incorrect humidity!");
        Assertions.assertEquals(Double.parseDouble(params.get("dewPoint")),response.getCurrent().getDewPoint(),"Incorrect dewPoint!");
        Assertions.assertEquals(Double.parseDouble(params.get("uvi")),response.getCurrent().getUvi(),"Incorrect uvi!");
        Assertions.assertEquals(Long.parseLong(params.get("clouds")),response.getCurrent().getClouds(),"Incorrect clouds!");
        Assertions.assertEquals(Long.parseLong(params.get("visibility")),response.getCurrent().getVisibility(),"Incorrect visibility!");
        Assertions.assertEquals(Double.parseDouble(params.get("windSpeed")),response.getCurrent().getWindSpeed(),"Incorrect windSpeed!");
        Assertions.assertEquals(Long.parseLong(params.get("windDeg")),response.getCurrent().getWindDeg(),"Incorrect windDeg!");
        Assertions.assertEquals(Double.parseDouble(params.get("windGust")),response.getCurrent().getWindGust(),"Incorrect WindGust!");





//        Map<String, String> parameters = new HashMap<>();
//        parameters.put("FirstKey", "FirstValue");
//        parameters.put("SecondKey", "SecondValue");
//        parameters.put("FirstKey", "AnotherFirstValue");

    }
}
