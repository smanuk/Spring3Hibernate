package net.service;

import java.util.List;

import net.domain.WeatherForecast;

public interface WeatherService
{
	public List<WeatherForecast> listForcast();
}
