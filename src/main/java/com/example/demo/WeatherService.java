package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

@Service
public class WeatherService {
	
	@Autowired(required=true)
	private RestTemplate restTemplate;

	//Key obtenida por la web, luego de crear una app
    private static final String API_KEY = "L467o4YUYAINeKpd2aSGBblT1qOsczRd";
    private static final String BASE_URL = "http://dataservice.accuweather.com/";
    int locationKey = 4;

    public List<WeatherInfo>  getWeather() { 
    	String url = "http://dataservice.accuweather.com/currentconditions/v1/4";
    	//String url = "http://dataservice.accuweather.com/currentconditions/v1/";
        //HttpURLConnection connection = (HttpURLConnection) url.openConnection();¿
    	URI uri = UriComponentsBuilder.fromUriString(url)
    	        .queryParam("apikey", API_KEY)
    	        .build()
    	        .toUri();
    	String response = restTemplate.getForObject(uri, String.class);
    	// Crear un ObjectMapper para deserializar el JSON
        ObjectMapper objectMapper = new ObjectMapper();

        // Deserializar el JSON en una lista de objetos WeatherInfo
        List<WeatherInfo> weatherInfoList;
        try {
            weatherInfoList = objectMapper.readValue(response,
                    objectMapper.getTypeFactory().constructCollectionType(List.class, WeatherInfo.class));
        } catch (IOException e) {
            // Manejar errores de deserialización
            e.printStackTrace();
            return null;
        }

        return weatherInfoList;
    }
}