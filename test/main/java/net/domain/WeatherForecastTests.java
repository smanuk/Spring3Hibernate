package net.domain;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class WeatherForecastTests
{
	private static WeatherForecast FORECAST;
	
	@BeforeClass
	public static void setupClass()
	{
		FORECAST = new WeatherForecast();
	}
	
	@Test
	public void setAndGetID()
	{
		Long id = 15L;
		assertNull(FORECAST.getId());
		FORECAST.setId(id);
		assertEquals(id, FORECAST.getId());
	}
	
	@Test
	public void setAndGetWeatherDate()
	{
		LocalDate dateTime = new LocalDate();
		assertNull(FORECAST.getWeatherDate());
		FORECAST.setWeatherDate(dateTime);
		assertSame(dateTime, FORECAST.getWeatherDate());
	}
	
	@Test
	public void setAndGetTempMaxC()
	{
		Integer tempMaxC = 15;
		assertNull(FORECAST.getTempMaxC());
		FORECAST.setTempMaxC(tempMaxC);
		assertEquals(tempMaxC.intValue(), FORECAST.getTempMaxC().intValue());
	}	
	
	@Test
	public void setAndGetTempMaxF()
	{
		Integer tempMaxF = 100;
		assertNull(FORECAST.getTempMaxF());
		FORECAST.setTempMaxF(tempMaxF);
		assertEquals(tempMaxF.intValue(), FORECAST.getTempMaxF().intValue());
	}
	
	@Test
	public void setAndGettempMinC()
	{
		Integer tempMinC = 45;
		assertFalse(true);
	}
	
	@Test
	public void setAndGetTempMinF()
	{
		Integer tempMinF = 32;
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWindspeedMiles()
	{
		Integer windspeedMiles = 20;
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWindspeedKmph()
	{
		Integer windspeedKmph = 5;
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWindDirection()
	{
		String windDirection = "NNW";
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWinddir16Point()
	{
		String winddir16Point = "SW";
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWindDirectionDegree()
	{
		Integer windDirectionDegree = 280;
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWeatherCode()
	{
		String weatherCode = "yyy";
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWeatherIconUrl()
	{
		String weatherIconURL = "http://someurl.com";
		assertFalse(true);
	}
	
	@Test
	public void setAndGetWeatherDescription()
	{
		String weatherDescription = "Sunny";
		assertFalse(true);
	}
	
	@Test
	public void setAndGetPrecipitationMM()
	{
		Float precipitationMM = 11.5f;
		assertFalse(true);
	}
}
