package pl.atom.weather.OpenWeatherMap.webclient.weather.dto;

import lombok.Getter;

@Getter
public class OpenWeatherMainDto {
    private float temp;
    private int pressure;
    private int humidity;
    private float speed;
}
