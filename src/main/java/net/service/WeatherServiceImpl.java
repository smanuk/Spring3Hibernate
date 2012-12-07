package net.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import net.dao.rest.WeatherRestRAO;
import net.domain.WeatherForecast;

@Service
public class WeatherServiceImpl implements WeatherService
{
	@Autowired
	private WeatherRestRAO weatherRestRAO;

	@Override
	@Transactional(readOnly=true)
	public List<WeatherForecast> listForcast()
	{
		List<WeatherForecast> forecasts;

		forecasts = weatherRestRAO.listForcasts();
		
		return forecasts;
	}
}
