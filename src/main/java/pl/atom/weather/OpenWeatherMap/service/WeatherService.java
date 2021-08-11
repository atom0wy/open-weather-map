package pl.atom.weather.OpenWeatherMap.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.atom.weather.OpenWeatherMap.model.WeatherDto;
import pl.atom.weather.OpenWeatherMap.webclient.weather.WeatherClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherDto getWeather() {
        String response = weatherClient.getWeatherForCity("warszawa");
        log.info(response);
       response = weatherClient.getForecast(52.23, 21.01);
        log.info(response);
        return null;
    }
}
