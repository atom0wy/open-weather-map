package pl.atom.weather.OpenWeatherMap.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.atom.weather.OpenWeatherMap.model.WeatherDto;

@Service
@Slf4j
public class WeatherService {

    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "1f4e575432ad9fb7c53fcdd163c1f376";
    private RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getWeather() {
        String response = getWeatherForCity("warszawa");
        log.info(response);
        return null;
    }

    private String getWeatherForCity(String city) {
        return restTemplate.getForObject(WEATHER_URL +
                "weather?q={city}&appid={apiKey}&units=metric&lang=pl", String.class, city, API_KEY);
    }
}
