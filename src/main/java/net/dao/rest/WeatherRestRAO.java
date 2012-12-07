package net.dao.rest;

import java.util.List;

import net.domain.WeatherForecast;

public interface WeatherRestRAO
{
	public List<WeatherForecast> listForcasts();
}
