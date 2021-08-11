package pl.atom.weather.OpenWeatherMap.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.atom.weather.OpenWeatherMap.model.WeatherDto;
import pl.atom.weather.OpenWeatherMap.service.WeatherService;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherDto getWeather() {
        return weatherService.getWeather();
    }
}
