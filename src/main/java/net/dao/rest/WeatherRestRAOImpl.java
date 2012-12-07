package net.dao.rest;

import java.util.List;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import net.domain.WeatherForecast;
import net.domain.WeatherForecasts;

@Repository
public class WeatherRestRAOImpl implements WeatherRestRAO
{
	@Autowired
	RestTemplate restTemplate;
	
	private static final String URL_GET_ALL_FORCASTS =
			"http://free.worldweatheronline.com/feed/weather.ashx?q=London,UK&format=xml&num_of_days=5&key=9f7268d74a031218120412";   

	@Override
	public List<WeatherForecast> listForcasts()
	{
		WeatherForecasts forcasts = new WeatherForecasts();
				
		try
		{
			forcasts = restTemplate.getForObject(URL_GET_ALL_FORCASTS, WeatherForecasts.class);
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			
		}	
		
		return forcasts.getForecasts();
	}
}
