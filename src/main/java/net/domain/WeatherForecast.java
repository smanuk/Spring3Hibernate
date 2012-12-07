package net.domain;

import javax.persistence.Entity;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import java.io.Serializable;

public class WeatherForecast implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5627866514933992001L;
	
	private Long id;
	private LocalDate weatherDate;
	private Integer tempMaxC;
	private Integer tempMaxF;
	private Integer tempMinC;
	private Integer tempMinF;
	private Integer windspeedMiles;
	private Integer windspeedKmph;
	private String windDirection;
	private String winddir16Point;
	private Integer windDirectionDegree;
	private String weatherCode;
	private String weatherIconURL;
	private String weatherDescription;
	private Float precipitationMM;
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public LocalDate getWeatherDate()
	{
		return weatherDate;
	}
	public void setWeatherDate(LocalDate weatherDate)
	{
		this.weatherDate = weatherDate;
	}
	public Integer getTempMaxC()
	{
		return tempMaxC;
	}
	public void setTempMaxC(Integer tempMaxC)
	{
		this.tempMaxC = tempMaxC;
	}
	public Integer getTempMaxF()
	{
		return tempMaxF;
	}
	public void setTempMaxF(Integer tempMaxF)
	{
		this.tempMaxF = tempMaxF;
	}
	public Integer getTempMinC()
	{
		return tempMinC;
	}
	public void setTempMinC(Integer tempMinC)
	{
		this.tempMinC = tempMinC;
	}
	public Integer getTempMinF()
	{
		return tempMinF;
	}
	public void setTempMinF(Integer tempMinF)
	{
		this.tempMinF = tempMinF;
	}
	public Integer getWindspeedMiles()
	{
		return windspeedMiles;
	}
	public void setWindspeedMiles(Integer windspeedMiles)
	{
		this.windspeedMiles = windspeedMiles;
	}
	public Integer getWindspeedKmph()
	{
		return windspeedKmph;
	}
	public void setWindspeedKmph(Integer windspeedKmph)
	{
		this.windspeedKmph = windspeedKmph;
	}
	public String getWindDirection()
	{
		return windDirection;
	}
	public void setWindDirection(String windDirection)
	{
		this.windDirection = windDirection;
	}
	public Integer getWindDirectionDegree()
	{
		return windDirectionDegree;
	}
	public void setWindDirectionDegree(Integer windDirectionDegree)
	{
		this.windDirectionDegree = windDirectionDegree;
	}
	public String getWeatherIconURL()
	{
		return weatherIconURL;
	}
	public void setWeatherIconURL(String weatherIconURL)
	{
		this.weatherIconURL = weatherIconURL;
	}
	public String getWeatherDescription()
	{
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription)
	{
		this.weatherDescription = weatherDescription;
	}
	public Float getPrecipitationMM()
	{
		return precipitationMM;
	}
	public void setPrecipitationMM(Float precipitationMM)
	{
		this.precipitationMM = precipitationMM;
	}
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	public String getWinddir16Point()
	{
		return winddir16Point;
	}
	public void setWinddir16Point(String winddir16Point)
	{
		this.winddir16Point = winddir16Point;
	}
	public String getWeatherCode()
	{
		return weatherCode;
	}
	public void setWeatherCode(String weatherCode)
	{
		this.weatherCode = weatherCode;
	}
	
	public String getDay()
	{
		String day = "EveryDay";
		
		//DateTimeFormatter format = DateTimeFormat.forPattern("E");
		//LocalDate date = format.parseLocalDate(this.weatherDate);
		
		
		return weatherDate.toString("E");
	}
	
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Date: ").append(weatherDate.toString());
		sb.append(", Description: ").append(weatherDescription);
		sb.append(", Icon URL: ").append(weatherIconURL);
		
		return sb.toString();
	}
	
}
