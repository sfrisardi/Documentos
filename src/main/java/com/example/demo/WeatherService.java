package com.example.demo;


import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class WeatherService {

	//Key obtenida por la web, luego de crear una app
    private static final String API_KEY = "L467o4YUYAINeKpd2aSGBblT1qOsczRd";
    private static final String BASE_URL = "http://dataservice.accuweather.com/";

    public String getWeather() { 
        try {
            URL url = new URL(BASE_URL + "currentconditions/v1/?apikey=" + API_KEY + "&locationKey=" + 4);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.disconnect();
            //JSONObject json = new JSONObject(response.toString());
            // Extraer datos del JSON y procesarlos como sea necesario
            // ...
            return "Datos del clima obtenidos";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al obtener datos del clima";
        }
    }
}